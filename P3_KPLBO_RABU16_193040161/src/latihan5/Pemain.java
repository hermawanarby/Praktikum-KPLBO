package latihan5;

public class Pemain {
	// Atribut
	private String nama;
	private int noPunggung;
	private int gaji; //per minggu dalam rupiah
	private int kebugaran;
	private boolean cedera;
	
	// Konstruktor
	public Pemain() {
		this("");
	}
	
	public Pemain(String nama) {
		this(nama, 0);
	}
	
	public Pemain(String nama, int noPunggung) {
		this(nama, noPunggung, 0);
	}
	
	public Pemain(String nama, int noPunggung, int gaji) {
		this.nama = nama;
		this.noPunggung = noPunggung;
		this.gaji = gaji;
	}
	
	public Pemain(String nama, int noPunggung, int kebugaran, boolean cedera) {
		this(nama, noPunggung);
		this.kebugaran = kebugaran;
		this.cedera = cedera;
	}
	
	// Method Domain
	public int hitungGajiPerbulan() {
		return gaji * 4;
	}
	
	// Setter dan getter
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
	
	public int getKebugaran() {
		return kebugaran;
	}

	public void setKebugaran(int kebugaran) {
		this.kebugaran = kebugaran;
	}

	public boolean isCedera() {
		return cedera;
	}

	public void setCedera(boolean cedera) {
		this.cedera = cedera;
	}

	@Override
	public String toString() {
		return noPunggung + ", " + nama +
				"\ngaji per minggu: " + gaji +
				"\ngaji per bulan: " + hitungGajiPerbulan() +
				"\n";
	}
}
