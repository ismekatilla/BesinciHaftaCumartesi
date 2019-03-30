package org.ismek.kalitim;

public class CepTelefonu extends Telefon {

	String ekranCozunurlugu;
	String simKart;
	boolean calarkenTitre = true;
	
	public CepTelefonu() {
		System.out.println("Cep Telefonu Kurucu çağrıldı");
	}
	
	public void titresimYap() {
		System.out.println("ZIIIIIIIIIIIIII");
	}
	
	@Override
	public void aramaSesiCikar() {
		System.out.println("BİİİİP BİP BİİİİİİİPPP");
		if (calarkenTitre) {
			titresimYap();
		}
	}
}
