package 外观模式;
/**
* @author zhangS
* @date 2017年9月29日下午1:44:49
* @Email 260262911@qq.com
* 外观模式;是为了解决类和类之间的依赖关系，就像spring一样，
* 把类鱼类的关系放在配置文件里面了。
* 外观模式就是把他们的关系放在Facade类中，降低了类鱼类之间的耦合关系，没有涉及到接口。
*/
public class Test {
	public static void main(String[] args) {
		Computer computer=new Computer();
		computer.startUp();
		System.out.println("——————————————————————这是一个华丽丽的分割线————————————————————————————-");
		computer.close();
	}
}
