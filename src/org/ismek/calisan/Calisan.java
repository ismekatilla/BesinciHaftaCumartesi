package org.ismek.calisan;

public class Calisan {

	String adi;
	String soyadi;
	byte yas;
	double maas = 1000;
	int calismaSaati;
	int carpan;
	
	void calisir() {
		System.out.println("Çok pis çalıştım.");
	}
	
	void iseGelir() {
		System.out.println("Sabah 08:00 de işe gelir");
	}
	
	void istenCikar() {
		System.out.println("Akşam 18:00 de işten çıkar");
	}
	
	double maasHesapla() {
		return calismaSaati * maas * carpan;
	}
}