import java.util.*;
public class program1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Input first number:");
		int a=sc.nextInt();
		System.out.println("Input second number:");
		int b=sc.nextInt();
		System.out.println("Input third number:");
		int c=sc.nextInt();
		System.out.println("Input fourth number:");
		int d=sc.nextInt();
		if(a==b){
			if(b==c){
				if(c==d){
					System.out.println("All four are equal");
}}}
		else
		System.out.println("All are not equal");
		//Using Array
*/
		int a[]=new int[4];
		int flag=0;
		for(int i=0;i<4;i++){
			System.out.println("Input  number:");
			a[i]=sc.nextInt();}
		for(int i=0;i<3;i++){
			if(a[i] != a[i+1]){
				flag=1;
				break;}
			else{
				continue;}
}
		if(flag==1)
			System.out.println("All are not equal");
		else
			System.out.println("All are  equal");			
}
}

