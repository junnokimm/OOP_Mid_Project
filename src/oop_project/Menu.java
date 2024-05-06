package oop_project;

public class Menu extends Kitchen {

	private String name;
	private int price;
	private int[] useItemList;

	Menu() {

	}

	Menu(String name) {
		this.name = name;
		this.price = 0;
		this.useItemList = new int[super.GetitemLen()];
		for (int i = 0; i < super.GetitemLen(); i++) {
			useItemList[i] = (int) (Math.random() * 3);
			this.price += useItemList[i] * super.GetItemPrice()[i];
		}
		this.price *= 1.2f;
	}

	public void PrintItem(String[] itemNameList) {
		System.out.println("[" + this.name + "] " + this.price + "��");
		return;
	}

	public void PrintItemDetail(String[] itemNameList) {
		System.out.println("[" + this.name + "] " + this.price + "��");
		for (int i = 0; i < useItemList.length; i++) {
			System.out.print(itemNameList[i] + this.useItemList[i] + "�� ");
		}
		System.out.println();
		return;
	}

	public String GetName() {
		return this.name;
	}

	public int GetPrice() {
		return this.price;
	}
}