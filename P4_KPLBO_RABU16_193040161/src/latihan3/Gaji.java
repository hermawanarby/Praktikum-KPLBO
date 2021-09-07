package latihan3;

public abstract class Gaji {
	
	protected int gaji;
	
	public Gaji() {
		gaji = 0;
	}
	
	public Gaji(int gaji) {
		this.gaji = gaji;
	}
	
	public int hitungGaji() {
		return gaji;
	}

	// Setter dan Getter
	public int getGaji() {
		return gaji;
	}

	public void setGaji(int gaji) {
		this.gaji = gaji;
	}
}
