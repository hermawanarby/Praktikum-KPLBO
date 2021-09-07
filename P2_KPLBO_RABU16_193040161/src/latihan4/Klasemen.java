package latihan4;

public class Klasemen {
	private int main;
	private int menang;
	private int seri;
	private int kalah;
	private Tim tim;
	
	public Klasemen(Tim tim) {
		super();
		this.tim = tim;
	}
	
	// Method tambahPertandinganTim1
	public void tambahPertandinganTim1(Pertandingan p) {
		main++;
		if (p.getStatusTim1() == Pertandingan.MENANG) {
			menang++;
		} else if (p.getStatusTim1() == Pertandingan.KALAH){
			kalah++;
		} else {
			seri++;
		}
	}
	
	// Setter dan Getter
	public int getMain() {
		return main;
	}

	public void setMain(int main) {
		this.main = main;
	}

	public int getMenang() {
		return menang;
	}

	public void setMenang(int menang) {
		this.menang = menang;
	}

	public int getSeri() {
		return seri;
	}

	public void setSeri(int seri) {
		this.seri = seri;
	}

	public int getKalah() {
		return kalah;
	}

	public void setKalah(int kalah) {
		this.kalah = kalah;
	}

	public Tim getTim() {
		return tim;
	}

	public void setTim(Tim tim) {
		this.tim = tim;
	}


	@Override
	public String toString() {
		return tim.getNama() + " # " + main + " : " + menang + 
				" - " + seri + " - " + kalah + " : N";
	}
}
