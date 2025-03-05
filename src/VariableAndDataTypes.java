public class VariableAndDataTypes {
    public static void main(String[] args) {
        // Inisialisasi Tipe Data
        int orderID = 125;
        String nama = "Aa Mus";
        String menu = "Nasi Goreng";
        double price = 2.15;
        int quantity = 5;
        double total = price * quantity;
        boolean cashless = true;
        char foodRating = 'B';

        // Mencetak nilai tipe data
        System.out.println("Order ID: " + orderID);
        System.out.println("Pemesan: " + nama);
        System.out.println("Menu: " + menu);
        System.out.println("Peringkat makanan: " + foodRating);
        System.out.println("Jumlah: " + quantity);
        System.out.println("Harga satuan: " + price);
        System.out.println("Harga total: " + total);
        System.out.println("Pembayaran dengan kartu: " + cashless);
    }
}
