import java.util.*;

public class circle_area {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        float radius = sc.nextFloat();
        float pie = 3.14f;
        float area = radius * radius * pie;
        System.out.println(area);
    }
}
