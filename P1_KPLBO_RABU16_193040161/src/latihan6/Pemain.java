package latihan6;

public class Pemain {
	// Atribut
	private String nama;
	private int noPunggung;
	private int gaji;
	
	// Konstruktor parameter ada tiga
	public Pemain(String nama, int noPunggung, int gaji) {
		this.nama = nama;
		this.noPunggung = noPunggung;
		this.gaji = gaji;
	}
	
	// Method non-void (function)
	public int hitungGajiPerBulan() {
		return gaji * 4;
	}

	// Getter dan Setter
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public int getNoPunggung() {
		return noPunggung;
	}

	public void setNoPunggung(int noPunggung) {
		this.noPunggung = noPunggung;
	}
	
	public int getGaji() {
		return gaji;
	}

	public void setGaji(int gaji) {
		this.gaji = gaji;
	}

	// Method I/O
	// Override
	public String toString() {
		return noPunggung + ", " + nama + 
				"\ngaji per minggu: " + gaji + 
				"\ngaji per bulan: " + hitungGajiPerBulan();
	}
	
}
