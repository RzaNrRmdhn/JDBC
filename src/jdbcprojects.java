import java.util.ArrayList;
import java.util.Scanner;

public class jdbcprojects {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaModel mhs = new MahasiswaModel();
        String nama, npm, nama1, npm1;
        int choose;
        
        do{
            ArrayList<Mahasiswa> listMahasiswa = mhs.getMahasiswa();
            System.out.println("Selamat datang di Database Mahasiswa");
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.print("Masukkan pilihan: ");
            choose = input.nextInt();
            
            if(choose == 1){
                System.out.print("Masukkan nama: ");
                nama = input.next();
                System.out.print("Masukkan npm: ");
                npm = input.next();
                Mahasiswa mhs1 = new Mahasiswa(npm, nama); 
                System.out.println();
                mhs.addMahasiswa(mhs1); 
            }
            else if(choose == 2){
                for (int i = 0; i < listMahasiswa.size(); i++){
                    System.out.println("Nama : " + listMahasiswa.get(i).getNama());
                    System.out.println("NPM : " + listMahasiswa.get(i).getNpm());
                    System.out.println();
                }
                
                System.out.println("Masukkan NPM yang datanya ingin dirubah ");
                npm = input.next();
                
                System.out.print("Masukkan nama ");
                nama1 = input.next();
                System.out.print("Masukkan npm ");
                npm1 = input.next();
                
                Mahasiswa mhs1 = new Mahasiswa(npm, npm1, nama1);
                System.out.println();
                
                mhs.updateMahasiswa(mhs1); 
            }
            else if(choose == 3){
                for (int i = 0; i < listMahasiswa.size(); i++){
                    System.out.println("Nama : " + listMahasiswa.get(i).getNama());
                    System.out.println("NPM : " + listMahasiswa.get(i).getNpm());
                    System.out.println();
                }
                
                System.out.println("Masukkan NPM yang datanya ingin dihapus");
                npm = input.next(); 
                
                Mahasiswa mhs1 = new Mahasiswa(npm); 
                mhs.deleteMahasiswa(mhs1); 
            }
        }while(choose != 4);
            
    }
    
}
