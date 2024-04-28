package com.wehome.p2;

public class KidsTest {

    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.sex = 1;
        someKid.salary = 2000;

        someKid.manOrWoman();
        someKid.employeed();

        someKid.yearsOld = 23;

        someKid.printAge();
    }

}
