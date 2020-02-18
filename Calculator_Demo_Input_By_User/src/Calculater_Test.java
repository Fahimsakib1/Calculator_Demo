import java.util.Scanner;
public class Calculater_Test 

{

	public static void main(String[] args) 
	{
		Calculator calculation = new Calculator();
		
		Scanner item = new Scanner (System.in);
		
		System.out.print("Take 1st Input  : ");
		int number1 =item.nextInt();
		
		System.out.print("Take 2nd Input  : ");
		int number2 =item.nextInt();
		
		int result1 = calculation.add(number1, number2);
		int result2 = calculation.sub(number1, number2);
		int result3 = calculation.multi(number1, number2);
		int result4 = calculation.div(number1, number2);
		
		System.out.println("Addition is  : " +result1);
		System.out.println("Subtraction is  : " +result2);
		System.out.println("Multiplication Is  : " +result3);
		System.out.println("Division is  : " +result4);
		
		
		System.out.print("Input your Salary Please  : ");
		double number3 = item.nextDouble();
		
		Tax Cal = new Tax();
		double result5 = Cal.salary(number3);
		
		System.out.print("Your Tax Payable Is   : " +result5+ " Taka ");
		
		
		}

}
