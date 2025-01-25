package y20241107;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 해당 아이디가 사이트에 존재하에 ??! 추가

public class Joonas {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
			
			String s = reader.readLine();
			
			if(s.equals(s)) {
				System.out.println(s + "??!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
