package 观察者模式;

import java.util.Observable;
import java.util.Observer;

/**
* @author zhangS
* @date 2017年9月22日上午10:26:37
* @Email 260262911@qq.com
* 
* 观察者 就是顾客  通过调用Observer的update来进行及时的更新市场菜价 获得最新的信息
*/
public class Customer implements Observer{
	//顾客的名字
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
		//判断是不是价格更新的套路
		if (obs instanceof Food&& ob instanceof Float) {
			Food food=(Food)obs;
			float price=(Float)ob;
			System.out.println("你好这个价格已经更新："+name+","+food.getName()+price+">>>");
			System.out.println(food.getPrice());
		}
		
	}

}
