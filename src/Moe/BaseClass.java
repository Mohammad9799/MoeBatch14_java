package Moe;

import java.util.ArrayList;

public class BaseClass {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.firstName = "Mohammad";
        s1.lastName = "Hussein";
        s1.age = 22;
        s1.isActive = true;

        Student s2 = new Student();
        s2.firstName = "Omar";
        s2.lastName = "Hussein";
        s2.age = 8;
        s2.isActive = false;

        Student s3 = new Student();
        s3.firstName = "Mohannad";
        s3.lastName = "Hussein";
        s3.age = 21;
        s3.isActive = false;

        ArrayList<Student> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);
        students.add(s2);

        for(Student student : students){
            if (student.isActive){
                student.info();

            }
        }

//        System.out.println(s1.isActive);
//        System.out.println(s2.isActive);


    }
}
