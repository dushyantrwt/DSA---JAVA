

public class polymorphism {
    public static void main(String[] args) {
        // Calculator cal = new Calculator(); 
        // System.out.println(cal.sum(1, 2));
        // System.out.println(cal.sum(1.5, 2.5));
        // System.out.println(cal.sum(1,2,3));

        Deer deer = new Deer();
        deer.eat();
    }
}
// Method Overloading
class Calculator{
    int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    int sum(int a, int b,int c){
        int sum = a+b+c;
        return sum;
    }
    double sum(double a, double b){
        double sum = a+b;
        return sum;
    }
}



// Method Overriding
class Animal{
    void eat(){
        System.out.println("Eats everything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}