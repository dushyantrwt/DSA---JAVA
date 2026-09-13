
public class contructor {
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student("Dushyant");
        Student std3 = new Student(1242);
        System.out.println(std2.name);
        System.out.println(std3.rollno);
    }
}

class Student{
    String name;
    int rollno;

    Student(){
        System.out.println("Constructor is called......");
    }
    Student(String name){
        this.name = name;
    }
    Student(int rollno){
        this.rollno = rollno;
    }
}