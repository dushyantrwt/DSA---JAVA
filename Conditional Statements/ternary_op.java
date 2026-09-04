import java.util.*;

public class ternary_op {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();
        
        String reportCard = (marks>=33) ? "pass":"fail";
        System.out.println(reportCard);
    }
}