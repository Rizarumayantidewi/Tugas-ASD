import java.util.Scanner;

public class Kamus {
    public String[] languageInput;
    public String[] languageLib;
  
    Kamus(String[][] languages) {
      this.languageInput = languages[0];
      this.languageLib = languages[1];
    }
  
    public static void main(String[] args) {
  
      String[] english = {
        "one", "cat", "apple", "rose", "january", "monday", 
        "eat", "hair", "house", "i", "love", "happy"
      };
  
      String[] indonesia = {
        "satu", "kucing", "apel", "mawar", "januari", "senin",
        "makan", "rambut", "rumah", "saya", "cinta", "senang"
      };
  
      String[][] ENG_TO_IND = { english, indonesia };
      String[][] IND_TO_ENG = { indonesia, english };
      
      System.out.println("\n===================================================");
      System.out.println("======== Selamat datang di Program Kamus ==========");
      System.out.println("=======(Welcome to the Dictionary Program)=========");
      System.out.println("===================================================\n");
      System.out.println("Bahasa manakah yang Anda ingin terjemahkan ?");
      System.out.println("1. Bahasa Inggris ke Bahasa Indonesia");
      System.out.println("2. Bahasa Indonesia ke Bahasa Inggris\n");
      System.out.println("===================================================");
      System.out.println("\nSilakan masukkan nomor : ");
      
      //pemilihan parameter
      Scanner masuk = new Scanner(System.in);
      Scanner in = new Scanner(System.in);
      int pilih = masuk.nextInt();
      String[][] bahasa = {};

      if(pilih == 1){
          for(int r = 0; r< english.length; r++){
              System.out.println((r+1) + ". " + english[r]);
          }
          System.out.println("\nKata apakah yang Anda ingin terjemahkan ke Bahasa Indonesia ?");
          bahasa = ENG_TO_IND;

        }else if(pilih == 2){
          for(int r = 0; r< indonesia.length; r++){
              System.out.println((r+1) + ". " + indonesia[r]);
          }
          System.out.println("\nKata apakah yang Anda ingin terjemahkan ke Bahasa Inggris ? ");
          
          bahasa = IND_TO_ENG;
        }else{
            System.out.println("Masukkan Anda salah");
            return;
        }
        Kamus kamus = new Kamus(bahasa);
        String terjemah = in.next();

      

      kamus.translate(terjemah);
  
  
    }
  
    public void translate(String word) {
      try {
        int baseWordIndex = findIndexOfWord(word);
        String translatedWord = findTranslation(baseWordIndex);
  
        if ( word == "") {
          throw new WordException("Parameter Kosong");
        }
        
        if ( baseWordIndex == -1) {
          throw new WordException(word + " Tidak ditemukan di kamus");
        }
  
        if ( translatedWord == "" ) {
          throw new WordException(word + " Tidak bisa di terjemahkan");
        }
  
        System.out.println(word + " = " + translatedWord);
  
      } catch(WordException exception) {
        System.out.println(exception.getMessage());
      }
  
    }
  
    public int findIndexOfWord(String word) {
      int hasil = -1;
      for (int r = 0; r < languageInput.length; r++) {
        if (languageInput[r].contains(word.toLowerCase())) {
          hasil = r;
          return hasil;
        }
      }
  
      return hasil;
  
    }
  
    public String findTranslation(int indexOfWord) {
      int awal = 0;
      int akhir = languageLib.length;
      String ditemukan = "";
  
      try {
        while (awal <= akhir) {
          int tengah = (awal + akhir) / 2;
          int pointer = tengah;
  
          if ( indexOfWord > pointer ) {
            awal = tengah + 1;
          }
  
          if ( indexOfWord < pointer ) {
            akhir = tengah - 1;
          }
  
          if ( indexOfWord == pointer ) {
            return languageLib[pointer];
          }
  
        }
        return ditemukan;
      } 
  
      catch (ArrayIndexOutOfBoundsException exception) {
        return ditemukan;
      }
  
    }
  
  }
  
  
  class WordException extends Throwable {
  
    private String message;
  
    public WordException(String message) {
      this.message = message;
    }
  
    public String getMessage() {
      return message;
    }
  
  }
