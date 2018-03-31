package praktek02;

public class HelmrecAksi {
    public static void main(String[] args) {
       Helmrec j1 = new Helmrec();
       j1.Merk="NHK";
       j1.Total=2;
       j1.Harga=350;
       
       j1.Pakaihelm();
       System.out.println(" Jumlah ="+j1.Hitungjumlah());
       j1.Hitunghelm();
       
       Helmrec j2 = new Helmrec();
       j2.Hitunghelm();
       
       Helmrec j3 = new Helmrec("GM ", 250,2);
       j3.Hitunghelm();
    }
}
