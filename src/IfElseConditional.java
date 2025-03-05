public class IfElseConditional {
    public static void main(String[] args){
//        Menu pilihan dengan if else conditional
//        Mencetak UI menu
        System.out.println("=========================");
        System.out.println("Menu dengan implementasi if-else conditional");
        System.out.println("1. Main");
        System.out.println("2. Pengaturan");
        System.out.println("3. Keluar");
        System.out.println("=========================");
        int pilihan = 1;

//        if else conditional statements
        if(pilihan == 1){
            System.out.println("Pilihan 1 dipilih");
            System.out.println("Selamat Datang di permainan!");
        } else if(pilihan == 2){
            System.out.println("Pilihan 2 dipilih");
            System.out.println("Pengaturan");
        } else if(pilihan == 3){
            System.out.println("Pilihan 3 dipilih");
            System.out.println("Terima kasih telah bermain!");
        } else {
            System.out.println("Pilihan tidak terdapat dalam menu dipilih");
            System.out.println("Masukan invalid!");
        }
    }
}
