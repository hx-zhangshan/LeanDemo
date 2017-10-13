package 访问者模式;
/**
* @author zhangS
* @date 2017年10月13日上午9:27:02
* @Email 260262911@qq.com
* 访问者模式：作用是把数据结构与作用于数据结构上的操作进行解耦。
* 是的操作可以自由的演化。
* 访问者模式就是分离数据结构与行为的操作，
* 这种分离可以达到，数据结构动态的添加操作而不需要进行其他修改。
*/

public class Test {

	public static void main(String[] args) {
		Subject sb=new MySubject("王JJ");
		Vistor myvistor=new MyVistor();
		Vistor otvistor=new OtherVistor();
		myvistor.vistor(sb);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^6");
		otvistor.vistor(sb);
		
	}
}
