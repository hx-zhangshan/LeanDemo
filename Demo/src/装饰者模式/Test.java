package 装饰者模式;

public class Test {

	public static void main(String[] args) {
		Filter filter=new Filter();
		DecoratorForFilter1 decoratorForFilter1=
				new DecoratorForFilter1(new DecoratorForFilter2(filter));
		decoratorForFilter1.filter();
	}
}
