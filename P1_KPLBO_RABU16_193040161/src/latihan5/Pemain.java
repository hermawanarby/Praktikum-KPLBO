package latihan5;

public class Pemain {
	// Atribut
	private String nama;
	private int noPunggung;
	
	// Konstruktor parameter ada dua
	public Pemain(String nama, int noPunggung) {
		this.nama = nama;
		this.noPunggung = noPunggung;
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

	// Method I/O
	// Override
	public String toString() {
		return noPunggung + ", " + nama;
	}
	
}
