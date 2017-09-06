package 栈的应用;


/**
 * @author zhangS
 * @date 2017年8月31日上午10:38:04
 * @Email 260262911@qq.com
 * @description 一办的情况下 一个类是无法继承一个泛型参数的，但是可以通过自绑定来实现
 * 你可以通过继承一个声明泛型参数的类 这就叫做自绑定
 */
public class Stacks<T extends Stacks<T>>{
	private void set() {
		A a = new A();

	}
}
