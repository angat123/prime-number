import java.util.Scanner;

public class Primenumber {

 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  		int number;

  System.out.println("Enter the number:");
  number = input.nextInt();

  int i;
  boolean isPrime = true;
  if(number==0 || number==1){
	  isPrime = false;
	  }
	else{
	  for(i=2; i<number%2; i++) {
	   int rem;
	   rem = number% i;
	   System.out.println(number + " % " + i + " = "+ rem);
	   if(rem==0) {
		isPrime = false;
		break;
	   }
	  }
	}
  if (isPrime) {
   System.out.println(number + " is prime.");
  }
  else {
   System.out.println(number + " is not prime");
  }

 }

}