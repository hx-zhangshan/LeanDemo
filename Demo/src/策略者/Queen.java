package 策略者;

public class Queen extends Character{

	public Queen() {
		weaponBehavior=new KinfeBeapon();
	}
	@Override
	public void fight() {
		System.out.println("皇后在战斗！！！！");
	}

}
