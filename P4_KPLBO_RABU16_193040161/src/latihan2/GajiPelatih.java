package latihan2;

public class GajiPelatih extends Gaji {
	
	private int bonusJuara;
	
	public GajiPelatih() {
		super(); //memanggil konstruktor super class Gaji
	}
	
	public GajiPelatih(int gaji) {
		super(gaji);
	}
	
	public GajiPelatih(int gaji, int bonusJuara) {
		super(gaji);
		this.bonusJuara = bonusJuara;
	}
	
	@Override
	public int hitungGaji() {
		return super.hitungGaji() + bonusJuara;
	}

	
	// Setter dan Getter
	public int getBonusJuara() {
		return bonusJuara;
	}

	public void setBonusJuara(int bonusJuara) {
		this.bonusJuara = bonusJuara;
	}
}
