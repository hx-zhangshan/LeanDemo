package 迭代器模式;
/**
* @author zhangS
* @date 2017年9月29日上午10:24:49
* @Email 260262911@qq.com
* 这个类的 ：提供一种方法 访问他的内部元素，而又不暴漏他的内部结构的
*/
public class Test {

	public static void main(String[] args) {
		MyCollection myCollection=new MyCollection();
		Iterator iterator = myCollection.iterator();
		while(iterator.hasNext()){
			Object next = iterator.next();
			System.out.println(next);
		}
	}
}
