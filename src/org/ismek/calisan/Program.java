package org.ismek.calisan;

public class Program {

	public static void main(String[] args) {
		
		Brans javaBransi = new Brans();
		javaBransi.adi = "JAVA";
		javaBransi.kodu = "101";
		
		Brans androidBransi = new Brans();
		androidBransi.adi = "ANDROID";
		androidBransi.kodu = "102";
		
		Egitmen egitmenAtilla = new Egitmen();
		egitmenAtilla.adi = "Atilla";
		egitmenAtilla.soyadi = "KARTAL";
		egitmenAtilla.maas = 1000;
		egitmenAtilla.yas = 33;
		egitmenAtilla.egitimTuru = "BİLİŞİM";
		egitmenAtilla.brans = javaBransi;
		egitmenAtilla.calisir();
		
		Egitmen egitmenBurhan = new Egitmen();
		egitmenBurhan.adi = "BURHAN";
		egitmenBurhan.soyadi = "GÖK";
		egitmenBurhan.maas = 2000;
		egitmenBurhan.yas = 29;
		egitmenBurhan.egitimTuru = "BİLİŞİM";
		egitmenBurhan.brans = androidBransi;
		egitmenBurhan.calismaSaati = 20;
		egitmenBurhan.carpan = 3;
		egitmenBurhan.calisir();
		double burhaninMaasi = egitmenBurhan.maasHesapla();
		System.out.println(burhaninMaasi);
	}
}