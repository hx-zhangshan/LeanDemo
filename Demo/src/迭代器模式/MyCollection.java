package µü´úÆ÷Ä£Ê½;

public class MyCollection implements Collection{
	private String[] array={"aa","bb","cc","dd"};
	@Override
	public Iterator iterator() {
		
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		
		return array[i];
	}

	@Override
	public int size() {
	
		return array.length;
	}

}
