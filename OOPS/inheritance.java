public class inheritance {
    public static void  main(String[] args){
        // Fish whale = new Fish();
        // whale.eats();

        Dogs Tommy = new Dogs();
        Tommy.eats();
        Tommy.legs = 4;
        System.out.println(Tommy.legs);
    }
}

// Base Class
class Animal{
    String color;

    void eats(){
        System.out.println("eats");
    }
    void breathes(){
        System.out.println("breathes");
    }
}

class Mammal extends  Animal{
    int legs;
}

class Dogs extends Mammal{
    String breed ;
}


// Derived Class
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swims in water");
//     }
// }