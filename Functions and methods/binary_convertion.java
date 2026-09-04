import java.util.*;

public class binary_convertion {
    public static void main(){
        // binaryConversion(1111);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no tu convert Decimal to Binary: ");
        int n = sc.nextInt();
        decimalConversion(n);
    }

    public static void binaryConversion(int BinNum){
        int pow = 0;
        int dec = 0;
        while (BinNum > 0){
            int LD = BinNum % 10;
            dec = dec + (LD* (int)Math.pow(2, pow));
            pow++;
            BinNum = BinNum / 10;
        }
        System.out.println(dec);
    }

    public static void decimalConversion(int n){
        int mynum = n;
        int remender = 0;
        int pow = 0;
        int binNum=0;
        while (n>0){
            remender = n % 2;
            binNum = binNum + (remender *(int) Math.pow(10, pow));
            pow++;
            n= n/2;
        }
        System.out.println("Binary convertion of " + mynum + " is " + binNum);
    }
}
