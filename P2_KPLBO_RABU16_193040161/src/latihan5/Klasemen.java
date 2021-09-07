package latihan5;

public class Klasemen {
	private int main;
	private int menang;
	private int seri;
	private int kalah;
	private Tim tim;
	private int nilai;
	
	public Klasemen(Tim tim) {
		super();
		this.tim = tim;
	}
	
	// Method tambahPertandinganTim1
	public void tambahPertandinganTim1(Pertandingan p) {
		main++;
		if (p.getStatusTim1() == Pertandingan.MENANG) {
			menang++;
			nilai += 3;
		} else if (p.getStatusTim1() == Pertandingan.KALAH){
			kalah++;
			nilai += 0;
		} else {
			seri++;
			nilai += 1;
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
	
	public int getNilai() {
		return nilai;
	}

	public void setNilai(int nilai) {
		this.nilai = nilai;
	}

	@Override
	public String toString() {
		return tim.getNama() + " # " + main + " : " + menang + 
				" - " + seri + " - " + kalah + " : " + nilai;
	}
}
