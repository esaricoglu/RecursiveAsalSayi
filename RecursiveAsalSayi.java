package Metotlar;

import java.util.Scanner;

public class RecursiveAsalSayi {
    static boolean f(){
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        int number = inp.nextInt();
        int tempNumber = number;
        int x, multiplier = 2;
        for(int i = 2 ; i<=number; i++){
            x = tempNumber%i;
            if (x == 0) {
                multiplier = i;
                break;
            }
        }
        if(multiplier == number)
            System.out.println(number + " sayısı ASALDIR !");
        else{
            System.out.println(number + " sayısı ASAL değildir !");
        }


     return f();
    }
    public static void main(String[] args) {
        f();
    }
}
