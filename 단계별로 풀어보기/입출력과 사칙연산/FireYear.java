package y20241107;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 불기연도 - 서기연도 계산

public class FireYear {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
			
			String s = reader.readLine();
			
			System.out.println(Integer.parseInt(s) - 543);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
