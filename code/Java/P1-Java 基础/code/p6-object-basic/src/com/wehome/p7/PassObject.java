package com.wehome.p7;

public class PassObject {

    public static void main(String[] args) {
        PassObject passObject = new PassObject();
        Circle c = new Circle();
        passObject.printAreas(c, 5);
    }


    public void printAreas(Circle c, int time) {

        System.out.println("Radius\tArea");

        for (int i = 1; i <= time; i++) {
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());
        }

    }

}
