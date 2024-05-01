// Class representing a Student with attributes roll, name, and marks
class Student{
    int roll; // roll number of the student
    String name; // name of the student
    int marks; // marks obtained by the student
}

public class ArrayObjects {
    public static void main(String[] args) {
        // Creating Student objects s1, s2, and s3
        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Aman";
        s1.marks = 90;

        Student s2 = new Student();
        s2.roll = 2;
        s2.name = "Amani";
        s2.marks = 80;

        Student s3 = new Student();
        s3.roll = 3;
        s3.name = "Amanu";
        s3.marks = 70;

        // Creating an array of Student objects named students
        Student students[] = new Student[3];

        // Assigning Student objects to the students array
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // Looping through the students array to print the name and marks of each student
        for(int i = 0; i<students.length; i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }

        int num[] = new int[4];
        num[1] = 8;
        num[2] = 3;
        num[3] = 9;
        for(int i = 0; i<num.length; i++){
        num[0] = 4;
        System.out.println(num[i]);
    }
    } 
} 