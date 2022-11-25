package com.kh.chap01_poly.part02_electronic.model.vo;

public class NoteBook extends Electronic{
	
	private int usbProt;

	public NoteBook() {
		super();
	}

	public NoteBook(String brand, String name, int price, int usbProt) {
		super(brand, name, price);
		this.usbProt = usbProt;
	}

	public int getUsbProt() {
		return usbProt;
	}

	public void setUsbProt(int usbProt) {
		this.usbProt = usbProt;
	}

	@Override
	public String toString() {
		return "NoteBook [usbProt=" + usbProt + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
