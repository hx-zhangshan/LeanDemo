package 备忘录模式;
/**
* @author zhangS
* @date 2017年9月28日下午2:03:51
* @Email 260262911@qq.com
* 这种模式的作用是;保存一个对象的某个状态，以便在适当的时候恢复对象
*/
public class Test {

	public static void main(String[] args) {
		//创建原始的对象
		Original original=new Original("白天模式");
		System.out.println("original初始的对象是："+original.getState());
		//创建备忘录 
		/**
		 * 创建了此时状态的备忘录 并且进行了存储
		 */
		Storage storage=new Storage(original.createMemeto());
		//修改原始对象
		original.setState("天黑了模式");
		System.out.println("original修改后的对象状态："+original.getState());
		//恢复备忘录的状态
		original.recordMemeto(storage.getMemeto());
		System.out.println("original恢复备忘录之后的状态："+original.getState());
	}
}
