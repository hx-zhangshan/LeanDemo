package �۲���ģʽ;

import java.util.Observable;

/**
* @author zhangS
* @date 2017��9��19������5:34:37
* @Email 260262911@qq.com
*�������Ҫ���������� �۲���ģʽ�� 
*��ν�۲���ģʽ �����ڶ���֮�䶨����һ�Զ�Ĺ�ϵ����һ��
*����ı��ʱ�� ��֪ͨ����������������
* ��Ҫ�������� java�Դ���observable��observer�ӿ���
* 
* Describe �������г���� ���˼۱仯��ʱ���֪ͨ���е�ҵ���仯
*/
public class Food extends Observable{

	private String name;
	private float price;
	//�����Ͳ˼�
	
	public Food(String name,float price){
		this.name=name;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
		//���ñ仯�Ĳ˼۵�ʱ�� ��Ҫ�ı�
		this.setChanged();
		//֪ͨ���еĹ˿� �ڿ��˵�����۸��Ѿ� �仯��
		this.notifyObservers(price);
	}
	
}
