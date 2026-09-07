package com.company;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Prve cislo: ");
            int prve = scanner.nextInt();
            System.out.println("Druhe cislo: ");
            int druhe = scanner.nextInt();
            System.out.println("Operacia (1 pre +) (2 pre -) (3 pre /) (4 pre *): ");
            int operacia = scanner.nextInt();
            int a=1;
            int b=2;
            int c=3;
            int d=4;
            if (operacia==a)
            {
                System.out.printf("Vysledok je: ");
                System.out.println(prve + druhe);
            }
            else if (operacia== b)
            {
                System.out.printf("Vysledok je: ");
                System.out.println(prve - druhe);
            }
            else if (operacia==c)
            {
                System.out.printf("Vysledok je: ");
                System.out.println(prve / druhe);
            }
            else if (operacia==d)
            {
                System.out.printf("Vysledok je: ");
                System.out.println(prve * druhe);
            }
            else{
                System.out.printf("Neexistuje tato operacia");
            }
        }


}
