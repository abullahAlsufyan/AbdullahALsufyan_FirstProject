
public class Company {
private String name;
private Employee[]arrEmps;
private int nbE;
public Company(String name,int size){
	this.name=name;
	arrEmps=new Employee[size];
	nbE=0;
}public boolean addEmployee(Employee e){
	if(nbE>=arrEmps.length)
		return false;

		if(e instanceof Manger)
		arrEmps[nbE++] = new Manger((Manger)e);
		else if(e instanceof Consultant)
		arrEmps[nbE++] = new Consultant((Consultant)e);
		else
		arrEmps[nbE++] = new Employee(e);
		return true;}
	
public void DisplayAll(){
	System.out.println("Company name "+name);
	for(int i=0;i<nbE;i++){
		
		arrEmps[i].display(); 
	}
}public int countConsultant(){
	int j=0;
	for(int i=0;i<nbE;i++){
		if(arrEmps[i] instanceof Consultant)
			j++;
		
	}return j;
	
}public Employee[] getHighSalary(double s){
	Employee[] result =new Employee[nbE];
	int j=0;
	for(int i=0;i<nbE;i++){
		if(arrEmps[i].calcuateSalary()>s)
			result[j++]=arrEmps[i];
	} return result;
}

 public Manger[] getManger(int n){
	Manger [] result= new Manger [nbE];
	int s=0; 
	for(int i=0;i<nbE;i++){
		if(arrEmps[i] instanceof Manger)
				if(((Manger)arrEmps[i]).getNbEmps()>n)
			result[s++]=(Manger)arrEmps[i];
		
	}return result;

}
 
}

