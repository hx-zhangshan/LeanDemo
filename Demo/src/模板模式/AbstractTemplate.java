package ģ��ģʽ;

public abstract class AbstractTemplate {

	public void haveMeal(){
		zuoFan();
		shaoCai();
		duringMeal();
		finish();
	}

	private void finish() {
		System.out.println("���극�ˡ���������");
		
	}

	private void duringMeal() {
		System.out.println("�Է���++++++++");
		
	}

	public abstract void shaoCai() ;

	public abstract void zuoFan() ;
}
