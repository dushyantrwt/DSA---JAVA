public class practiceQuestions {
    public static void main(String[] args) {
        int a = 10, b = 6;
        // Question2(a);
        Question4();
        // Question1(a, b);
    }

    public static void Question2(int a, int b) {
        System.out.println("Before Swapping Values " + a + "," + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping Values " + a + "," + b);
    }
    public static void Question3(int n) {
        int x=n;
        System.out.println(x+" + "+1+" is "+~x);
        x= -4;
        System.out.println(x+" + "+1+" is "+-~x);
        x=0;
        System.out.println(x+" + "+1+" is "+-~x);
    }
    public static void Question4() {
        for(char ch = 'A'; ch <='Z'; ch++ ){
            System.out.print((char) (ch | ' '));
        }
    }
}