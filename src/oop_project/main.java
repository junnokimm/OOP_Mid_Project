package oop_project;

public class main {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();

		restaurant.PrintRestaurant();
		
		restaurant.AddMenu("Ÿ��");
		restaurant.AddMenu("�긮��");
		restaurant.AddMenu("���� Ÿ��");
		restaurant.AddMenu("ũ������ Ÿ��");
		restaurant.AddMenu("�Ƕ��");
		restaurant.PrintMenuList();
		// restaurant.PrintMenuListDetail();
		
		restaurant.AddChef("�丮��1", 0);
		restaurant.AddChef("�丮��2", 1);
		restaurant.AddChef("�丮��3", 2);
		restaurant.AddChef("�丮��4", 3);
		restaurant.AddChef("�丮��5");
		restaurant.PrintChefList();
		// restaurant.PrintChefListDetail();
		
		restaurant.AddGuest(10);
		restaurant.AddGuest("���ѳ�");
		restaurant.AddGuest("���۳�", 1);
		restaurant.PrintGuestList();
		// restaurant.PrintGuestListDetail();
		
		restaurant.LeaveGuest(4);
		restaurant.PrintGuestList();
		restaurant.PrintIncome();
		
		restaurant.LeaveGuest(4);
		restaurant.PrintGuestList();
		restaurant.PrintIncome();
		
		restaurant.LeaveGuest(4);
		restaurant.PrintGuestList();
		restaurant.PrintIncome();
	}

}
