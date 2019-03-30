package org.ismek.kalitim;

public class Program {

	public static void main(String[] args) {
		CepTelefonu cepTelefonu = new CepTelefonu();
		cepTelefonu.tusTakimi = "MANUEL";
		cepTelefonu.simKart = "TURK TELEKOM";
		cepTelefonu.ekranCozunurlugu = "1024*768";
		cepTelefonu.calarkenTitre = false;
		cepTelefonu.aramaSesiCikar();
	}

}
