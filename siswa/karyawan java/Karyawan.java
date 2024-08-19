public class Karyawan {
    int id;
    String nama;
    String unit;
    String alamat;

    public Karyawan() {
        id = 0;
        nama = "alex";
        unit = "rudi";
        alamat = "tia";
    }

    public Karyawan(int id, String nama, String unit, String alamat) {
        this.id = id;
        this.nama = nama;
        this.unit = unit;
        this.alamat = alamat;
    }

    public void print() {
        System.out.println("ID : "+id);
        System.out.println("Nama : "+nama);
        System.out.println("Unit : "+unit);
        System.out.println("Alamat : "+alamat);
    }
}