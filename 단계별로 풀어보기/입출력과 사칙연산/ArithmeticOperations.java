package y20241107;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 사칙연산

public class ArithmeticOperations {

	public static void main(String[] args) {
		
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
			
			String arr[] = reader.readLine().split(" ");
			
			System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
			System.out.println(Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]));
			System.out.println(Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]));
			System.out.println(Integer.parseInt(arr[0]) / Integer.parseInt(arr[1]));
			System.out.println(Integer.parseInt(arr[0]) % Integer.parseInt(arr[1]));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
