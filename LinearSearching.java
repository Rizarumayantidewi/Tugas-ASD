import java.util.Scanner;  
    
    class search  
    {  
        public static void main(String args[])  
        {  
            int n;
            boolean benar = false;
            String search;
            String [][] array = {
                {"1102021","Andri Hariadi","BANDUNG"},
                {"1102022","Dewi Lestari","SURABAYA"},
                {"1102023","Dewi Agustin","MALANG"},
                {"1102024","Reni Indrayanti","MALANG"},
                {"1102025","Toni Sukmawan","SURABAYA"},
                {"1102026","Toni Gunawan","BANDUNG"}
            };
        
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan nama yang akan dicari");  
        search = in.nextLine();
        
        for(int baris = 0; baris < array.length;baris++){
            for(int kolom = baris; kolom <= baris; kolom++){
                
                boolean found = false;
                String [] splitnama = array[baris][1].split(" ");
                for(int i=0 ;i < splitnama.length; i++){
                    if(search.equals(splitnama[i]) && found == false){
                        found =true;
                        benar = true;
                        n = kolom+1;
                        System.out.println("\n"+array[baris][0]+ " - " +array[baris][1]+ " - " + array[baris][2] + " - Data nomor " + n );

                    break;
                    }
                }
                } 
                }
            if(benar==false){
            System.out.println("\nData yang anda cari tidak ditemukan");
            
            }
        }
    }
