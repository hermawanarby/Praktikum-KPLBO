package latihan1;

public class Pertandingan {
	private Tim tim1;
	private Tim tim2;
	private int skorTim1;
	private int skorTim2;
	
	// Konstruktor dua parameter
	public Pertandingan(Tim tim1, Tim tim2) {
		this.tim1 = tim1;
		this.tim2 = tim2;
	}
	
	// Konstruktor dua parameter
	public void setSkor(int skorTim1, int skorTim2) {
		this.skorTim1 = skorTim1;
		this.skorTim2 = skorTim2;
	}
	
	// Setter dan Getter
	public Tim getTim1() {
		return tim1;
	}

	public void setTim1(Tim tim1) {
		this.tim1 = tim1;
	}

	public Tim getTim2() {
		return tim2;
	}

	public void setTim2(Tim tim2) {
		this.tim2 = tim2;
	}

	public int getSkorTim1() {
		return skorTim1;
	}

	public void setSkorTim1(int skorTim1) {
		this.skorTim1 = skorTim1;
	}

	public int getSkorTim2() {
		return skorTim2;
	}

	public void setSkorTim2(int skorTim2) {
		this.skorTim2 = skorTim2;
	}

	@Override
	public String toString() {
		return tim1.getNama() + " " + skorTim1 + " VS " + skorTim2 + " " + tim2.getNama() + " ";
	}
}
