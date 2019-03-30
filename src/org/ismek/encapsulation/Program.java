package org.ismek.encapsulation;

public class Program {

	public static void main(String[] args) {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.dogumYili = 2001;
		ogrenci.setAdi("AHMET");
		ogrenci.setSoyadi("SELİM");
		
		String isim = ogrenci.getIsim();
		System.out.println(isim);
	}
}
