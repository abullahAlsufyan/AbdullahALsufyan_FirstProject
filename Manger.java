
public class Manger extends Employee {
private int nbEmps;
public Manger(String name,int rank,int yearsOfExperince,int nbEmps){
	super(name,rank,yearsOfExperince);
	this.nbEmps=nbEmps;
}
public Manger(Manger M){
	super(M);
	nbEmps=M.nbEmps;
}
public int getNbEmps(){
	return nbEmps;
}public void display(){
	super.display();
	System.out.println("Number of employees "+nbEmps);
	
}public double calculateSalary(){
	double salary=super.getYearsOfExperince()*500+super.getRank()*1500+nbEmps* 10;
	return salary;
}
}
