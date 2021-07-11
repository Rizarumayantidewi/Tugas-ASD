import java.util.ArrayList;

public class No5 {

    static  String arrayToString(ArrayList<String> sources) {
        String results  = "";

        for (String source : sources) {
            results += (source + " ");
        }

        return results;
    }

    static ArrayList<String> textToArray(String text) {
        ArrayList<String> words = new ArrayList<>();
        for(int r = 0; r < text.length(); r++) {
            if(!Character.toString(text.charAt(r)).toLowerCase().equals(" ")) {
                if(r == 0) {
                    words.add(Character.toString(text.charAt(r)));
                } else {
                    if(Character.toString(text.charAt(r - 1)).toLowerCase().equals(" ")) {
                        words.add(Character.toString(text.charAt(r)));
                    } else {
                        words.set(words.size() - 1, words.get(words.size() - 1) + text.charAt(r));
                    }
                }
            }
        }
        return words;
    }

    static String reverseChar(String text, boolean isKataTerbalik) {
        String results = "";
        if(isKataTerbalik) {
            for(int r = text.length() - 1; r >= 0; r--) {
                results += Character.toString(text.charAt(r));
            }
        } else {
            for(int r = 0; r < text.length(); r++) {
                results += Character.toString(text.charAt(r));
            }
        }

        return  results;
    }

    static void reversetext(String text, boolean isKataTerbalik, boolean isUrutanTerbalik) {
        ArrayList<String> fixWords = textToArray(text);
        ArrayList<String> reversedWords = new ArrayList<>();

        if(isUrutanTerbalik) {
            for(int r = (fixWords.size() - 1); r >= 0; r--) {
                reversedWords.add(reverseChar(fixWords.get(r), isKataTerbalik));
            }
        } else {
            for(int r = 0; r < fixWords.size(); r++) {
                reversedWords.add(reverseChar(fixWords.get(r), isKataTerbalik));
            }
        }

        System.out.println(arrayToString(reversedWords));

    }

    public static void main(String args[]) {

        System.out.println("\n Teks 1");
        reversetext("Selamat datang di dunia pemrograman", true, true);
        System.out.println("\n Teks 2");
        reversetext("Selamat datang di dunia pemrograman", false, true);
        System.out.println("\n Teks 3");
        reversetext("Selamat datang di dunia pemrograman", true, false);
        System.out.println("\n Teks 4");
        reversetext("Selamat datang di dunia pemrograman", false, false);
    }
}
