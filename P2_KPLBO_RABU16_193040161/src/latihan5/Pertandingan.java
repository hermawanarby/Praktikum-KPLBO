package latihan5;

public class Pertandingan {
	private Tim tim1;
	private Tim tim2;
	private int skorTim1;
	private int skorTim2;
	
	// Konstanta: varibel yang tidak akan berubah nilainya
	public final static int KALAH = 0;
	public final static int SERI = 1;
	public final static int MENANG = 3;
	
	private int statusTim1;
	private int statusTim2;
	
	// Konstruktor dua parameter
	public Pertandingan(Tim tim1, Tim tim2) {
		this.tim1 = tim1;
		this.tim2 = tim2;
	}
	
	// Method hasilBertanding
	private void hasilBertanding() {
		if (skorTim1 > skorTim2) {
			statusTim1 = MENANG;
			statusTim2 = KALAH;
		} else if (skorTim1 < skorTim2) {
			statusTim1 = KALAH;
			statusTim2 = MENANG;
		} else {
			statusTim1 = SERI;
			statusTim2 = SERI;
		}
	}
	
	// Konstruktor dua parameter
	public void setSkor(int skorTim1, int skorTim2) {
		this.skorTim1 = skorTim1;
		this.skorTim2 = skorTim2;
		hasilBertanding();
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
	
	public int getStatusTim1() {
		return statusTim1;
	}

	public void setStatusTim1(int statusTim1) {
		this.statusTim1 = statusTim1;
	}

	public int getStatusTim2() {
		return statusTim2;
	}

	public void setStatusTim2(int statusTim2) {
		this.statusTim2 = statusTim2;
	}

	@Override
	public String toString() {
		return tim1.getNama() + " " + skorTim1 + " VS " + skorTim2 + " " + tim2.getNama() + " ";
	}
}
