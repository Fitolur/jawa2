// Ini untuk mengimpor kelas Scanner agar bisa membaca input dan pengguna
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Library System =====");

        int choice;
        do {
            displayMenu(); // Menampilkan menu
            choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    loginAsStudent(input); // Pilihan 1: untuk Login sebagai mahasiswa
                    break;

                case 2:
                    loginAsAdmin(input); // Pilihan 2 : untuk Login sebagai admin
                    break;

                case 3:
                    System.out.println("Exiting the Library System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose again.");
            }

        } while (choice != 3);

        input.close(); // Sebagai penututp Scanner setelah di gunakan
    }

    // Menampilkan Menu
    private static void displayMenu() {
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Exit");
        System.out.print("Choose option (1-3): ");
    }

    // Proses login sebagai mahasiswa
    private static void loginAsStudent(Scanner input) {
        System.out.print("Enter your NIM: ");
        String nim = input.nextLine();
        if (isValidNIM(nim)) {
            System.out.println("Successful Login as Student");
        } else {
            System.out.println("User Not Found");
        }
    }

    // Proses login sebagai admin
    private static void loginAsAdmin(Scanner input) {
        System.out.print("Enter your user (admin): ");
        String adminUsername = input.nextLine();
        System.out.print("Enter your password (admin): ");
        String adminPassword = input.nextLine();
        if (isValidAdmin(adminUsername, adminPassword)) {
            System.out.println("Successful Login as Admin");
        } else {
            System.out.println("Admin User Not Found!");
        }
    }

    // Validasi format NIM
    private static boolean isValidNIM(String nim) { // Jadi kegunaan Validasi format untuk memeriksa apakah NIM terdiri dari 15 digit numerik atau tidak
        return nim.matches("\\d{15}");
    }

    // Validasi login admin
    private static boolean isValidAdmin(String username, String password) {  
        return "admin".equals(username) && "admin212".equals(password);
    }
}
