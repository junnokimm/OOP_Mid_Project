package oop_project;

public class Chef extends Restaurant {

	private String name;
	private String rank;
	private boolean[] cookableMenu;

	Chef() {

	}

	Chef(String name, int menuLen) {
		int rank = (int) (Math.random() * 4);

		if (rank == 0) {
			this.name = name;
			this.rank = "���ʼ���";
			this.cookableMenu = new boolean[menuLen];
			for (int i = 0; i < menuLen; i++) {
				this.cookableMenu[i] = true;
			}
		}

		else if (rank == 1) {
			this.name = name;
			this.rank = "�Ŵ���";
			this.cookableMenu = new boolean[menuLen];
			for (int i = 0; i < menuLen; i++) {
				this.cookableMenu[i] = true;
			}
			int temp = (int) (Math.random() * menuLen);
			this.cookableMenu[temp] = false;
		}

		else if (rank == 2) {
			this.name = name;
			this.rank = "�߽���";
			this.cookableMenu = new boolean[menuLen];
			for (int i = 0; i < menuLen; i++) {
				this.cookableMenu[i] = true;
			}
			int temp = (int) (Math.random() * menuLen);
			this.cookableMenu[temp] = false;
			int temp2 = (int) (Math.random() * menuLen);
			while (temp2 == temp) {
				temp2 = (int) (Math.random() * menuLen);
			}
			this.cookableMenu[temp2] = false;
		}

		else if (rank == 3) {
			this.name = name;
			this.rank = "�Ƹ�����Ʈ";
			this.cookableMenu = new boolean[menuLen];
			for (int i = 0; i < menuLen; i++) {
				this.cookableMenu[i] = false;
			}
			int temp = (int) (Math.random() * menuLen);
			this.cookableMenu[temp] = true;
		}

	}

	Chef(String name, int menuLen, int rank) {
		if (rank == 0) {
			this.name = name;
			this.rank = "���ʼ���";
			this.cookableMenu = new boolean[menuLen];
			for (int i = 0; i < menuLen; i++) {
				this.cookableMenu[i] = true;
			}
		}

		else if (rank == 1) {
			this.name = name;
			this.rank = "�Ŵ���";
			this.cookableMenu = new boolean[menuLen];
			for (int i = 0; i < menuLen; i++) {
				this.cookableMenu[i] = true;
			}
			int temp = (int) (Math.random() * menuLen);
			this.cookableMenu[temp] = false;
		}

		else if (rank == 2) {
			this.name = name;
			this.rank = "�߽���";
			this.cookableMenu = new boolean[menuLen];
			for (int i = 0; i < menuLen; i++) {
				this.cookableMenu[i] = true;
			}
			int temp = (int) (Math.random() * menuLen);
			this.cookableMenu[temp] = false;
			int temp2 = (int) (Math.random() * menuLen);
			while (temp2 == temp) {
				temp2 = (int) (Math.random() * menuLen);
			}
			this.cookableMenu[temp2] = false;
		}

		else if (rank == 3) {
			this.name = name;
			this.rank = "�Ƹ�����Ʈ";
			this.cookableMenu = new boolean[menuLen];
			for (int i = 0; i < menuLen; i++) {
				this.cookableMenu[i] = false;
			}
			int temp = (int) (Math.random() * menuLen);
			this.cookableMenu[temp] = true;
		}

	}

	public void PrintCookableMenu(int menuLen, Menu[] menuList) {
		System.out.println(this.name + "�� �丮 ������ �޴�");
		for (int i = 0; i < menuLen; i++) {
			if (this.cookableMenu[i]) {
				System.out.print(menuList[i].GetName() + " ");
			}
		}
		System.out.println("\n");
		return;
	}

	public String GetRank() {
		return this.rank;
	}

	public String GetName() {
		return this.name;
	}

}