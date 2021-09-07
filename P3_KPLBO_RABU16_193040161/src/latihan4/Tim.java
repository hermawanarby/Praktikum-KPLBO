package latihan4;

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
	
	// Method tambahPemain
	public void tambahPemain(Pemain pemain) {
		daftarPemain.add(pemain);
	}
	
	// Method tampilPemain
	public void tampilPemain() {
		Iterator<Pemain> it = daftarPemain.iterator();
		while(it.hasNext()) {
			Pemain p = it.next();
			System.out.println(p.getNoPunggung() + " # " + p.getNama() + " # " + p.getGaji());
		}
	}
	
	// Method hitungTotalGajiPerMinggu
	public int hitungTotalGajiPerMinggu() {
		int total = 0;
		Iterator<Pemain> it = daftarPemain.iterator();
		while(it.hasNext()) {
			Pemain p = it.next();
			total += p.getGaji();
		} 
		return total;
	}
	
	// Method hitungTotalGajiPerBulan
	public int hitungTotalGajiPerBulan() {
		int total = 0;
		Iterator<Pemain> it = daftarPemain.iterator();
		while(it.hasNext()) {
			Pemain p = it.next();
			total += hitungTotalGajiPerMinggu();
		} 
		return total;
	}
	
	// Method cekKebugaranPemain
	public void cekKebugaranPemain() {
		System.out.println("No. | Nama Pemain | Cedera | Kebugaran");
		Iterator<Pemain> it = daftarPemain.iterator();
		while(it.hasNext()) {
			Pemain p = it.next();
			System.out.println(p.getNoPunggung() + " # " + p.getNama() + 
					" # " + p.isCedera() + " # " + p.getKebugaran());
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
