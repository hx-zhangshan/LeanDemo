package 栈的应用;
/**
 * @author zhangS
 * @date 2017年9月1日下午1:52:36
 * @Email 260262911@qq.com
 * 通过泛型进行坐标实现
 */
public class 坐标<T> {

	private T x;
	private T y;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	public static void main(String[] args) {
		坐标<Integer> zb = new 坐标<Integer>();
		zb.setX(12);
		zb.setY(21);
		System.out.println("x:"+zb.getX()+" "+"y:"+zb.getY());
	}
}
