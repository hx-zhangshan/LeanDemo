package 装饰者模式;
/**
* @author zhangS
* @date 2017年9月27日上午9:21:36
* @Email 260262911@qq.com
* 装饰者模式的实现 ，就行是包装一样，比较继承更加的具有弹性
* 首先确定一点就是 目标的对象与 装饰者对像 必须是实现了同一个的接口
*/
public class Filter implements FilterAble{

	@Override
	public void filter() {
		System.out.println("目标对象的核心实现方法实现》》》》》》》》》》》》》》》");
		
	}

}
