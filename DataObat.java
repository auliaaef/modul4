import java.util.Scanner;

public class DataObat {
    public static void main(String[] args){
        int pilih, jeniskelamin, umur, beratbadan;
        Scanner input = new Scanner(System.in);

        System.out.println("1). Obat 1 (Laki-Laki / Perempuan) ");
        System.out.println("2). Obat 2 (Laki-Laki) ");
        System.out.println("3). Obat 3 (Laki-Laki / Perempuan) ");
        System.out.print("Pilih Sebuah Tipe Obat : ");
        pilih = input.nextInt(); 
        
        switch (pilih){
            case 1:
                System.out.println("Jenis Kelamin Pasien");
                System.out.println("1. Laki-Laki");
                System.out.println("2. Perempuan");
                System.out.print("Pilih Jenis Kelamin : ");
                jeniskelamin = input.nextInt();

                switch(jeniskelamin){
                    case 1:
                        System.out.print("Masukkan Umur : ");
                        umur = input.nextInt();
                        if(umur > 21){
                            System.out.print("Masukkan Berat Badan : ");
                            beratbadan = input.nextInt();

                            if(beratbadan > 150){
                                System.out.println("Mendapat Obat Medication 1");
                            } else {
                                System.out.println("Tidak Mendapat Obat");
                            }
                        } else {
                            System.out.println("Tidak Mendapat Obat");
                        }
                    break;
                    case 2:
                        System.out.println("Masukkan Umur : ");
                        umur = input.nextInt();
                        if(umur < 21){
                            System.out.print("Masukkan Berat Badan : ");
                            beratbadan = input.nextInt();

                            if(beratbadan < 150){
                                System.out.println("Mendapat Obat Medication 1");
                            } else {
                                System.out.println("Tidak Mendapat Obat");
                            }
                        } else {
                            System.out.println("Tidak Mendapat Obat");
                        }
                    default:
                        System.out.println("Tidak sesuai dengan pilihan! Ulangi lagi!");
                } break;
            case 2:
                System.out.println("Jenis Kelamin Pasien");
                System.out.println("1. Laki-Laki");
                System.out.print("Pilih Jenis Kelamin : ");
                jeniskelamin = input.nextInt();

                switch(jeniskelamin){
                    case 1:
                        System.out.print("Masukkan Umur : ");
                        umur = input.nextInt();
                        if((umur > 21) || (umur < 21)){
                            System.out.print("Masukkan Berat Badan : ");
                            beratbadan = input.nextInt();

                            if(beratbadan > 150){
                                System.out.println("Mendapat Obat Medication 2");
                            } else {
                                System.out.println("Tidak Mendapat Obat");
                            }
                        } else {
                            System.out.println("Tidak Mendapat Obat");
                        }
                    break;
                    default:
                        System.out.println("Tidak sesuai dengan pilihan! Ulangi lagi!");
                } break;
            case 3:
                System.out.println("Jenis Kelamin Pasien");
                System.out.println("1. Laki-Laki");
                System.out.println("2. Perempuan");
                System.out.print("Pilih Jenis Kelamin : ");
                jeniskelamin = input.nextInt();

                switch(jeniskelamin){
                    case 1:
                        System.out.print("Masukkan Umur : ");
                        umur = input.nextInt();
                        if(umur < 21){
                            System.out.print("Masukkan Berat Badan : ");
                            beratbadan = input.nextInt();

                            if(beratbadan < 150){
                                System.out.println("Mendapat Obat Medication 3");
                            } else {
                                System.out.println("Tidak Mendapat Obat");
                            }
                        } else {
                            System.out.println("Tidak Mendapat Obat");
                        }
                    break;
                    case 2:
                        System.out.println("Masukkan Umur : ");
                        umur = input.nextInt();
                        if(umur < 21){
                            System.out.print("Masukkan Berat Badan : ");
                            beratbadan = input.nextInt();

                            if(beratbadan < 150){
                                System.out.println("Mendapat Obat Medication 3");
                            } else {
                                System.out.println("Tidak Mendapat Obat");
                            }
                        } else {
                            System.out.println("Tidak Mendapat Obat");
                        }
                    default:
                        System.out.println("Tidak sesuai dengan pilihan! Ulangi lagi!!");
                } break;
            default:
                System.out.println("Dimohon Untuk Input Kembali Sesuai Format!");
        }
    }
}
