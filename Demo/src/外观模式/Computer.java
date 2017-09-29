package 外观模式;

public class Computer {

	private Cpu cpu;
	private Memory memory;
	public Computer() {
		cpu=new Cpu();
		memory=new Memory();
	}
	public void startUp(){
		System.out.println("电脑开始启动《《《《《《");
		cpu.startUp();
		memory.startUp();
		
		System.out.println("电脑启动《《《《《《《");
	}
	public void close(){
		System.out.println("电脑开始关闭》》》》");
		cpu.close();
		memory.close();
		
		System.out.println("电脑关闭》》》》》》");
	}
}
