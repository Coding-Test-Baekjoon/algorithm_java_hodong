package y202411.d24;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question5622 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strArr = reader.readLine().split("");

            int totalTime = 0;
            for (int i = 0; i < strArr.length; i++){
                totalTime += secondDialing(strArr[i]);
            }

            System.out.println(totalTime);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int secondDialing(String str){

        switch (str){
            case "A": case "B": case "C":
                return 3;
            case "D": case "E": case "F":
                return 4;
            case "G": case "H": case "I":
                return 5;
            case "J": case "K": case "L":
                return 6;
            case "M": case "N": case "O":
                return 7;
            case "P": case "Q": case "R": case "S":
                return 8;
            case "T": case "U": case "V":
                return 9;
            case "W": case "X": case "Y": case "Z":
                return 10;
        }

        return 2;
    }
}
