package org.ismek.button;

public class DeleteButton extends Button {

	public DeleteButton() {
		color = "KIRMIZI";
		icon = "D";
	}

	@Override
	public void click() {
		System.out.println("Kayıt silme işlemini yaptık");
	}
}
