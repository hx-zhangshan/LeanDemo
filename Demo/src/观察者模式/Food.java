package 观察者模式;

import java.util.Observable;

/**
* @author zhangS
* @date 2017年9月19日下午5:34:37
* @Email 260262911@qq.com
*这个类主要是用来讲述 观察者模式的 
*所谓观察者模式 就是在对象之间定义了一对多的关系。当一个
*对象改变的时候 会通知所有与他关联的类
* 主要是体现在 java自带的observable和observer接口上
* 
* Describe 本例用市场买菜 当菜价变化的时候或通知所有的业主变化
*/
public class Food extends Observable{

	private String name;
	private float price;
	//菜名和菜价
	
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
		//设置变化的菜价的时候 就要改变
		this.setChanged();
		//通知所有的顾客 在看菜得这个价格已经 变化了
		this.notifyObservers(price);
	}
	
}
