package com.wehome.p2;

public class Student extends Person {

    long number;
    int math;
    int english;
    int computer;

    public Student(String n, char s, int a, long k, int m, int e, int c) {
        super(n, s, a);
        // name = n;
        // sex = s;
        // age = a;
        number = k;
        math = m;
        english = e;
        computer = c;
    }

    public double aver() {
        return (math + english + computer) / 3.0;
    }

    public int max() {
        return (math > english ? math : english) > computer ? (math > english ? math : english) : computer;
    }

    public int min() {
        return (math < english ? math : english) < computer ? (math < english ? math : english) : computer;
    }

}
