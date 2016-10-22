import java.util.Scanner;

class SegitigaBintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j;
        int panjang;
        System.out.printf("Jumlah Karakter/Tinggi Segitiga :");
        panjang = input.nextInt();

        System.out.print("----------------------------------");

        // Segitiga siku kiri atas      
        for(i=0;i<=panjang;i++) {
            for(j=0; j<i; j++) {
                System.out.print("*");
            }
        System.out.print("\n");
        }
        System.out.println();

        // Segitiga siku kiri bawah
        for(i=0;i<panjang;i++) {
            for(j=i;j<panjang;j++) {
                System.out.print("*");
            }
        System.out.println();
        }
        
        // Segitiga siku kanan atas
        for(i=0; i<=panjang; i++) {
            for(j=0; j<(panjang-i); j++) {
                System.out.print(" ");
            }
            for(int k=0; k<i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Segitiga siku kanan bawah
        for(i=0; i<panjang; i++) {
            for(int k=0; k<i; k++) {
                System.out.print(" ");
            }
            for(j=0; j<(panjang-i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Segitigas sama kaki 
        for(i=0; i<=panjang; i++) {
            for (int m=1; m<=panjang-i; m++) {
                System.out.print (" ");
            }
            for (int m=1; m<2*i; m++) {
                System.out.print ("*");
            }
        System.out.println (" ");
        }
    }
}