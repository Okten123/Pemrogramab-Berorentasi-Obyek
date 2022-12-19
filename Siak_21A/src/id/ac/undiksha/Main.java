package id.ac.undiksha;

import id.ac.undiksha.entities.Mahasiswa;
import id.ac.undiksha.entities.Dosen;
import id.ac.undiksha.entities.Pegawai;

public class Main {

	public static void main(String[] args) {
		
		Mahasiswa mhs1 = new Mahasiswa(
			"ogan", 
			"Buleleng", 
			true, 
			"015", 
			"Ilmu Komputer", 
			"Teknik Informatika", 
			"Teknik dan Kejuruan"
		);
		
		Dosen dosen1 = new Dosen(
			"pak Andi", 
			"Singaraja", 
			true, 
			"002", 
			"Sistem Informasi", 
			"Teknik Informatika", 
			"Teknik dan Kejuruan", 
			"Wakil Dekan I"
		);
		
		Pegawai pgw1 = new Pegawai(
			"Roni", 
			"Singaraja", 
			false, 
			"003", 
			"Tata usaha"
		);
		
		Mahasiswa mhs2 = new Mahasiswa(
			"Nanni", 
			"Singaraja", 
			false, 
			"008", 
			"Ilmu Komputer", 
			"Teknik Informatika", 
			"Fakultas Teknik dan Kejuruan"
		);
		
		mhs1.printAllInfo();
		System.out.println();
		dosen1.printAllInfo();
		System.out.println();
		pgw1.printAllInfo();
		System.out.println();
		mhs2.printAllInfo();
	}

}