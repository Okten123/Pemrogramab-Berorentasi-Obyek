package id.ac.undiksha.entities;

public class Pegawai {
	private String Nama;
	private String Nip;
	private String Alamat;
	private boolean JenisKelamin; //0 = perempuan, 1 = laki-laki
	private String Bidang;
	
		
		public Pegawai() {
			this.setNama("(nama belum diisi)");	
			this.setNip("(nama belum diisi)");	
			this.setAlamat("(nama belum diisi)");	
			this.setBidang("(nama belum diisi)");	
		}
		
		public Pegawai(String Nama, String Nip, String Alamat, boolean JenisKelamin, String Bidang) {
			super();
			this.Nama = Nama;
			this.Nip = Nip;
			this.Alamat = Alamat;
			this.JenisKelamin = JenisKelamin;
			this.Bidang = Bidang;
		}
		
		public void printAllInfo() {
			System.out.println("Nama: "+ this.getNama());
			System.out.println("Nip: "+ this.getNip());
			System.out.println("alamat: "+ this.getAlamat());
			System.out.println("Bidang: "+ this.getBidang());
			
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

		public String getBidang() {
			return Bidang;
		}

		public void setBidang(String bidang) {
			Bidang = bidang;
		}
		
}