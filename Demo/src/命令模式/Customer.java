package ÃüÁîÄ£Ê½;

public class Customer {

	private Command command;
	
	public Customer(Command command){
		this.command=command;
	}
	
	public void execute() {
		command.execute();
		
	}

	
	public void undo() {
		command.undo();
		
	}

}
