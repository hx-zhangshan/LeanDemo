package �۲���ģʽ;

public class Test {

	public static void main(String[] args) {
		Food food=new Food("����", 3.0f);
		
		Customer customer1=new Customer("����");
		Customer customer2=new Customer("��er");
		
		food.addObserver(customer2);
		food.addObserver(customer1);
		//�۸������˱仯
		food.setPrice(33f);
		//����û�����ñ仯
		food.setName("����");
	}
}
