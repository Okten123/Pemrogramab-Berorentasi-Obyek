package id.ac.undiksha;
import id.ac.undiksha.entities.Dosen;
import id.ac.undiksha.entities.Pegawai;
import id.ac.undiksha.entities.Mahasiswa;

public class Main {

	public static void main(String[] args) {
		
		Mahasiswa mhs1 = new Mahasiswa();
		mhs1.setNama("Okthen Naitboho");
		mhs1.setNim("2115101015");
		mhs1.setAlamat("Singaraja");
		mhs1.setJenisKelamin(true);
		mhs1.setProdi("Ilmu Komputer");
		mhs1.setJurusan("Teknik Informatika");
		mhs1.setFakultas("Teknik dan Kejuruan");
		
		mhs1.printAllInfo();
		
	
		Dosen dsn1 = new Dosen();
		dsn1.setNama("pak Andi");
		dsn1.setNip("196839402");
		dsn1.setAlamat("Singaraja");
		dsn1.setJenisKelamin(true);
		dsn1.setJabatan("Koorprodi");
		
		dsn1.printAllInfo();
		
		Pegawai pgw1 = new Pegawai();
		pgw1.setNama("pak Rian");
		pgw1.setNip("197038524");
		pgw1.setAlamat("Buleleng");
		pgw1.setJenisKelamin(true);
		pgw1.setBidang("Tata usaha");
		
		pgw1.printAllInfo();
		
		
	}
	

}