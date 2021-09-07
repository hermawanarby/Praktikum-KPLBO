package latihan1;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Tim {
	private String nama;
	private List<Pemain> daftarPemain = new ArrayList<Pemain>();
	
	// Konstruktor
	public Tim() {
		nama = "";
	}
	
	public Tim(String nama) {
		this.nama = nama;
	}
	
	public void tambahPemain(Pemain pemain) {
		daftarPemain.add(pemain);
	}
	
	public void tampilPemain() {
		Iterator<Pemain> it = daftarPemain.iterator();
		while(it.hasNext()) {
			Pemain p = it.next();
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

	public List<Pemain> getDaftarPemain() {
		return daftarPemain;
	}

	public void setDaftarPemain(List<Pemain> daftarPemain) {
		this.daftarPemain = daftarPemain;
	}
	
	
}
