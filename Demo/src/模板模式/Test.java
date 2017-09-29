package 模板模式;
/**
* @author zhangS
* @date 2017年9月29日下午1:23:21
* @Email 260262911@qq.com
* 模板模式：模板方法就是定义了一个算法的步骤，然后允许 子类为一个或者多个提供步骤实现
*/
public class Test {

	public static void main(String[] args) {
		AbstractTemplate sub1=new Sub1();
		sub1.haveMeal();
		System.out.println("****************8");
		AbstractTemplate sub2=new Sub2();
		sub2.haveMeal();
	}
}
