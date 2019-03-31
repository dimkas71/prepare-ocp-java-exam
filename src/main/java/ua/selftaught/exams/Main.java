package ua.selftaught.exams;

public class Main {

	public static void main(String[] args) {
		
		String A$B = "abc";
		String s2 = new String("abc");
		
		if (A$B == s2) 
			System.out.print(1);
		else 
			System.out.println(2);
		
		if (A$B.equals(s2))
			System.out.println(3);
		else
			System.out.println(4);
		
	}

}
