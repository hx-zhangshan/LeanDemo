package ������;

public class MainTest {

	public static void main(String[] args) {
		Character king = new King();
		king.performWeapon();
		//����������״̬ģʽ��
		king.setWeaponBehavior(new KinfeBeapon());
		king.performWeapon();
		Character queen=new Queen();
		queen.performWeapon();
	}
}
