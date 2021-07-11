import java.util.*;

class Result {
    public static ArrayList<String> getPosition(int v, List<Integer> arr) {
        // TODO 1
        ArrayList<String> results = new ArrayList<>();

        for(int i = 0; i < arr.size(); i++) {
            if(v == arr.get(i)) {
                results.add(Integer.toString(i + 1));
            }
        }

        return results;
    }
}

public class NumberOne {

    public static void main(String[] args) {

        // TODO 2
        ArrayList<Integer> data = new ArrayList<>();
        data.add(2);
        data.add(8);
        data.add(2);
        data.add(3);
        data.add(5);
        data.add(10);
        data.add(10);
        data.add(8);
        data.add(8);
        data.add(3);
        data.add(5);

        // TODO 3

        System.out.println("Hasil dari V=2 adalah " + Result.getPosition(2, data));
        System.out.println("Hasil dari V=8 adalah " + Result.getPosition(8, data));
        System.out.println("Hasil dari V=3 adalah " +  Result.getPosition(3, data));
        System.out.println("Hasil dari V=5 adalah " + Result.getPosition(5, data));
        System.out.println("Hasil dari V=10 adalah " +Result.getPosition(10, data));
        System.out.println("Hasil dari V=11 adalah " +Result.getPosition(11, data));


    }

}
