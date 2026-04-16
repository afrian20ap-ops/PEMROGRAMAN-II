/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laconsolo;
import java.util.Scanner;
/**
 *
 * @author afria
 */
public class NilaiMhs {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            String nim, nama, grade;
            double uts, uas, rata;
            System.out.println("Data:");
            System.out.print("NIM  : ");
            nim = input.next();
            System.out.print("Nama : ");
            nama = input.next();
            System.out.print("Nilai UTS : ");
            uts = input.nextDouble();
            System.out.print("Nilai UAS : ");
            uas = input.nextDouble();
            // hitung rata-rata
            rata = (uts + uas) / 2;
            // penentuan grade
            if (rata < 50) {
                grade = "E";
            } else if (rata < 60) {
                grade = "D";
            } else if (rata < 70) {
                grade = "C";
            } else if (rata < 80) {
                grade = "B";
            } else {
                grade = "A";
            }   // output
            System.out.println("==============================================");
            System.out.println("NIM\tNama\tUTS\tUAS\tRata2\tGrade");
            System.out.println("==============================================");
            System.out.println(nim + "\t" + nama + "\t" + uts + "\t" + uas + "\t" + rata + "\t" + grade);
        }
    }
}
