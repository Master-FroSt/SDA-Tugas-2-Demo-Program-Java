public class ForLoop {
    public static void main(String[] args) {
        //        Inisialisasi peubah
        String[] menuName = {"Nasi goreng", "Nasi Bakar", "Nasi Uduk"};
        int[] pilihan = {0, 1, 1, 2, -1};
        int[] order = new int[4];

        //        Perulangan for untuk masukan pesanan ke menu
        System.out.println("Menu yang dipesan: (Perulangan dengan for)");
        for (int i = 0; i < order.length; i++) {
            order[i] = pilihan[i];
            System.out.println((i + 1) + ". " + menuName[order[i]] + " ");
        }
    }
}
