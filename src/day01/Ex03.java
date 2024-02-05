package day01;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(100+100);
		System.out.println(1.123+3.456);
		System.out.println(1.123+3.456);
		System.out.println("안녕"+"하세요");
		System.out.println("100" + "200"); //""안의 숫자 = 문자
		System.out.println("100" + 200);
		System.out.println("안녕"+ 100 + 100); // 문자 + 숫자 = 문자 (연산자 우선순위 문자>숫자)
		System.out.println("안녕" + (100+100));
	}
}

