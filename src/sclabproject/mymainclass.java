package sclabproject;
import java.util.Scanner;
public class mymainclass {

	public static void main(String[] args) {
		 int x, y, z;
	      System.out.println("Enter two integers to calculate their sum ");
	      Scanner pt = new Scanner(System.in);
	      x = pt.nextInt();
	      y = pt.nextInt();
	      z = x + y;
	      System.out.println("Sum of entered integers = "+z);	

	}

}
