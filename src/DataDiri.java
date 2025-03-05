public class DataDiri {
//    Implementasi class constructor OOP Java
//    Deklarasi peubah
    String nama;
    int usia;

//    class constructor
    public DataDiri(String x, int y){
        nama = x;
        usia = y;
    }
//Fungsi utama
    public static void main(String[] args) {
        DataDiri DataSaya = new DataDiri("Musyaffa", 20);
        System.out.println("Nama saya adalah " + DataSaya.nama);
        System.out.println("Usia saya adalah " + DataSaya.usia);
    }
}
