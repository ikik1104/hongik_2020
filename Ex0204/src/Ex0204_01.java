import java.util.Scanner;

public class Ex0204_01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		
		int total = scan.nextInt();
		String grade = "";
		
		/*
		
		if(total >= 90) { //A+ 98, 97-95, A- 90-94
			grade = "A";
			if (total >= 95) {
				grade += "+"; 
//				grade = grade + "+"; 
			}else {
				grade += "-";
			}
		}else if (total >= 80) {
				grade = "B";
			if (total >= 85) {
				grade += "+"; 
			}else {
				grade += "-";
			}
		}else if (total >= 70) {
				grade = "C";
			if (total >= 70) {
				grade += "+";
			}else {
				grade += "-";
			}
		}else if (total >= 60) {
				grade = "D";
			if (total >= 65) {
				grade += "+";
			}else {
				grade += "-";
			}
		}else {
			grade = "F";
		}
		
		System.out.printf("당신의 성적은 : %s ", grade);
		
		*/
		
		if(total >= 90) { //A+ 98, A 97-95, A- 90-94
			grade = "A";
			if (total >= 98) {
				grade += "+"; 
			}else if(total <= 94){
				grade += "-";
			}
		}else if (total >= 80) {
			grade = "B";
			if (total >= 88) {
				grade += "+";
			}else if (total <= 84) {
				grade += "-";
			}
		}else if (total >= 70) {
			grade = "C";
			if (total >= 78) {
				grade += "+";
			}else if (total <= 74) {
				grade += "-";
			}
		}else if (total >= 60) {
			grade = "D";
			if (total >= 68) {
				grade += "+";
			}else if (total <= 64) {
				grade += "-";
			}
		}else {
			grade = "F";
		}
		
		System.out.printf("당신의 성적은 : %s ", grade);
		
		
		
		
	}
}
