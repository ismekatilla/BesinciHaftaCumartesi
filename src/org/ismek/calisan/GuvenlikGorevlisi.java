package org.ismek.calisan;

public class GuvenlikGorevlisi extends Calisan {

	String gorevYeri;
	boolean silahli;

	@Override
	void istenCikar() {
		System.out.println("Akşam 20:00 de işten çıkar.");
	}
	
	@Override
	void calisir() {
		System.out.println("Ben güvenlik görevlisiyim. Danışmada durur. Öğrencilere yardımcı olurum.");
	}
}