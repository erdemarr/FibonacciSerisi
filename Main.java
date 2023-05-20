import java.util.Scanner;

class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisi eleman sayısını giriniz: ");
        int elemanSayisi = scanner.nextInt();

        int sayi1 = 0;
        int sayi2 = 1;


        for (int i = 2; i < elemanSayisi; i++) {
            int yeniSayi = sayi1 + sayi2;
            System.out.println(sayi1 + " + " + sayi2 + " = " + yeniSayi);

            sayi1 = sayi2;
            sayi2 = yeniSayi;
        }

        scanner.close();
    }
}
