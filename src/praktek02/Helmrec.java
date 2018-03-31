package praktek02;

public class Helmrec {
    String Merk;
    double Total;
    double Harga;

    public Helmrec() {
        Merk="INK";
        Total=2;
        Harga=380;
    }

    public Helmrec(String Merk, double Total, double Harga) {
        this.Merk = Merk;
        this.Total = Total;
        this.Harga = Harga;
    }
    
    
    
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
    void Hitunghelm(){
        System.out.println("Jumlah Adalah :"+Hitungjumlah());
    }
    
}