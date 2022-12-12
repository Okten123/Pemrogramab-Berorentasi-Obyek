package id.ac.undiksha.entities;
public class Mahasiswa {
	private String nama;
	private String nim;
	private String alamat;
	private boolean jenisKelamin; //0 = perempuan, 1 = laki-laki
	private String prodi;
	private String jurusan;
	private String fakultas;
	
	public Mahasiswa() {
		this.setNama("(nama belum diisi)");	
		this.setNim("(nama belum diisi)");	
		this.setAlamat("(nama belum diisi)");	
		this.setProdi("(nama belum diisi)");	
		this.setJurusan("(nama belum diisi)");	
		this.setFakultas("(nama belum diisi)");	
	}
	
	
	
	public Mahasiswa(String nama, String nim, String alamat, boolean jenisKelamin, String prodi, String jurusan,
			String fakultas) {
		super();
		this.nama = nama;
		this.nim = nim;
		this.alamat = alamat;
		this.jenisKelamin = jenisKelamin;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}

	public void printAllInfo() {
		System.out.println("Nama: "+ this.getNama());
		System.out.println("NIM: "+ this.getNim());
		System.out.println("Alamat: "+ this.getAlamat());
		System.out.println("Prodi: "+ this.getProdi());
		System.out.println("Jurusan: "+ this.getJurusan());
		System.out.println("Fakultas: "+ this.getFakultas());
		
		System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
	}
	
	public String getProdi() {
		return prodi;
	}
	public void setProdi(String prodi) {
		this.prodi = prodi;
	}
	
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public boolean getJenisKelamin() {
		return jenisKelamin;
	}
	public void setJenisKelamin(boolean jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	public String getJurusan() {
		return jurusan;
	}
	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}
	public String getFakultas() {
		return fakultas;
	}
	public void setFakultas(String fakultas) {
		this.fakultas = fakultas;
	}
	
	
	
}