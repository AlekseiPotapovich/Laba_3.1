package classes;

public class Workman extends Human{
	public Workman(String typeW, String nameW, String surnameW) {
		setNameSurname(nameW,surnameW);
		setType(typeW);
		//name = nameW;
		//surname = surnameW;
		//type = typeW;
		
	}
	public void createWorkman() {
		Workman workman = new Workman(this.getType(), this.getName() ,this.getSurname());
		HumanArray.humans.add(workman);
			
	}
	
	public void toWork() {
		
	}

}
