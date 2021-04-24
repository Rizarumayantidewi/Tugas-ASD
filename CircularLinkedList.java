package linkedlist;

public class CircularLinkedList {
    private node last; // untuk menentukan akhir elemen
    private int panjang;
    
    private class node{
        private node next;
        private int isi;
        
        public node(int isi){
            this.isi = isi;
        }
    }
    
    public CircularLinkedList(){
        last = null;
        panjang = 0;    
    }
    
    public int panjang(){
        return panjang;
    }
    
    public boolean kosong(){
        return panjang == 0;
    }
    
    public void createCircularLinkedList(){
        node pertama = new node(1);
        node kedua = new node(2);
        node ketiga = new node(3); 
        
        pertama.next = kedua;
        kedua.next = ketiga;
        ketiga.next = pertama;
        
        last = ketiga;
    }
    
    public void TampilanData(){
        if(last == null){
            return;
        }
        
        node awal = last.next;
        while(awal != last){
            System.out.println(awal.isi + " ");
            awal = awal.next;
        }
        System.out.println(awal.isi);
    }
    
    public static void main(String[] args){
        CircularLinkedList qrs = new CircularLinkedList();
        qrs.createCircularLinkedList();
        qrs.TampilanData();
    }
}
