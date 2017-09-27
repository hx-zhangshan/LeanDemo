package ÃüÁîÄ£Ê½;

public class orderCommand implements Command{

	private CookReceiver cookReceiver;
	
	public orderCommand(CookReceiver cookReceiver){
		this.cookReceiver=cookReceiver;
	}
	@Override
	public void execute() {
		cookReceiver.cooking();
		
	}

	@Override
	public void undo() {
		cookReceiver.unCooking();
		
	}

}
