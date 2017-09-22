package 观察者模式;

public class Test {

	public static void main(String[] args) {
		Food food=new Food("土豆", 3.0f);
		
		Customer customer1=new Customer("张张");
		Customer customer2=new Customer("张er");
		
		food.addObserver(customer2);
		food.addObserver(customer1);
		//价格设置了变化
		food.setPrice(33f);
		//名字没有设置变化
		food.setName("鸡鸡");
	}
}
