public class Main {
    public static void main(String[] args) {
        // Java büyük küçük harf duyarlı bir dildir.
        // camelCase
        // PascalCase
        // DRY : Do not Repeat Yourself

        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int aranacak = 9;

        boolean sonuc = sayiBul(sayilar, aranacak);
        mesaj(sonuc);
    }

    public static boolean sayiBul(int[] sayilar, int aranacak) {
        boolean varMi = false;
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        return varMi;
    }

    public static void mesaj(boolean varMi) {
        if (varMi == true) {
            System.out.println("Sayı dizide mevcuttur.");
        } else {
            System.out.println("Sayı dizide mevcut değildir.");
        }
    }
}