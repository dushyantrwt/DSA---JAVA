import java.util.*;

public class income_tax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income : ");
        int income = sc.nextInt();
        float tax = 0;
        // int b = sc.nextInt();
        if(income <= 500000){
            System.out.println("You do not need to pay any tax");
        }else if(income > 500000 && income <= 1000000){
            tax = income*0.2f;
            System.out.println("Your tax will be " + tax);
            System.out.println("Your income after deduction " + (income - tax));
        }
        else if (income > 1000000){
            tax = income*0.3f;
            System.out.println("Your tax will be " + tax);
            System.out.println("Your income after deduction " + (income - tax));
        }
        }
    }