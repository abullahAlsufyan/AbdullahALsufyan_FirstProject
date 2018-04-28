
public class Consultant extends Employee{
private int hoursPerWeek;
public Consultant(String name,int rank,int yearsOfExperince,int hoursperWeek){
	super(name,rank,yearsOfExperince);
	this.hoursPerWeek=hoursperWeek;
}public Consultant(Consultant C){
	super(C);
	hoursPerWeek=C.hoursPerWeek;
}public void display(){
	super.display();
	System.out.println("Hours peer week "+hoursPerWeek);
}public double CalculateSalary(){
	double salary=hoursPerWeek*1000 +super.getRank()*500;
	return salary;
}

}
