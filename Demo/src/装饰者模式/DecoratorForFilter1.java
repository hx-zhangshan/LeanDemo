package װ����ģʽ;

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
		System.out.println("Ŀ�귽��ִ��֮ǰ111111��������");
	}
	private void after(){
		System.out.println("Ŀ�귽��ִ��֮��111111��������");
	}
}
