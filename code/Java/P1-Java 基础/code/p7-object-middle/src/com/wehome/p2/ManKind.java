package com.wehome.p2;

public class ManKind {

    int sex;
    int salary;

    public void manOrWoman() {
        String sex = "";
        if (this.sex == 1) {
            sex = "man";
        } else if (this.sex == 0) {
            sex = "woman";
        } else {
            System.out.println("sex输入失败");
            return;
        }
        System.out.println("sex = " + sex);
    }

    public void employeed() {
        String job = "";
        if (salary == 0) {
            job = "no job";
        } else if (salary != 0) {
            job = "job";
        }
        System.out.println(job);
    }

}
