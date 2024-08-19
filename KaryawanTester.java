//object class
public class KaryawanTester {
    public static void main(String[] args) {
        // object
        // Class object = new Construction
        Karyawan Ibra = new Karyawan(26,"Ibra","TU","TulungAgung");
        Karyawan Burhan = new Karyawan(29,"Burhan","Kesiswaan","Lamongan");
        Karyawan Kinza = new Karyawan(21,"Melvin","TU","Sidoarjo");
        Karyawan Gilam = new Karyawan(19,"Gilam","Kesiswaan","Papua");
        Karyawan Melvin = new Karyawan(15,"Kinza","Kurikulum","Malang");

        Burhan.print();
        System.out.println();
        Ibra.print();
        System.out.println();
        Melvin.print();
        System.out.println();
        Gilam.print();
        System.out.println();
        Kinza.print();
    }
}