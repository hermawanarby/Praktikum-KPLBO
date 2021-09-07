package latihan4;

public class Pemain {
	// Atribut
	private String nama;
	private int noPunggung;
	private GajiPemain gaji;
	
	// Konstruktor
	public Pemain(String nama, int noPunggung, GajiPemain gaji) {
		this.nama = nama;
		this.noPunggung = noPunggung;
		this.gaji = gaji;
	}
	
	// Setter dan Getter
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
	
	public GajiPemain getGaji() {
		return gaji;
	}
	
	public void setGaji(GajiPemain gaji) {
		this.gaji = gaji;
	}
	
	@Override
	public String toString() {
		return noPunggung + ", " + nama + 
				"\ngaji: " + gaji.getGaji() +
				"\nbonus menang: " + gaji.getBonusMenang() + 
				"\nbonus gol: " + gaji.getBonusGol() + "\n";
	}
}
