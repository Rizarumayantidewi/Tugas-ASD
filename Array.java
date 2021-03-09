/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author ACER
 */
public class Array {
    public static void main(String[] args) {
      String[][] Kamar  = { 
        {"1", "2", "3", "4", "X"},
        {"1", "2", "3", "4", "5"},
        {"1", "2", "3", "4", "5"},
        {"1", "2", "3", "X", "5"},
      };
  
      int kamarKosong = 0;
      for (int i = Kamar.length-1; i >=0; i--) {
        for (int j = 0; j < Kamar[i].length; j++) {
          if (Kamar[i][j] == "X") {
            System.out.println("Tamu berada di Lantai " + (i+1) + " Kamar " + (j + 1) );
          } else {
            kamarKosong += 1;
          }
        }
      }
  
      System.out.println("");
      System.out.println("Jumlah Kamar yg tersedia ada " + kamarKosong);
  
    }
  
