package 栈的应用;
/**
 * @author zhangS
 * @date 2017年9月1日下午2:08:12
 * @Email 260262911@qq.com
 * 给泛型加上一个边界 就能运用泛型的中代表的类的方法了
 * 不让在不知道泛型类的情况写 只能用其obj的方法
 */
public class 绑定接口 {

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
