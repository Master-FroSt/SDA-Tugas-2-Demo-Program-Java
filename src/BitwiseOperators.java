public class BitwiseOperators {
    public static void main(String[] args){
        //        Bitwise (& | ^ ~ << >> >>>)
        //Variables Definition and Initialization
        int a = 15, b = 8, c;
        String aBit = Integer.toBinaryString(a);
        String bBit = Integer.toBinaryString(b);
        System.out.println("Angka a adalah " + a + " dengan biner " + aBit);
        System.out.println("Angka b adalah " + b + " dengan biner " + bBit);

        System.out.println("---------------------------------------");
        // Bitwise AND
        System.out.println("Operasi a & b (AND) = " + (a & b) + " atau " + Integer.toBinaryString(a & b));

        // Bitwise OR
        System.out.println("Operasi a | b (OR) = " + (a | b) + " atau " + Integer.toBinaryString(a | b));

        // Bitwise XOR
        System.out.println("Operasi a ^ b (XOR) = " + (a ^ b) + " atau " + Integer.toBinaryString(a ^ b));

        // Binary Complement Operator
        System.out.println("Operasi ~a (interpretasi 2's Complement) = " + ~a + " atau " + Integer.toBinaryString(~a));

        // Binary Right Shift Operator
        c = a >> 2;
        System.out.println("Operasi a >> 2 (Right Shift) = " + c + " atau " + Integer.toBinaryString(c));

        // Binary Left Shift Operator
        c = b << 2;
        System.out.println("Operasi b << 2 = (Left Shift) " + c + " atau " + Integer.toBinaryString(c));

        // Shift Right Zero Fill Operator
        c = a >>> 2;
        System.out.println("Operasi a >>> 2 (Shift Right Zero Fill) = " + c + " atau " + Integer.toBinaryString(c));

    }
}
