import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, geo, turkce, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Geometri notunuzu giriniz : ");
        geo = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Muzik notunuzu giriniz : ");
        muzik = inp.nextInt();

        double average = (mat + fizik + geo + turkce + muzik) / 5;
        if (average <= 55) {
            System.out.print("Başarılı Olamadınız. ");

        } else {
            System.out.println("Tebrikler, geçtiniz. ");

        }
        System.out.println("Ortalamanız" + average);
    }

}