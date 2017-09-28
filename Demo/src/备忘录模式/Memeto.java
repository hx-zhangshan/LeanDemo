package 备忘录模式;
/***
 * 备忘录
 * @author cheney
 *
 */
public class Memeto {

	private String state;

	public Memeto(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
