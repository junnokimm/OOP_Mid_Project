package oop_project;

class Restaurant {
	private String[] itemNameList = { "Ÿ��", "�ҽ�", "���", "ġ��", "ä��", "����", "�긮��" };

	private int itemLen;
	private int[] itemPriceList;
	private int[] itemStockList;

	private int income;
	private int maxStock;
	

	Restaurant() {
		this.itemLen = this.itemNameList.length;
		this.itemPriceList = new int[this.itemLen];
		this.itemStockList = new int[this.itemLen];

		for (int i = 0; i < itemLen; i++) {
			this.itemPriceList[i] = (int)(Math.random() * 300) + 100;
			this.itemStockList[i] = 10;
		}

		this.income = 0;
		this.maxStock = 10;
	}

	public void PrintRestaurant() {
		for (int i = 0; i < itemLen; i++) {
			System.out
					.println("[" + itemNameList[i] + "] " + this.itemPriceList[i] + "��, ��� : " + this.itemStockList[i]);
		}
		System.out.println();
		return;
	}


	public void PrintIncome() {
		System.out.println("���� : " + this.income + "��\n");
		return;
	}

	public int GetItemLen() {
		return this.itemLen;
	}

	public String[] GetItemNameList() {
		return this.itemNameList;
	}

	
	public int[] GetItemStock() {
		return this.itemStockList;
	}

	public int[] GetItemPrice() {
		return this.itemPriceList;
	}

	public void AdjustIncome(int adjustIncome) {
		this.income += adjustIncome;
		return;
	}
	
	public void AdjustItemStock(int[] adjustItemStock) {
		for(int i = 0 ; i<this.itemStockList.length; i++) {
			this.itemStockList[i] -= adjustItemStock[i];
		}
		return;
	}

	public int GetIncome() {
		return this.income;
	}
	
	public void SetItemStock() {
		for(int i = 0 ; i< this.itemStockList.length; i++) {
			if(this.itemStockList[i] <= 0) {
				System.out.println("\n" + this.itemNameList[i] + "�� ������߽��ϴ�.");
				System.out.println(("���� " + this.itemPriceList[i] * (10 - this.itemStockList[i])) + "�� ����");
				this.income -= this.itemPriceList[i] * (10 - this.itemStockList[i]);
				this.itemStockList[i] = 10;
			}
		}
		return;
	}
	
	public void InitItemStock() {
		int decreaseIncome = 0;
		for(int i = 0 ; i< this.itemStockList.length; i++) {
			System.out.println(this.itemNameList[i] + "�� ������߽��ϴ�.");
			this.income -= this.itemPriceList[i] * (10 - this.itemStockList[i]);
			decreaseIncome += this.itemPriceList[i] * (10 - this.itemStockList[i]);
			this.itemStockList[i] = 10;
		}
		System.out.println("���� " + decreaseIncome + "�� ����");
		return;
	}

}
