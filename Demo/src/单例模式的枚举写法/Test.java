package ����ģʽ��ö��д��;
/**
* @author zhangS
* @date 2017��10��12������10:37:11
* @Email 260262911@qq.com
* fangshuibaio 
*/
public class Test {

	public static void main(String[] args) {
		Resoure instence = Somthing.INSTENCE.getInstence();
		Resoure instence2 = Somthing.INSTENCE.getInstence();
		instence2.setName("wang");
		instence.setName("zhang");
		System.out.println(instence.getName());
		
		System.out.println(instence2.getName());
	}
}
