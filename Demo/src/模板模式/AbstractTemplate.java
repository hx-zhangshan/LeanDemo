package 模板模式;

public abstract class AbstractTemplate {

	public void haveMeal(){
		zuoFan();
		shaoCai();
		duringMeal();
		finish();
	}

	private void finish() {
		System.out.println("吃完饭了》》》》》");
		
	}

	private void duringMeal() {
		System.out.println("吃饭中++++++++");
		
	}

	public abstract void shaoCai() ;

	public abstract void zuoFan() ;
}
