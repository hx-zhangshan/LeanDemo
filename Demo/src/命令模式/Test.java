package 命令模式;
/**
* @author zhangS
* @date 2017年9月27日上午10:16:52
* @Email 260262911@qq.com
* 命令模式的作用就是 命令的发出者和执行者 之间的解耦
* 吧命令进行封装以至于使用不同的对象
* 
* 示例：以从餐馆吃饭为例
* 1，顾客：小二 来个宫保鸡丁 ——》》顾客发出指令
* 2.小二给厨师：来一个宫保鸡丁——》》》小二传递给厨师指令
* 3.厨师：收到指令开始做饭：——》》》开始烧菜
*/
public class Test {

	public static void main(String[] args) {
		//先有个厨师等待执行命令
		CookReceiver cook=new CookReceiver();
		Command command=new orderCommand(cook);
		Customer customer=new Customer(command);
		customer.execute();
		command.execute();
	}
}
