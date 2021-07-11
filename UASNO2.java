import java.util.ArrayList;

public class No2 {
    static String vocals[] = {"a", "i", "u", "e", "o"};
    static void resolveVocalAndConsonant(String text) {
        ArrayList<String> vocalrrr = new ArrayList<>();
        ArrayList<String> consonantrrr = new ArrayList<>();
        for(int r  = 0; r < text.length(); r++) {
            String currentChar = Character.toString(text.charAt(r));
            if(!currentChar.matches("[^a-zA-Z]")) {
                Boolean hasVocalFound = false;
                for(String vocal : vocals) {
                    if(currentChar.toLowerCase().equals(vocal)) {
                        hasVocalFound = true;
                    }
                }
                if(hasVocalFound) {
                    vocalrrr.add(currentChar.toLowerCase());
                } else {
                    consonantrrr.add(currentChar.toLowerCase());
                }
            }
        }
        System.out.println("Jumlah Vocal = " + vocalrrr.size());
        System.out.println(vocalrrr);
        System.out.println("Jumlah Konsonan = " + consonantrrr.size());
        System.out.println(consonantrrr);
    }

    public static void main(String[] args) {

        resolveVocalAndConsonant("Universitas Nusa Putra Sukabumi");
    }
}
