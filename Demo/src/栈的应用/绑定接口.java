package ջ��Ӧ��;
/**
 * @author zhangS
 * @date 2017��9��1������2:08:12
 * @Email 260262911@qq.com
 * �����ͼ���һ���߽� �������÷��͵��д������ķ�����
 * �����ڲ�֪������������д ֻ������obj�ķ���
 */
public class �󶨽ӿ� {

	public <T extends Comparable<T>> T min(T...ts){
		T d=ts[0];
		for (T t : ts) {
			if (t.compareTo(d)<0) {
				d=t;
			}
		}
		return d;
	}
}
