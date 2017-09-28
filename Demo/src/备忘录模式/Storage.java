package 备忘录模式;
/**
 * 用来存储备忘录 只能存不能修改
 * @author cheney
 *
 */
public class Storage {

	private Memeto memeto;

	public Storage(Memeto memeto) {
		super();
		this.memeto = memeto;
	}

	public Memeto getMemeto() {
		return memeto;
	}
	
}
