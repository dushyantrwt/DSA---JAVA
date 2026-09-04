
public class callbyvalue {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // int product = multiply(5,9);
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);
        // System.out.println("Product = " + product);
        // product = multiply(1,9);
        // System.out.println("Product = " + product);
        // int fact = factorial(5);
        // System.out.println(fact);
        // fact = factorial(6);
        int binomialCoff = binomial_Coff(a, b);
        System.out.println(binomialCoff);
    }

    public static void swap(int a , int b){
        int temp = a;
        a=b;
        b=temp;
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);
    }

    public static int multiply(int a , int b){
        int multiply = a * b;
        return multiply;
    }

    public static int factorial (int a){
        int fact = 1;
        for(int i = 1; i<=a; i++ ){
            fact = i*fact;
        }
        return fact;
    }
    public static int binomial_Coff(int n , int r ){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int binomialCoff=n_fact/(r_fact*nmr_fact);
        return binomialCoff;
    }
}
