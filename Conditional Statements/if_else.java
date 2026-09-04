import java.util.*;

public class if_else {
    public static void main(String args[]) {
        int age = 13;
        if (age >= 18) {
            System.out.println("Adult");
        }
        if (age >=13 && age < 18) {
            System.out.println("Teenager");
        }
        if (age < 13) {
            System.out.println("Not adult");
        }
    }
}
