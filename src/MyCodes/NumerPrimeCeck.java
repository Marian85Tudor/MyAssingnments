package MyCodes;
import java.util.Scanner;
public class NumerPrimeCeck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");

        int number = scanner.nextInt();
        int count =0;
        // Used the for Loop to iterate and check  if the number is Prime or not

        for (int i = 1;i<=number;i++){
            if (number%i==0){
                count++;// number of divisors found


            }//Print the number is Prime or not
        }if (count==2){
            System.out.println(number+ " is a Prime number");
        }else {
            System.out.println(number + " is not a Prime number");
        }
    }
}
