public class DoWhileLoop {
    public static void main(String[] args) {
        //        Inisialisasi peubah
        int count = 0;
        String[] menuName = {"Nasi goreng", "Nasi Bakar", "Nasi Uduk"};
        int[] pilihan = {0, 1, 1, 2, -1};
        int[] order = new int[4];
        
        //        Perulangan Do While
        System.out.println("Menu yang dipesan: (Perulangan dengan do-while)");
        do {
            order[count] = pilihan[count];
            System.out.println((count + 1) + ". " + menuName[order[count]] + " ");
            count++;
        } while (pilihan[count] != -1);
    }
}
