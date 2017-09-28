package 备忘录模式;
/**
* @author zhangS
* @date 2017年9月28日下午2:44:58
* @Email 260262911@qq.com
* 备忘录 模式 在bean中首先就要有两个方法 创建备忘录的和恢复备忘录
* 
* 重要的是备忘录是要存储起来的。
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
	 * 创建备忘录
	 */
	public Memeto createMemeto(){
		return new Memeto(state);
	}
	/**
	 * 恢复备忘录
	 */
	public void recordMemeto(Memeto memeto){
		state=memeto.getState();
	}
	
}
