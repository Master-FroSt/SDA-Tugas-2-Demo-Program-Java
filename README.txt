Hal baru yang dipelajari:

Dalam java, public class di awal kode program harus sama dengan nama file tersebut. Hal itu membuat cara kerja OOP dipengaruhi nama file juga. Public class merupakan bentuk fungsi. Dalam OOP, class menjadi sebuah object yang dapat diberi properti seperti inheritance, polymorphism, dan constructor. Nama dari class sangat penting karena itu yang akan digunakan untuk memanggilnya, yang mana itu harus sama juga dengan nama file.

TL;DR
Perhatikan cara pemberian nama file karena berpengaruh ke class dalam kode program. Satu file dalam sebuah program dianjurkan memiliki hanya satu kelas spesifik (sepertinya)

Catatan nama file OOP:
1. DataDiri itu implementasi constructor OOP
2. Armor itu implementasi Inheritance OOP

Update:
File .java dalam Java tidak perlu memiliki nama yang sama dengan public class di awal kode jika kata "public dihilangkan". DataDiri dan Armor kembali dinamai ConstructorOOP dan InheritanceOOP.

Update2:
File .java dapat memiliki lebih dari satu public class dengan satu berupa public class namaFile dan lainnya berupa public class sesuai kebutuhan OOP. Namun, IDE Java menyarankan public class namaFile memiliki scope static, contohnya public static class ConstructorOOP pada ConstructorOOP.java

Update3:
File inheritanceOOP.java tidak bisa memiliki public class Armor, tapi hanya class Armor sebagai superclass dan lainnya sebagai subclass. Kemudian public class namaFile ditulis seperti biasa

Update4:
Tambahan byte dan short dalam VariableAndDataTypes