package day08_NestedIfElseif;

import java.util.Scanner;

public class C01_NestedIfElseif {
    public static void main(String[] args) {

        /*
        Soru ) Interview Question
            Kullanicidan artik yil olup olmadigini kontrol
            etmek icin yil girmesini isteyin.
            Kural 1: 4 ile bolunemeyen yillar artik yil
            degildir
            Kural 2: 4 ile bolunup 100 ile bolunemeyen
            yillar artik yildir
            Kural 3: 4’un kati olmasina ragmen 100 ile
            bolunebilen yillardan sadece
            400’un kati olan yillar artik yildir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year to see if it's a leap year: ");
        int year = scan.nextInt();

        if (year%4!=0) {
            System.out.println("Not a leap year! (not a multiple of 4)");
        } else if (year%100!=0) {
            System.out.println("This is a leap year! (multiple of 4 and not a multiple of 100)");

        } else if (year%400==0) {
            System.out.println("This is a leap year");

        } else {
            System.out.println("Not a lap year!");
        }


    }
}
