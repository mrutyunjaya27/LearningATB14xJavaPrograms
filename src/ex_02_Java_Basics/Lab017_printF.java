package ex_02_Java_Basics;

public class Lab017_printF {

	public static void main(String[] args) {
		 
int a=10;
int b=20;
/*
 * System.out.println(a); //10
 * System.out.println(b); // 20
 */
/*
 * System.out.print(a); 
 * System.out.print(b); //1020
 */
   System.out.printf("Value of a = %d",a);
   System.out.println();
   System.out.printf("Value of b = %d",b);
   
   //%d -> int, byte, long, short, -data type
   //%s -> String
   //%f -> float, double
   //%b -> boolean
	}

}
