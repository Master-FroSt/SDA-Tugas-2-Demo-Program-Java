//Implementasi Inheritance OOP Java
class Armor {
    String name;
    int durability;
}
    // Subclass: LeatherArmor
    class ChestPiece extends Armor {
        int defense;
    }
    class boots extends Armor {
        int speed;
    }

//Program utama
public class InheritanceOOP {
    public static void main(String[] args){
        // Inisialisasi class yang diwariskan secara manual (tanpa constructor)
        ChestPiece leather = new ChestPiece();
        leather.name = "Leather ChestPiece";
        leather.defense = 10;
        leather.durability = 50;

        ChestPiece iron = new ChestPiece();
        iron.name = "Iron ChestPiece";
        iron.defense = 30;
        iron.durability = 150;

        ChestPiece diamond = new ChestPiece();
        diamond.name = "Diamond ChestPiece";
        diamond.defense = 50;
        diamond.durability = 500;

        boots sandals = new boots();
        sandals.name = "sandals";
        sandals.speed = 10;
        sandals.durability = 50;

        boots runningShoes = new boots();
        runningShoes.name = "runningShoes";
        runningShoes.speed = 30;
        runningShoes.durability = 150;

        // Mencetak nilai masing-masing objek
        System.out.println("Chestpiece yang tersedia: ");
        System.out.println(leather.name + "\tDefense: " + leather.defense + ", Durability: " + leather.durability);
        System.out.println(iron.name + "\t\tDefense: " + iron.defense + ", Durability: " + iron.durability);
        System.out.println(diamond.name + "\tDefense: " + diamond.defense + ", Durability: " + diamond.durability);
        System.out.println("==============================================");
        System.out.println("Boots yang tersedia: ");
        System.out.println(sandals.name + "\t\t\tSpeed: " + sandals.speed + ", Durability: " + sandals.durability);
        System.out.println(runningShoes.name + "\tSpeed: " + runningShoes.speed + ", Durability: " + runningShoes.durability);
    }
}
