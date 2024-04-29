package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int s = 1;
        int i;
        int j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Satır Sayısı : ");

        n = scanner.nextInt();
        System.out.println("FLOYD ÜÇGENİ");

        for(i=1; i<=n; i++){
            for(j = 1; j<=i; j++){
                System.out.printf("%d\t",s);
                s++;
            }
            System.out.println();
        }
    }
} // Klayvyeden (scanner) girilen satır sayısı için aralarında tab boşluk olacak şekilde Floyd Üçgeni yazdıran program