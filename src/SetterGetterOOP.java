class Mahasiswa {
    private String NIM;
    private String Nama;

    // method setter
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    // method getter
    public String getNIM(){
        return this.NIM;
    }
    public String getNama(){
        return this.Nama;
    }
}


public class SetterGetterOOP {
    public static void main(String[] args) {
//        Membuat data mahasiswa dengan Setter
        Mahasiswa Mus = new Mahasiswa();
        Mus.setNIM("L0120001");
        Mus.setNama("Musyaffa");
//        Mengembalikan data mahasiswa dengan getter
        System.out.println("NIM: "+Mus.getNIM());
        System.out.println("Nama: "+Mus.getNama());
    }
}
