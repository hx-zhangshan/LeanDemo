package װ����ģʽ;

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
		System.out.println("Ŀ�귽��ִ��֮ǰ222��������");
	}
	private void after(){
		System.out.println("Ŀ�귽��ִ��֮��2222��������");
	}
}
