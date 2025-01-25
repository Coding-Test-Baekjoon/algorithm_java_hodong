package y202411.d27;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question25206 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            double subjectTotal = 0.0;
            double gradeTotal = 0.0;

            for (int i = 0; i < 20; i++){
                String[] strArr = reader.readLine().split(" ");

                if(!strArr[2].equals("P")){
                    double grade = Double.parseDouble(strArr[1]);
                    gradeTotal += grade;
                    subjectTotal += grade * gpa(strArr[2]);
                }

            }

            System.out.println(String.format("%.6f", subjectTotal/gradeTotal));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static double gpa(String gradePoint){

        switch (gradePoint){
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F":
                return 0.0;
        }


        return 0.0;
    }

}
