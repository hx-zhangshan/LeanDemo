package ջ��Ӧ��;
/**
 * @author zhangS
 * @date 2017��9��1������1:52:36
 * @Email 260262911@qq.com
 * ͨ�����ͽ�������ʵ��
 */
public class ����<T> {

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
		����<Integer> zb = new ����<Integer>();
		zb.setX(12);
		zb.setY(21);
		System.out.println("x:"+zb.getX()+" "+"y:"+zb.getY());
	}
}
