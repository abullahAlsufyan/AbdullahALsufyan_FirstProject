
public class Employee {
private String name;
private int rank;
private int yearsOfExperince;
public Employee(String name, int rank,int yearsOfExperince){
	this.name=name;
	this.rank=rank;
	this.yearsOfExperince=yearsOfExperince;
}
public Employee(Employee E){
	name=E.name;
	rank=E.rank;
	yearsOfExperince=E.yearsOfExperince;
}
public int getRank(){
	return rank;
}
public int getYearsOfExperince(){
	return yearsOfExperince;
}
public void display(){
	System.out.println("Name: "+name+" rank: "+rank+" Years of experince :"+yearsOfExperince);
}
public double sumOfSalary(){
	double salary= yearsOfExperince*500+rank*1000;
	return salary;
}
}
