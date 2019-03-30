package org.ismek.encapsulation;

public class Ogrenci {

	private String adi;
	private String soyadi;
	private String isim;
	public int dogumYili;
	protected String tcKimlikNo;
	int ogrenciNumarasi;
	
	public String getIsim() {
		return adi + " " + soyadi;
	}
	
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}


	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}


	@Override
	public String toString() {
		return adi;
	}
}
