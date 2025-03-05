public class SwitchConditional {
    public static void main(String[] args) {
        //        Menu pilihan dengan switch conditional
//        Mencetak UI menu
        System.out.println("=========================");
        System.out.println("Menu dengan implementasi swith conditional");
        System.out.println("1. Main");
        System.out.println("2. Pengaturan");
        System.out.println("3. Keluar");
        System.out.println("=========================");
        int pilihan = 3;

//        switch conditional statements
        switch (pilihan){
            case 1:
                System.out.println("Pilihan 1 dipilih");
                System.out.println("Selamat Datang di permainan!");
                break;
            case 2:
                System.out.println("Pilihan 2 dipilih");
                System.out.println("Pengaturan");
                break;
            case 3:
                System.out.println("Pilihan 3 dipilih");
                System.out.println("Terima kasih telah bermain!");
                break;
            default:
                System.out.println("Pilihan tidak terdapat dalam menu dipilih");
                System.out.println("Masukan invalid!");
        }
    }
}
