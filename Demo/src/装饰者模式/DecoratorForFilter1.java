package 装饰者模式;

public class DecoratorForFilter1 implements FilterAble{

	private FilterAble filterAble;
	public DecoratorForFilter1(FilterAble filterAble) {
		this.filterAble=filterAble;
	}
	@Override
	public void filter() {
		before();
		filterAble.filter();
		after();
		
	}

	private void before(){
		System.out.println("目标方法执行之前111111！！！！");
	}
	private void after(){
		System.out.println("目标方法执行之后111111！！！！");
	}
}
