package 设计模式练习;
/**
* @author zhangS
* @date 2017年10月18日下午2:55:34
* @Email 260262911@qq.com
* 结合 状态模式与备忘录模式
* 进行复杂练习
* 1.利用状态模式通过改变一个对象的内部状态，从而改变他的行为，
* 2.备忘录是保存摸一个对象的特定时候的状态，在某个时候恢复他的状态
* 3.本次实现的步骤是 先通过状态模式进行设计对象的不同状态，然后再添加备忘录模式；
* 主要目的是进行综合练习。
*/

public class Test {

	public static void main(String[] args) {
		People p=new People("wangJJ", new SubObj1());
		PeopleMemto createPM = p.createPM();
		//创建了此事的备忘录并且把它存储
		StorePM sp=new StorePM(createPM);
		System.out.print("没有修改前L：");
		p.peopleState();
		//改变他的行为
		p.setState(new SubObj2());
		System.out.print("改变后：");
		p.peopleState();
		//恢复备忘录的状态
		p.recordP(sp.getPm());
		System.out.print("恢复后的状态》");
		p.peopleState();
		
	}
}
