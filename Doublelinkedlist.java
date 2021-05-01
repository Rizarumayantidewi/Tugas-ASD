package linkedlist;

public class Doublelinkedlist {
    private node head; // pointer dimulai dari awal (head)
    private node tail; // pointer dimulai dari akhir (tail)
    private int panjang; // panjang dari elemen double linked list
    
    public class node{
        private String isi; // isi dari setiap elemen
        private node next; // membuat alur dari awal ke akhir
        private node previous; // membuat alur dari akhir ke awal
        
        public node(String isi){
            this.isi = isi;
        }
    }
    
    public Doublelinkedlist(){
        this.head = null; // dibuat null agar semua ada nilainya yaitu nilai null
        this.tail = null;
        this.panjang  = 0;
    }
    
    public boolean kosong(){
        return panjang == 0; // jika elemen bernilai null atau 0 maka panjang == 0
    }
    
    public int panjang(){
        return panjang;
    }
    
    public void TampilanAwal(){ // menampilan elemen dari awal ke akhir
        if(head == null){
            return;
        }
        
        node temp = head;
        while(temp != null){
            System.out.print(temp.isi + "--->");
            temp = temp.next;
        }
        System.out.println("selesai");
    }
    
    public void TampilanAkhir(){ // menampilkan elemen dari akhir ke awal
        if(tail == null){
            return;
        }
        
        node temp = tail;
        while(temp != null){
            System.out.print(temp.isi + "--->");
            temp = temp.previous;
        }
        System.out.println("selesai");
    }
    
    public void insertData(String value){ // proses input
        node newNode = new node (value);
        
        if(kosong()){
            head = newNode;
        }else{
            tail.next = newNode;
            newNode.previous = tail; // melanjutkan ke data awal 
        }
        tail = newNode;
        panjang++; // agar panjangnya tidak 0
    }
    
    public static void main(String[] args){
        Doublelinkedlist rst = new Doublelinkedlist();
        rst.insertData("11");
        rst.insertData("12");
        rst.insertData("13");
        
        rst.TampilanAwal(); // awal ke akhir
        rst.TampilanAkhir(); // akhir ke awal
    }
}

// Riza Rumayanti Dewi
// 20200040161