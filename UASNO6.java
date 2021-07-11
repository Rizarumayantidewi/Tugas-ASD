import java.util.ArrayList;

public class No6 {

    static  String arrayToString(ArrayList<String> sources) {
        String results  = "";

        for(int r = 0;  r < sources.size(); r++) {
            results += (sources.get(r) + (r < sources.size() - 1 ? ", " : " "));
        }
        return results;
    }

    public static void main(String args[]) {
        Integer vakiMoneys[] = {5000, 3000, 6500, 10000, 4000, 4000};
        Integer rinaMoneys[] = {10000, 5000, 5000, 10000, 15000, 10000};
        String days[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jum’at", "Sabtu"};
        ArrayList<String> rinaWin = new ArrayList<>();
        ArrayList<String> vakiWin = new ArrayList<>();
        ArrayList<String> rinaAndVakiSame = new ArrayList<>();
        Integer totalRina = 0;
        Integer totalVaki = 0;


        for (int r = 0; r < days.length; r++) {
            if(vakiMoneys[r] > rinaMoneys[r]) {
                vakiWin.add(days[r]);
            } else if(rinaMoneys[r] > vakiMoneys[r]) {
                rinaWin.add(days[r]);
            } else {
                rinaAndVakiSame.add(days[r]);
            }

            totalRina += rinaMoneys[r];
            totalVaki += vakiMoneys[r];
        }

        System.out.println("Uang saku Vaki lebih banyak dari Rina "+ vakiWin.size() +"x pada hari "+ arrayToString(vakiWin));
        System.out.println("Uang saku Rina lebih banyak dari Vaki "+ rinaWin.size() +"x pada hari "+ arrayToString(rinaWin));
        System.out.println("Uang saku Vaki sama dengan Rina pada "+ rinaAndVakiSame.size() +"x pada hari " + arrayToString(rinaAndVakiSame));
        System.out.println("Total Uang saku Vaki adalah Rp "+ totalVaki +" per/minggu");
        System.out.println("Total Uang saku Rina adalah Rp "+ totalRina +" per/minggu");

    }
}
