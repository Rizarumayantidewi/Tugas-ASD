import java.util.ArrayList;

public class No4 {

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

    static void removeText(String text, String textToBeRemoved, Integer position) {
        ArrayList<String> fixWords = textToArray(text);
        ArrayList<String> deletedWords = new ArrayList<>();

        for(int r = 0; r < fixWords.size(); r++) {
            if(!((r + 1) == position && fixWords.get(r).toLowerCase().equals(textToBeRemoved))) {
                deletedWords.add(fixWords.get(r));
            }
        }

        if(fixWords.size() == deletedWords.size()) {
            System.out.println("Penghapusan kata gagal dilakukan, karena indeks ke " + position + " bukan " + textToBeRemoved);
        }
        System.out.println(arrayToString(deletedWords));
    }

    public static void main(String args[]) {
        System.out.println("\n Teks 1");
        removeText("Saya sedang belajar struktur data", "sedang", 2);
        System.out.println("\n Teks 2");
        removeText("Saya sedang belajar struktur data", "struktur", 3);
        System.out.println("\n Teks 3");
        removeText("Pemrograman itu sangat mudah", "itu", 2);
    }
}
