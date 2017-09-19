package 策略者;
/**
* @author zhangS
* @date 2017年9月19日下午4:24:59
* @Email 260262911@qq.com
* 将接口变成 抽象类的filed 易于进行封装
*/
public abstract class Character {

	protected WeaponBehavior weaponBehavior;


	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
	/**
	 * 这里有点像代理模式
	 */
	public void performWeapon(){
		//do something.....
		fight();
		weaponBehavior.useWeapon();
		
		//do something.....
	}
	public abstract void fight();
	
	
}
