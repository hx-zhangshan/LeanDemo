package ������ģʽ;
/**
* @author zhangS
* @date 2017��9��27������5:00:49
* @Email 260262911@qq.com
* ��handler���з�װ �����޸����ö���
*/
public abstract class Abstracthandler implements Handler{

	private Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
}
