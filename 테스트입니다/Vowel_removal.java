package LV0.Date20230702;
//제목 : 모음 제거
//내용 : 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

//입출력 예 #1) "bus"에서 모음 u를 제거한 "bs"를 return합니다.
//입출력 예 #2) "nice to meet you"에서 모음 i, o, e, u를 모두 제거한 "nc t mt y"를 return합니다.
public class Vowel_removal {
    // 내 풀이
	public String solution(String my_string) {
        String[] str = {"a", "e", "i", "o", "u"};
        
        for(String arr : str){
            my_string = my_string.replace(arr, "");
        }
        
        return my_string;
    }
	
	// 다른 사람 풀이
	// my_string.replaceAll("[aeiou]", "");
	// myString.replaceAll("a|e|i|o|u", "");
	// my_string.replaceAll("[a,e,i,o,u]","");
	
	// 속도는 [aeiou]가 제일 빠르다.
	
}
>>>>????
