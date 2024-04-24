package com.wehome.p3;

public class StudentTest {

    public static void main(String[] args) {
        System.out.println(new Student()); // com.wehome.p3.Student@4554617c

        Student stu = new Student();
        System.out.println(stu); // com.wehome.p3.Student@74a14482

        int[] arr = new int[5];
        System.out.println(arr); // [I@1540e19d
    }

}
