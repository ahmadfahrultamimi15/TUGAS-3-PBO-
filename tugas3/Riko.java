package tugas3;

public class Riko {
    public static void main(String[] args){
// Membuat object
        Anton AntonRiko = new Anton();
        Anton AntonAnton = new Anton ();
        /* memanggil atribut dan memberi nilai */
        AntonAnton.nama = "anton";
        AntonAnton.Jeniskelamin = "laki-laki";
        AntonAnton.umur = 20;
        AntonRiko.nama = "riko";
        AntonRiko.Jeniskelamin = "laki-laki";
        AntonRiko.umur = 23;

        System.out.println("nama: " + AntonAnton.nama);
        System.out.println("Jenis Kelamin: " + AntonAnton.Jeniskelamin);
        System.out.println("Umur: " + AntonAnton.umur);
        System.out.println("nama: " + AntonRiko.nama);
        System.out.println("Jenis Kelamin: " + AntonRiko.Jeniskelamin);
        System.out.println("Umur: " + AntonRiko.umur);
    }
}
