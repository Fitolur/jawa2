import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

class codlab1 {
    public static void main(String[] args) {
        // Inisialisasi objek untuk membaca input dari pengguna
        Scanner scan = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan nama
        System.out.print("\nNama : ");
        String nama = scan.nextLine();

        // Meminta pengguna untuk masukkan jenis kelamin (L/P)
        System.out.print("Jenis Kelamin (L/P)");
        String Kelamin = scan.nextLine();

        // Meminta pengguna untuk masukkan tanggal lahir dalam format (yyy-mm-dd)
        System.out.print("Tanggal Lahir (yyyyy-mm-dd) : ");
        String tgl = scan.nextLine();

        // Menutup Scanner setelah mengambil input
        scan.close();

        // Mengubah input jenis kelamin menjadi format yang lebih mudah dibaca
        if(Kelamin.toLowerCase().equals("p")){
            Kelamin = "Perempuan";
        }else if (Kelamin.toLowerCase().equals("1")) {
            Kelamin = "Laki-Laki";
        }

        // Mengambil tanggal sekarang dan menghitung umur berdasarkan tanggal lahir
        LocalDate date = LocalDate.now();
        LocalDate tglx =LocalDate.parse(tgl);
        Period umur = Period.between(tglx, date);

        // Menampilkan infromasi yang telah dioleh
        System.out.println("\n\n\nNama : " + nama);
        System.out.println("Jenis Kelamin : " + Kelamin);
        System.out.println("Umur Anda : " + umur.getYears() + " Tahun " + umur.getMonths() + " Bulan ");
    }
}