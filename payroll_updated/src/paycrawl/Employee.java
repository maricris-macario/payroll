package paycrawl;

public class Employee {
	
	private String name;
	private int idnum;
	private String position;
	
	
	public Employee(String name, int idnum, String position){
		
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setID(int idnum){
		this.idnum = idnum;
	}
	public int getID(){
		return this.idnum;
	}
	
	public void setPosition(String position){
		this.position = position;
	}
	public String getPosition(){
		return this.position;
	}
	
}
