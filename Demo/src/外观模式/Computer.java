package ���ģʽ;

public class Computer {

	private Cpu cpu;
	private Memory memory;
	public Computer() {
		cpu=new Cpu();
		memory=new Memory();
	}
	public void startUp(){
		System.out.println("���Կ�ʼ����������������");
		cpu.startUp();
		memory.startUp();
		
		System.out.println("����������������������");
	}
	public void close(){
		System.out.println("���Կ�ʼ�رա�������");
		cpu.close();
		memory.close();
		
		System.out.println("���Թرա�����������");
	}
}
