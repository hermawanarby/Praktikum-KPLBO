package latihan5;

public class Pemain implements Comparable<Pemain> {
	// Atribut
	private String nama;
	private int noPunggung;
	private int gaji; //per minggu dalam rupiah
	
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
	
	@Override
	public int compareTo(Pemain paramT) {
		Pemain p = (Pemain) paramT;
		return this.noPunggung - p.getNoPunggung(); //Ascending
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

	public int getGaji() {
		return gaji;
	}

	public void setGaji(int gaji) {
		this.gaji = gaji;
	}
}
