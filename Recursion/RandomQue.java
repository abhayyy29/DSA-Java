import java.util.Scanner;

public class RandomQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many Student you want to put");
        int students = sc.nextInt();
        String name;
        int age,rollno;
        for(int i =0; i<students;i++){

            System.out.println("Enter Name");
            name = sc.next();
            System.out.println("Enter Age");
            age = sc.nextInt();
            System.out.println("Enter Rollno");
            rollno = sc.nextInt();
        
            System.out.println("Name:" + name);
            System.out.println("Age" + age);
            System.out.println("Roll No:" + rollno);
        }
        sc.close();
        
    }
}

