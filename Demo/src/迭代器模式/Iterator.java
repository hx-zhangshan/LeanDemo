package 迭代器模式;
/**
 * 示例：迭代器模式
 * @author cheney
 *
 */
public interface Iterator {
	//前移
	public Object previous();
	//后移
	public Object next();
	//判断是否 有下一个元素
	public boolean hasNext();
}
