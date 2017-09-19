package 策略者;

public class King extends Character{

	public King() {
			weaponBehavior=new BowAndArrowBeapon();
	}
	@Override
	public void fight() {
		System.out.println("国王在战斗！！！！！");
		
	}

}
