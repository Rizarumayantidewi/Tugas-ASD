import java.util.ArrayList;

public class No1 {
    static String vocals[] = {"a", "i", "u", "e", "o"};

    static ArrayList<String> textToArray(String text) {
        ArrayList<String> words = new ArrayList<>();
        for(int r = 0; r < text.length(); r++) {
            if(!Character.toString(text.charAt(r)).equals(" ")) {
                if(r == 0) {
                    words.add(Character.toString(text.charAt(r)));
                } else {
                    if(Character.toString(text.charAt(r - 1)).equals(" ")) {
                        words.add(Character.toString(text.charAt(r)));
                    } else {
                        words.set(words.size() - 1, words.get(words.size() - 1) + text.charAt(r));
                    }
                }
            }
        }
        return words;
    }

    static boolean hasVocal(String word) {

        for(String vocal : vocals) {
            if(word.toLowerCase().equals(vocal)) {
                return  true;
            }
        }
        return  false;
    }

    static ArrayList<String> ignoreDupVocals(ArrayList<String> data) {
        ArrayList<String> results = new ArrayList<>();
        for(String text : data) {
            ArrayList<String> registeredVocals = new ArrayList<>();

            boolean hasDupFound = false;

            for(int r = 0 ; r < text.length(); r++) {
                String textOIdx = Character.toString(text.charAt(r));

                for(String voc: registeredVocals) {
                    if(voc.toLowerCase().equals(textOIdx.toLowerCase())) {
                        hasDupFound  = true;
                    }
                }

                if(hasVocal(textOIdx)) {
                 registeredVocals.add(textOIdx);
                }
            }

            if(!hasDupFound) {
                results.add(text);
            }
        }
        return results;
    }

    public static void main(String[] args) {
        // Teks 1
        System.out.println("Teks 1\t");
        ArrayList<String> case1 = ignoreDupVocals(textToArray("Universitas Nusa Putra Sukabumi"));
        System.out.println("Jumlah kata = " + case1.size());

        // Teks 2
        System.out.println("Teks 2\t");
        ArrayList<String> case2 = ignoreDupVocals(textToArray("Pemrograman"));
        System.out.println("Jumlah kata = " + case2.size());

        // Teks 3
        System.out.println("Teks 3\t");
        ArrayList<String> case3 = ignoreDupVocals(textToArray("Belajar pemrograman Struktur Data berbasis JAVA"));
        System.out.println("Jumlah kata = " + case3.size());
    }
}
