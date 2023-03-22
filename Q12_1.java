import java.util.Scanner;

public class Q12_1 {
   public static void main(String[] args) {
	   
	   Scanner scanner=new Scanner(System.in);
	   
	   System.out.print("연산>> ");
	   int number1=scanner.nextInt();
	   String sign=scanner.next();
	   int number2=scanner.nextInt();
	   
	   System.out.print(number1+sign+number2+"의 계산 결과는 ");
	   if(sign.equals("+"))
		   System.out.print(number1+number2);
	   else if(sign.equals("-"))
		   System.out.print(number1-number2);
	   else if(sign.equals("*"))
		   System.out.print(number1*number2);
	   else if(sign.equals("/"))
	   {
		   if(number2==0)
			   System.out.println("0으로 나눌 수 없습니다. ");
		   else
			   System.out.print((double)number1/(double)number2);		   
	   }
	   
	   scanner.close();
   }
}
