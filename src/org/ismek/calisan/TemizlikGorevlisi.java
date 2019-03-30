package org.ismek.calisan;

public class TemizlikGorevlisi extends Calisan {

	String gorevYeri;
	String kullandigiMalzeme;
	
	@Override
	void iseGelir() {
		System.out.println("Sabah 06:00 da işe gelir");
	}
	
	@Override
	void calisir() {
		System.out.println("Ben temizlik görevlisiyim. Masaları siler, temizlik yaparım");
	}
}
