package latihan3;

public class Pemain {
	// Atribut
	private String nama;
	private int noPunggung;
	
	// Konstruktor
	public Pemain() {
		nama = "";
		noPunggung = 0;
	}

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
		return nama + " " + noPunggung;
	}
	
}
