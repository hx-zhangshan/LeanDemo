package ����¼ģʽ;
/**
* @author zhangS
* @date 2017��9��28������2:44:58
* @Email 260262911@qq.com
* ����¼ ģʽ ��bean�����Ⱦ�Ҫ���������� ��������¼�ĺͻָ�����¼
* 
* ��Ҫ���Ǳ���¼��Ҫ�洢�����ġ�
*/
public class Original {

	private String state;

	public Original(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	/**
	 * ��������¼
	 */
	public Memeto createMemeto(){
		return new Memeto(state);
	}
	/**
	 * �ָ�����¼
	 */
	public void recordMemeto(Memeto memeto){
		state=memeto.getState();
	}
	
}
