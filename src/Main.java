import java.util.Scanner;

public class Main {

    static boolean isPalindrom(int input) {
        int tmp, tersSayi = 0, kalan;
        tmp = input;

        while (tmp != 0) {
            kalan = tmp % 10;
            tersSayi = tersSayi * 10 + kalan;
            tmp /= 10;
        }
        return input == tersSayi;
    }

    public static void main(String[] args) {

        int sayi2;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz ==> ");
        sayi2 = input.nextInt();

        if (isPalindrom(sayi2)) {

            System.out.println(sayi2 + " bir palindrom sayidir.");
        }

        else{
            System.out.println(sayi2 + " bir palindrom sayi degildir.");
        }

        input.close();
    }
}