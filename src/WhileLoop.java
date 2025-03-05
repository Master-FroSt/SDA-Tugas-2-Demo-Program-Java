public class WhileLoop {
    public static void main(String[] args){
        //        Inisialisasi peubah
        int count = 0;
        String[] menuName = {"Nasi goreng", "Nasi Bakar", "Nasi Uduk"};
        int[] pilihan = {0, 1, 1, 2, -1};
        int[] order = new int[4];

//        Perulangan While untuk masukan hingga EOF character
        System.out.println("Menu yang dipesan: (Perulangan dengan while)");
        while(pilihan[count] != -1) {
            order[count] = pilihan[count];
            System.out.println((count + 1) + ". " + menuName[order[count]] + " ");
            count++;
        }
    }
}
