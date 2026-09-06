

public class Bitwiseoperator {
    public static void main(String args[]){
        int a=5 , b=6;
        int n =909090000;
        // System.out.println(a & b); // Binary AND
        // System.out.println(a | b);// Binary OR
        // System.out.println(a ^ b);// Binary XOR
        // System.out.println(~a);// Binary one's Compliment 
        // System.out.println(5<<2);// Binary left shift
        // System.out.println(6>>1);// Binary left shift
        // oddOReven(n);
        // getIthBit(15, 2);
        // System.out.println(setIthBit(10, 2));
        // System.out.println(clearIthBit(10, 3));
        // System.out.println(updateIthBit(10, 2, 1));
        // System.out.println(clearLastIthBit(15, 2));
        System.out.println(clearRangeOfBits(10, 2, 4));
    }

    public static void oddOReven(int n){
        int bitMask = 1;
        if((n & bitMask) == 1){
            System.out.println(n + " is a odd number");
        }
        else{
            System.out.println(n + " is a even number");
        }
    }

    public static void getIthBit(int n, int i){
        int bitMask = (1<<i);
        if((n & bitMask) == 0){
            System.out.println(i + "th bit is 0");
        }
        else{
            System.out.println(i + "th bit is 1");
        }
    }
    public static int setIthBit(int n, int i){
        int bitMask = (1<<i);
        return (n | bitMask);
    }
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return (n & bitMask);
    }
    public static int updateIthBit(int n, int i, int newbit){
        // if(newbit == 0){
        //     return clearIthBit(n,i);
        // }else{
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitmask = newbit << i;
        return n | bitmask;
    }

    public static int clearLastIthBit(int n , int i){
        int bitmask  = (~0) << i;
        return n & bitmask;
    }

    public static int clearRangeOfBits(int n , int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i) - 1;
        int bitmask  = a | b;
        return n & bitmask;
    }

}
