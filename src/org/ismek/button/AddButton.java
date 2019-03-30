package org.ismek.button;

public class AddButton extends Button {

	public AddButton() {
		color = "YEŞİL";
		icon = "S";
	}
	
	@Override
	public void click() {
		System.out.println("Yeni kaydı sisteme ekledik");
	}
}
