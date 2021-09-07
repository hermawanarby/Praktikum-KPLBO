package latihan1;

import java.util.List;
import java.util.ArrayList;

public class Tim {
	private String nama;
	private List<Pemain> pemainInti = new ArrayList<Pemain>();
	
	// Konstruktor
	public Tim() {
		nama = "";
	}
	
	public Tim(String nama) {
		this.nama = nama;
	}
	
	// Untuk menambahkan pemain inti
	public boolean tambahPemainInti(Pemain pemain) {
		if (pemainInti.size() < 11) {
			pemainInti.add(pemain);
			System.out.println(pemain.getNama() + " berhasil ditambahkan sebagai pemain inti.");
			return true;
		} else {
			System.out.println(pemain.getNama() + " tidak berhasil ditambahkan sebagai pemain inti.");
			return false;
		}
	}
	
	// Unutuk menampilkan noPunggung dan nama dari pemain inti
	public void tampilPemainInti() {
		for (int i = 0; i < pemainInti.size(); i++) {
			Pemain p = pemainInti.get(i);
			System.out.println(p.getNoPunggung() + " # " + p.getNama());
		}
	}

	// Setter dan Getter
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public List<Pemain> getPemainInti() {
		return pemainInti;
	}

	public void setPemainInti(List<Pemain> pemainInti) {
		this.pemainInti = pemainInti;
	}
}
