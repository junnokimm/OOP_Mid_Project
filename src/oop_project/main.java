package oop_project;

public class main {

	public static void main(String[] args) {
		Kitchen kitchen = new Kitchen();

		kitchen.PrintKitchen();
		
		kitchen.AddMenu("Ÿ��");
		kitchen.AddMenu("��Ÿ��");
		kitchen.AddMenu("������Ÿ��");
		
		kitchen.PrintMenuList();
		kitchen.PrintMenuListDetail();
		
		kitchen.AddChef("��ġ��1", 0);
		kitchen.AddChef("��ġ��2", 1);
		kitchen.AddChef("��ġ��3", 2);
		kitchen.AddChef("��ġ��4", 3);
		kitchen.AddChef("��ġ��5");
		kitchen.AddChef("��ġ��6");
		kitchen.PrintChefList();
		
	}

}
