package latihan3;

public class GajiPemain extends Gaji {
	
	private int bonusMenang;
	private int bonusGol;
	
	public GajiPemain() {
		super();
	}
	
	public GajiPemain(int gaji) {
		super(gaji);
	}
	
	public GajiPemain(int gaji, int bonusMenang, int bonusGol) {
		super(gaji);
		this.bonusMenang = bonusMenang;
		this.bonusGol = bonusGol;
	}
	
	@Override
	public int hitungGaji() {
		return super.gaji + bonusMenang + bonusGol;
	}
	
	// Setter dan Getter
	public int getBonusMenang() {
		return bonusMenang;
	}

	public void setBonusMenang(int bonusMenang) {
		this.bonusMenang = bonusMenang;
	}

	public int getBonusGol() {
		return bonusGol;
	}

	public void setBonusGol(int bonusGol) {
		this.bonusGol = bonusGol;
	}
}
