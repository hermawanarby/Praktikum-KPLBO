/**
 * Created by Hermawan Arby 193040161 on 23/4/2021.
 */
package latihan3;

public class MesinATM {
	private Kartu kartu;
	private boolean otentikasi = false;
	
	public boolean validasiKartu(Kartu kartu) {
		return true;
	}
	
	public void cekPIN(Kartu kartu, String pin) {
		if (validasiKartu(kartu)) {
			if (kartu.otentikasi(pin)) {
				otentikasi = true;
				this.kartu = kartu;
			} else {
				otentikasi = false;
			}
		}
	}
	
	public void tarikTunai() {
		if (otentikasi == true) {
			System.out.println("Tarik tunai menggunakan Kartu "
					.concat(kartu instanceof KartuATM ? "ATM!" : "Kredit!"));
		} else {
			System.out.println("Tarik tunai Gagal!");
		}
	}
}
