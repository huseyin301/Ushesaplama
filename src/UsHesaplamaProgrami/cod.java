package UsHesaplamaProgrami;
import java.util.Scanner;
public class cod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y, z = 1, total = 1;

        System.out.print("Üssü hesaplanacak değeri giriniz : ");
        x = sc.nextInt();

        System.out.print("Üssü giriniz : ");
        y = sc.nextInt();

        for (int i = 1; i <= y ;){

            z = z * x;

            i++;
        }

        System.out.println("Toplam : " + z);

    }
}
