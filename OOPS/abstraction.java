public class abstraction {
    public static void main(String[] args) {
        Mustang mustang  = new Mustang();
    }
}

abstract class Animal {
    String color;

    Animal(){
        System.out.println("Animal constructor called...");
    }
    void eats(){
        System.out.println("Eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called...");
    }
    void changeColor(){
        color = "Dark Brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called...");
    }
}
class Chiken extends Animal{
    void changeColor(){
        color = "Reddish";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}