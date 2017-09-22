package �۲���ģʽ;

import java.util.Observable;
import java.util.Observer;

/**
* @author zhangS
* @date 2017��9��22������10:26:37
* @Email 260262911@qq.com
* 
* �۲��� ���ǹ˿�  ͨ������Observer��update�����м�ʱ�ĸ����г��˼� ������µ���Ϣ
*/
public class Customer implements Observer{
	//�˿͵�����
	private String name;
	public Customer(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable obs, Object ob) {
		//�ж��ǲ��Ǽ۸���µ���·
		if (obs instanceof Food&& ob instanceof Float) {
			Food food=(Food)obs;
			float price=(Float)ob;
			System.out.println("�������۸��Ѿ����£�"+name+","+food.getName()+price+">>>");
			System.out.println(food.getPrice());
		}
		
	}

}
