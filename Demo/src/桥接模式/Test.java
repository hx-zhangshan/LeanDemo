package �Ž�ģʽ;
/**
* @author zhangS
* @date 2017��9��28������10:28:04
* @Email 260262911@qq.com
* 
* �Ž�ģʽ�ǰ� ����;���ʵ�� �ֿ��� ��������ʹ���� �����ı仯
* 
* ���� ������ϵͳ xp ��window7Ҫʵ���ĸ����ݿ� һ���д����
* Ҫд 2*4����
* ����ʹ���Žӵ�ģʽ֮��ֻҪд 2+4���������
* ���� �Ž�ģʽ���ǰ�N*Mת����N+M��һ��˼��
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
