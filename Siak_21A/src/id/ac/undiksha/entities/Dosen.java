package id.ac.undiksha.entities;

public class Dosen {
	
	private String Nama;
	private String Nip;
	private String Alamat;
	private boolean JenisKelamin; //0 = perempuan, 1 = laki-laki
	private String Jabatan;
	
		
		public Dosen() {
			this.setNama("(nama belum diisi)");	
			this.setNip("(nama belum diisi)");	
			this.setAlamat("(nama belum diisi)");	
			this.setJabatan("(nama belum diisi)");	
		}
		
		public Dosen(String Nama, String Nip, String Alamat, boolean JenisKelamin, String Jabatan) {
			super();
			this.Nama = Nama;
			this.Nip = Nip;
			this.Alamat = Alamat;
			this.JenisKelamin = JenisKelamin;
			this.Jabatan = Jabatan;
		}
		
		public void printAllInfo() {
			System.out.println("Nama: "+ this.getNama());
			System.out.println("Nip: "+ this.getNip());
			System.out.println("alamat: "+ this.getAlamat());
			System.out.println("Jabatan: "+ this.getJabatan());
			
			System.out.println("Jenis Kelamin: " + (JenisKelamin ? "Laki-laki" : "Perempuan"));
		}

		public String getNama() {
			return Nama;
		}

		public void setNama(String nama) {
			Nama = nama;
		}

		public String getNip() {
			return Nip;
		}

		public void setNip(String nip) {
			Nip = nip;
		}

		public String getAlamat() {
			return Alamat;
		}

		public void setAlamat(String alamat) {
			Alamat = alamat;
		}

		public boolean isJenisKelamin() {
			return JenisKelamin;
		}

		public void setJenisKelamin(boolean jenisKelamin) {
			JenisKelamin = jenisKelamin;
		}

		public String getJabatan() {
			return Jabatan;
		}

		public void setJabatan(String jabatan) {
			Jabatan = jabatan;

		}
}
		
