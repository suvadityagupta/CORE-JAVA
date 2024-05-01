// Class representing a Student with attributes roll, name, and marks
class Student{
    int roll; // roll number of the student
    String name; // name of the student
    int marks; // marks obtained by the student
}

public class EnhancedForLoop {
    public static void main(String[] args) {
        // Creating Student objects s1, s2, and s3
        Student s1 = new Student();
        s1.roll = 1; // assigning roll number 1 to student s1
        s1.name = "Aman"; // assigning name "Aman" to student s1
        s1.marks = 90; // assigning marks 90 to student s1

        Student s2 = new Student();
        s2.roll = 2; // assigning roll number 2 to student s2
        s2.name = "Amani"; // assigning name "Amani" to student s2
        s2.marks = 80; // assigning marks 80 to student s2

        Student s3 = new Student();
        s3.roll = 3; // assigning roll number 3 to student s3
        s3.name = "Amanu"; // assigning name "Amanu" to student s3
        s3.marks = 70; // assigning marks 70 to student s3

        // Creating an array of Student objects named students
        Student students[] = new Student[3];

        // Assigning Student objects to the students array
        students[0] = s1; // assigning student s1 to the first index of the students array
        students[1] = s2; // assigning student s2 to the second index of the students array
        students[2] = s3; // assigning student s3 to the third index of the students array

        // Looping through the students array to print the name and marks of each student
        // for(int i = 0; i<students.length; i++){
        //     System.out.println(students[i].name + " : " + students[i].marks);
        // }
        for (Student stud : students) {
            System.out.println(stud.name + ":"+ stud.marks); // printing the name and marks of each student using the enhanced for loop
        }

        int num[] = new int[4]; // creating an array of integers named num with a length of 4
        num[0] = 4; // assigning the value 4 to the first index of the num array
        num[1] = 8; // assigning the value 8 to the second index of the num array
        num[2] = 3; // assigning the value 3 to the third index of the num array
        num[3] = 9; // assigning the value 9 to the fourth index of the num array
        for (int n : num) {
            System.out.println(n); // printing each value in the num array using the enhanced for loop
        }
    } 
}