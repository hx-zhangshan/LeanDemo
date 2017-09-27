package 装饰者模式;

public class DecoratorForFilter2 implements FilterAble{

	private FilterAble filterAble;
	public DecoratorForFilter2(FilterAble filterAble) {
		this.filterAble=filterAble;
	}
	@Override
	public void filter() {
		before();
		filterAble.filter();
		after();
		
	}

	private void before(){
		System.out.println("目标方法执行之前222！！！！");
	}
	private void after(){
		System.out.println("目标方法执行之后2222！！！！");
	}
}
