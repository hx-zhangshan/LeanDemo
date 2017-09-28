package 桥接模式;
/**
* @author zhangS
* @date 2017年9月28日上午10:28:04
* @Email 260262911@qq.com
* 
* 桥接模式是把 事物和具体实现 分开做 这样可以使他们 独立的变化
* 
* 例如 你两个系统 xp 和window7要实现四个数据库 一遍的写法是
* 要写 2*4个类
* 但是使用桥接的模式之后只要写 2+4个类就行了
* 所以 桥接模式就是把N*M转换成N+M的一种思想
* 
*/

public class Test {

	public static void main(String[] args) {
		Computer windowXP=new WindowXPComputer();
		windowXP.connection(new MysqlDriver());
		System.out.println("*************************");
		Computer window7=new Window7Computer();
		window7.connection(new OracleDriver());
		System.out.println("*************************");
		Computer windowXP1=new WindowXPComputer();
		windowXP1.connection(new OracleDriver());
	}
}
