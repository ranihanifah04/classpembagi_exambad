/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pembagi;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author This PC
 */
public class Pembagi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( 
                //membaca inputan
                Scanner scanner = new Scanner(System.in)) {
    
            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();
            
            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();
            
            //melakukan proses pembagian pada angka 1 dan angka 2
            double hasil = angka1 / angka2;
            System.out.println("Hasil pembagian: " + formatAngka(hasil));
            
            //untuk menangan Exception yang akan terjadi
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid! Harap masukkan angka dengan benar.");
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan pada pembagian: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
    
    //untuk memformat dan menampilkan angka dengan format yang sesuai
    private static String formatAngka(double angka) {
        if (angka == (int) angka) {
            return String.format("%d", (int) angka);
        } else {
            return String.format("%.2f", angka);
        }
    }
}