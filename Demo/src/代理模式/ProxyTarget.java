package 代理模式;
/**
 * 有点类似装饰者模式
 * @author cheney
 *
 */
public class ProxyTarget implements TargetAble{

	private TargetAble targetAble;
	public ProxyTarget() {
		this.targetAble=new Target();
	}
	private void beforMethod(){
		System.out.println("方法运行之前运行。。。。");
	}
	private void afterMethod(){
		System.out.println("方法运行之后。。。。");
	}
	@Override
	public void targetMethod() {
		beforMethod();
		targetAble.targetMethod();
		afterMethod();
		
	}

}
