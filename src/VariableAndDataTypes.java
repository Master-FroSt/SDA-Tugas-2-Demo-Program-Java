public class VariableAndDataTypes {
    public static void main(String[] args) {
        // Inisialisasi Tipe Data
        byte orderID = 125;
        String nama = "Aa Mus";
        String menu = "Nasi Goreng";
        short price = 15000;
        byte quantity = 5;
        int hargaSebelumPajak = price * quantity;
        float pajak = (0.1F * hargaSebelumPajak);
        double total = hargaSebelumPajak + pajak;
        boolean cashless = true;
        char foodGrade = 'B';
        float foodRating = 6.9F;

        // Mencetak nilai tipe data
        System.out.println("Order ID: " + orderID);
        System.out.println("Pemesan: " + nama);
        System.out.println("Menu: " + menu);
        System.out.println("Peringkat makanan: " + foodRating + " atau " + foodGrade);
        System.out.println("Jumlah: " + quantity);
        System.out.println("Harga satuan: " + price);
        System.out.println("Total sebelum pajak: " + hargaSebelumPajak);
        System.out.println("Pajak (10%): " + pajak);
        System.out.println("Harga total: " + total);
        System.out.println("Pembayaran dengan kartu: " + cashless);
    }
}
