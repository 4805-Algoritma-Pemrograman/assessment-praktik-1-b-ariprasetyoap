
public class Nomor1{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total penjualan salesman: ");
        double totalPenjualan = input.nextDouble();

        double komisi;

        if (totalPenjualan <= 500000) {
            komisi = totalPenjualan * 0.10; 
        } else {
            double komisi500k = 500000 * 0.10; 
            double komisiSisanya = (totalPenjualan - 500000) * 0.15; 
            komisi = komisi500k + komisiSisanya;
        }

        System.out.println("Total penjualan salesman: " + totalPenjualan);
        System.out.println("Komisi yang didapatkan = " + komisi);
    }
}

Algoritma
Mulai.
Input total penjualan salesman.
Jika total penjualan kurang dari atau sama dengan Rp 500.000:
Hitung komisi = total penjualan * 10%.
Jika total penjualan lebih dari Rp 500.000:
Hitung komisi untuk Rp 500.000 pertama = Rp 500.000 * 10%.
Hitung sisa penjualan = total penjualan - Rp 500.000.
Hitung komisi untuk sisa penjualan = sisa penjualan * 15%.
Total komisi = komisi untuk Rp 500.000 + komisi untuk sisa penjualan.
Tampilkan total penjualan dan komisi yang didapat.
Selesai.
    


