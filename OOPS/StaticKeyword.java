public class StaticKeyword {
    public static void main(String[] args) {
        Student s1  = new Student();
        s1.schoolName = "KRSD";
        Student s2  = new Student();
        System.out.println(s2.schoolName);
        s2.schoolName = "weaerd";
        System.out.println(s2.schoolName);
        System.out.println(s1.schoolName);


    }
}

class Student{
    String name;
    int rollno;
    static String schoolName;

    void setname(String name){
        this.name = name;
    }
    String getname(){
        return this.name;
    }
}