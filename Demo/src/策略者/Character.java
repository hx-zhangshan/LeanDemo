package ������;
/**
* @author zhangS
* @date 2017��9��19������4:24:59
* @Email 260262911@qq.com
* ���ӿڱ�� �������filed ���ڽ��з�װ
*/
public abstract class Character {

	protected WeaponBehavior weaponBehavior;


	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
	/**
	 * �����е������ģʽ
	 */
	public void performWeapon(){
		//do something.....
		fight();
		weaponBehavior.useWeapon();
		
		//do something.....
	}
	public abstract void fight();
	
	
}
