
import java.util.Scanner;


public class Main {
            public static void main(String[] args) {
                Scanner inp = new Scanner(System.in);
                int count = 0, total = 0;
                int totalNumber = 0;
                System.out.println("Sayı Giriniz");
                int number = inp.nextInt();
                for (int i = 1; i < number; i++) {
                    if (i % 3 == 0 && i % 4 == 0) {
                        total += i;
                        count++;
                    }
                }
                total = totalNumber / count;
                System.out.println("3 ve 4e bölünen Sayilarin Ortalamasi : " +count);
            }
        }

