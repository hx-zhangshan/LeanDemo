package 策略者;
/**
* @author zhangS
* @date 2017年9月19日下午4:12:38
* @Email 260262911@qq.com
* 
* *********武器————模板
* 
* 这个类是用来讲述策略者模式的
* 策略者模式的大概公式：不同的XXX拥有不同的XXX供客户选择。
* 这里选择的例子是 ——》不同的人物选择不同的武器去战斗。
*/
public interface WeaponBehavior {
	//
	void useWeapon();
}
