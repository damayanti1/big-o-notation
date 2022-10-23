/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lat1_bigo;

/**
 *
 * @author damayanti eka putri
 */
public class Lat1_BigO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //contoh untuk CONSTANT TIME ALGORITMS-O(1)
      int n = 200;{
        System.out.println("Angka yang dimasukkan yaitu: " + n);
    }
      
        //Contoh Logarithmic Time Algorithms – O(log n)
        for (int i = 1; i < 10; i = i * 2){
        System.out.println("Angka yang dikalikan 2: " + i);
        }
        
        //Contoh Algoritma Waktu Linier – O(n)
        for (int j = 0; j < 12; j++) {
    System.out.println("Angka yang diinputkan: " + j);
}
        
        //Contoh N Log N Algoritma Waktu – O(n log n)
        for (int i = 1; i <= 20; i++){
    for(int j = 1; j < 10; j = j * 2) {
        System.out.println("Angka masukkan: " + i + " dan " + j);
    }
        }
        //Contoh Algoritma Waktu Polinomial – O(n p )
        for (int k = 1; k <= 5; k++) {
    for(int j = 1; j <= 10; j++) {
        System.out.println("Angka inputan: " + k + " dan " + j);
    }
}
        //Contoh Algoritma Waktu Eksponensial – O( k n )
        for (int i = 1; i <= Math.pow(2, 5); i++){
    System.out.println("Hasil Angka: " + i);
}
        //Contoh Algoritma Waktu Faktorial – O(n!)
        for (int i = 1; i <= (10); i++){
    System.out.println("INPUTAN: " + i);
}
}
}
  






       
   
    

