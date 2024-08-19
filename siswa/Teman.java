//Driver Class
public class Teman {
    public static void main(String[] args) {
        //object
        //Class object = new Constructor
        Siswa burhan = new Siswa();
        Siswa ibra = new Siswa();
        Siswa gilam = new Siswa();
        Siswa raihan = new Siswa();
        Siswa azam = new Siswa();
        
        burhan.nama = "burhanudin";
        burhan.ipk = 90;
        burhan.id =  26;

        ibra.nama = "ibras";
        ibra.ipk = 0.0;
        ibra.id = 29;

        gilam.nama = "m.gilam";
        gilam.ipk = 10;
        gilam.id = 19;

        raihan.nama = "raihan";
        raihan.ipk = 60;
        raihan.id = 11;

        azam.nama = "azam mahardika";
        azam.ipk = 1.1;
        azam.id = 22;
    
        System.out.println("Nama"+ burhan.nama);
        System.out.println("ipk: "+ burhan.ipk);
        System.out.println("id: "+ burhan.id);


        System.out.println("Nama: "+ ibra.nama);
        System.out.println("ipk: "+ ibra.ipk);
        System.out.println("id: "+ ibra.id);


        System.out.println("Nama: "+ gilam.nama);
        System.out.println("Nama: "+ gilam.ipk);
        System.out.println("Nama: "+ gilam.id);


        System.out.println("Nama: "+ raihan.nama);
        System.out.println("Nama: "+ raihan.ipk);
        System.out.println("Nama: "+ raihan.id);


        System.out.println("Nama: "+ azam.nama);
        System.out.println("Nama: "+ azam.ipk);
        System.out.println("Nama: "+ azam.id);

        
    }
}