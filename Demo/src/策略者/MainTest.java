package 策略者;

public class MainTest {

	public static void main(String[] args) {
		Character king = new King();
		king.performWeapon();
		//这里类似于状态模式？
		king.setWeaponBehavior(new KinfeBeapon());
		king.performWeapon();
		Character queen=new Queen();
		queen.performWeapon();
	}
}
