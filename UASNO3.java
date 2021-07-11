import java.util.ArrayList;


class No3 {
    
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

    static void insertToText(String text, String targetText, Integer targetIndex) {
        ArrayList<String> fixWords = textToArray(text);

        fixWords.add(targetIndex, targetText);

        System.out.println("Teks 1 : " + text);
        System.out.println("Teks 2 : " + arrayToString(fixWords));
    }


    public static void main(String[] args) {
        insertToText("Saya sedang belajar struktur data", "pergi", 2);
        System.out.println("----------------------------------------------------");
        insertToText("Pemrograman itu sangat mudah", "dan menyenangkan", 4);
    }
}

