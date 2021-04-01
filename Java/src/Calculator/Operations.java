package Calculator;
import java.util.Scanner;
public class Operations {
	public static void main(String[] args) {
	int a, b, c;
	int sum= 0;
	Scanner s= new Scanner(System.in);
	System.out.print("Enter your choice:");
	c= s.nextInt();
	System.out.print("Enter first number:");
	a= s.nextInt();
	System.out.print("Enter second number:");
	b= s.nextInt();
	switch(c)
	{
	case 1: sum= a + b;
			break;
	case 2: sum = a - b;
			break;
	case 3: sum = a * b;
			break;
	case 4: sum = a / b;
			break;
	case 5: sum = a % b;
			break;
	default: System.out.println("Invalid choice");
			break;
	}
	System.out.println(sum);
	}
}
