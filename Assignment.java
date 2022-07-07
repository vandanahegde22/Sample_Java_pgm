import java.util.*;
public class Assignment{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks: ");
		int marks = sc.nextInt();
		//checking the grade
		if(marks<50) {
			System.out.print("FAIL");
		}
		else if(marks>=50 && marks<60){
			System.out.print("D Grade");
		}
		else if(marks>=60 && marks<70){
			System.out.print("C Grade");
		}
		else if(marks>=70 && marks<80){
			System.out.print("B Grade");
		}
		else if(marks>=80 && marks<90){
			System.out.print("A Grade");
		}
		else if(marks>=90 && marks<100){
			System.out.print("A+ Grade");
		} else {
			System.out.println("Invalid");
	}
}
}