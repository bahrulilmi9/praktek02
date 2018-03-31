package praktek02;

public class Helmrec {
    String Merk;
    double Total;
    double Harga;
    
    void Pakaihelm(){
        System.out.println("+------------------");
        System.out.println("| Merk = "+Merk);
        System.out.println("| Total = "+Total);
        System.out.println("| Harga = "+Harga);
        System.out.println("+-----------------");
    }
    
    double Hitungjumlah(){
        double Jumlah;
        Jumlah= Harga*Total;
        return Jumlah;
    }
}