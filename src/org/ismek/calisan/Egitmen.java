package org.ismek.calisan;

public class Egitmen extends Calisan {

	String egitimTuru;
	Brans brans;
	
	@Override
	void calisir() {
		System.out.println("Ben " + brans.adi + " eğitmeniyim. Dersimin kodu "+ brans.kodu);
	}
}
