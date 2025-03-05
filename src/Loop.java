//public class Loop {
//    public static void main(String[] args) {
//        PROJECT TELAH DIPISAH
////        Inisialisasi peubah
//        int count = 0;
//        String[] menuName = {"Nasi goreng", "Nasi Bakar", "Nasi Uduk"};
//        int[] pilihan = {0, 1, 1, 2, -1};
//        int[] order = new int[4];
//
////        Perulangan While untuk masukan hingga EOF character
//        System.out.println("Menu yang dipesan: (Perulangan dengan while)");
//        while(pilihan[count] != -1) {
//            order[count] = pilihan[count];
//            System.out.println((count + 1) + ". " + menuName[order[count]] + " ");
//            count++;
//        }
//
////        Perulangan for untuk masukan pesanan ke menu
//        System.out.println("Menu yang dipesan: (Perulangan dengan for)");
//        for (int i = 0; i < order.length; i++) {
//            System.out.println((i + 1) + ". " + menuName[order[i]] + " ");
//        }
//
////        Perulangan Do While
//        System.out.println("Menu yang dipesan: (Perulangan dengan do-while)");
//        int count2 = 0;
//        do {
//            order[count2] = pilihan[count2];
//            System.out.println((count2 + 1) + ". " + menuName[order[count2]] + " ");
//            count2++;
//        } while (pilihan[count2] != -1);
//    }
//}
