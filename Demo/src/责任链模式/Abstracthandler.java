package 责任链模式;
/**
* @author zhangS
* @date 2017年9月27日下午5:00:49
* @Email 260262911@qq.com
* 对handler进行封装 方便修改引用对象
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
