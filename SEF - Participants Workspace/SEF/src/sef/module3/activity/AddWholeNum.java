package sef.module3.activity;

public class AddWholeNum {
    public static void main(String[] args) {
        int total1 = 0;
        int i = 0;
        for (i = 1; i <= 50; i++) {
            total1 = total1 + i;
        }

        System.out.println("Addition of Whole Numbers from 1 to 50 = " + total1);

        // complete the code. write for loop for i
        total1 = 0;
        for (i = 50; i <= 100; i++) {
            total1 = total1 + i;
        }

        System.out.println("Addition of Whole Numbers from 50 to 100 = " + total1);
    }
}
