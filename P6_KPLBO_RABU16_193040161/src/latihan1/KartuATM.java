/**
 * Created by Hermawan Arby 193040161 on 23/4/2021.
 */
package latihan1;

public class KartuATM extends KartuElektronik {
	
	public KartuATM(String kodeBank, String PIN) {
		super(kodeBank, PIN);
	}
	
	@Override
	public String encode(String PIN) {
		// Encrypt dengan metode X
		return PIN.concat("X");
	}
}
