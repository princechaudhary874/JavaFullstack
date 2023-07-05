package jdvc.v4;

public class Person {
	int pid; 
	String name;
	String address;
	public Person() {
		this.pid=0;
		this.name="";
		this.address="";
	}
	public Person( int pid,String name,String address) {
		this.pid=0;
		this.name="";
		this.address="";
	}
	
	//Getters
	public int getPID() {
		return this.pid;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	//Setters
	public void SetPID(int pid) {
		this.pid=pid;
	}
	 public void SetName(String name) {
		 this.name=name;
	 }
	public void SetAddress(String address) {
		this.address=address;
	}
	@Override
	public String toString() {
		return this.pid+" , "+this.name+", "+this.address;
	}
}
