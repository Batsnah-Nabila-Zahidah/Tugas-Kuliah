import java.util.Scanner;

public class AOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean pilihan = true;

        while (pilihan) {
            System.out.println("PILIHAN");
            System.out.println("0. Biner ke Desimal");
            System.out.println("1. Desimal ke Biner");
            System.out.println("2. Biner ke Hexa");
            System.out.println("3. Hexa ke Biner");
            System.out.println("4. Desimal ke Hexa");
            System.out.println("5. Hexa ke Desimal");
            System.out.println("6. Keluar");
            System.out.print("MASUKKAN PILIHAN ANDA : ");
            int nomor = input.nextInt();

            int desimal, desimal2, desimal3, desimal4;
            String biner, biner2, biner3, biner4, hexa, hexa2, hexa3, hexa4;

            switch (nomor) {
                case 0:
                    System.out.print("Masukkan angka biner: ");
                    biner = input.next();
                    desimal = Integer.parseInt(biner, 2);
                    System.out.println("Desimal: " + desimal);
                    break;
                case 1:
                    System.out.print("Masukkan angka desimal: ");
                    desimal2 = input.nextInt();
                    biner2 = Integer.toBinaryString(desimal2);
                    System.out.println("Biner: " + biner2);
                    break;
                case 2:
                    System.out.print("Masukkan angka biner: ");
                    biner3 = input.next();
                    hexa = Integer.toHexString(Integer.parseInt(biner3, 2)).toUpperCase();
                    System.out.println("Hexadesimal: " + hexa);
                    break;
                case 3:
                    System.out.print("Masukkan angka hexa: ");
                    hexa2 = input.next();
                    biner4 = Integer.toBinaryString(Integer.parseInt(hexa2, 16)).toUpperCase();
                    System.out.println("Biner: " + biner4);
                    break;
                case 4:
                    System.out.print("Masukkan angka desimal: ");
                    desimal3 = input.nextInt();
                    hexa3 = Integer.toHexString(desimal3);
                    System.out.println("Hexa: " + hexa3);
                    break;
                case 5:
                    System.out.print("Masukkan angka hexa: ");
                    hexa4 = input.next();
                    desimal4 = Integer.parseInt(hexa4, 16);
                    System.out.println("Desimal: " + desimal4);
                    break;
                case 6:
                    pilihan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}
