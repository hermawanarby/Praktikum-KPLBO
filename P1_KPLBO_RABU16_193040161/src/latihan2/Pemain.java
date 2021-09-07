package latihan2;

public class Pemain {
	// Atribut
	private String nama;
	private int noPunggung;

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
