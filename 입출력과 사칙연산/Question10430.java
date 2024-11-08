package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question10430 {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
			
			String arr[] = reader.readLine().split(" ");

			//첫째 줄에 (A+B)%C,
			// 둘째 줄에 ((A%C) + (B%C))%C,
			// 셋째 줄에 (A×B)%C,
			// 넷째 줄에 ((A%C) × (B%C))%C를 출력

			System.out.println((Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])) % Integer.parseInt(arr[2]));
			System.out.println((Integer.parseInt(arr[0]) % Integer.parseInt(arr[2]) + (Integer.parseInt(arr[1]) % Integer.parseInt(arr[2]))) % Integer.parseInt(arr[2]));
			System.out.println((Integer.parseInt(arr[0]) * Integer.parseInt(arr[1])) % Integer.parseInt(arr[2]));
			System.out.println((Integer.parseInt(arr[0]) % Integer.parseInt(arr[2]) * (Integer.parseInt(arr[1]) % Integer.parseInt(arr[2]))) % Integer.parseInt(arr[2]));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
