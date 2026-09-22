
public class contructor {
    public static void main(String[] args) {
        Student std1 = new Student();
        // Student std2 = new Student("Dushyant");
        // Student std3 = new Student(1242);
        // System.out.println(std1.name);
        // System.out.println(std3.rollno);

        std1.name = "Dushyant Rawat";
        std1.rollno = 20;
        std1.password = "wbei";
        // Student std2 = new Student(std1);
        // std2.password = "szdc";
    }
}

class Student {
    String name;
    int rollno;
    String password;
    int marks[];

    Student(Student std1){
        this.name = std1.name;
        this.rollno = std1.rollno;
    }
    // Student(){
    //     System.out.println("Constructor is called......");
    // }
    // Student(String name){
    //     this.name = name;
    // }
    // Student(int rollno){
    //     this.rollno = rollno;
    // }
}