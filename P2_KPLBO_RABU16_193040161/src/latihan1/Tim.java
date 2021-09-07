package latihan1;

public class Tim {
	private String nama;
	
	// Kostruktor tanpa parameter
	public Tim() {
		nama = "";
	}
	// Kostruktor satu parameter
	public Tim(String nama) {
		this.nama = nama;
	}
	
	// Setter dan Getter
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
}
