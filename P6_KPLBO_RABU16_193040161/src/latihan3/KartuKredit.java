/**
 * Created by Hermawan Arby 193040161 on 23/4/2021.
 */
package latihan3;

public class KartuKredit extends KartuElektronik {
	
	public KartuKredit(String kodeBank, String PIN) {
		super(kodeBank, PIN);
	}
	
	@Override
	public String encode(String PIN) {
		return PIN.concat("Y");
	}
}
