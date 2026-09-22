public class Enheritance {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Black");
        System.out.println(p1.getColor());

        BankAccount myAcc = new BankAccount();
        myAcc.name="Riyanshi";
        System.out.println(myAcc.name);
        myAcc.setPassword("jbhibv");
        myAcc.showPassword();

    }
}



class BankAccount{
    public String name;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
    public void showPassword(){
        System.out.println(password);
    }
}

class Pen{
    private String color;
    private int tip;

    void setColor(String newcolor){
        color = newcolor;
    }
    void setTip(int newtip){
        tip = newtip;
    }
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}
