package ����ģʽ;
/**
 * �е�����װ����ģʽ
 * @author cheney
 *
 */
public class ProxyTarget implements TargetAble{

	private TargetAble targetAble;
	public ProxyTarget() {
		this.targetAble=new Target();
	}
	private void beforMethod(){
		System.out.println("��������֮ǰ���С�������");
	}
	private void afterMethod(){
		System.out.println("��������֮�󡣡�����");
	}
	@Override
	public void targetMethod() {
		beforMethod();
		targetAble.targetMethod();
		afterMethod();
		
	}

}
