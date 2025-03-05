public class LogicalOperators {
    public static void main(String[] args){
        //        Logical (&& || !)
        // inisialisasi peubah
        int a = 1;
        int b = 0;

        // Operasi logika
        System.out.println("A = " + a + "B = " + b);
        if(a == 0 && b == 0) {
            System.out.println("Logical a == 0 && b == 0 bernilai true");
            System.out.println("A dan B adalah nol");
        } else {
            System.out.println("Logical a == 0 && b == 0 bernilai false");
            System.out.println("A dan B keduanya atau salah satunya bukan nol");
        }
        if(a == 0 || b == 0) {
            System.out.println("Logical a == 0 || b == 0 bernilai true");
            System.out.println("Salah satu dari A dan B adalah nol");
        }
        if(!(a == 0)) {
            System.out.println("Logical !(a == 0) bernilai true");
            System.out.println("A bukanlah nol");
        }
        if(!(b == 1)) {
            System.out.println("Logical !(b == 1) bernilai true");
            System.out.println("B bukanlah satu");
        }


    }
}
