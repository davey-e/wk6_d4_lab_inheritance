package staff;

public class Employee {
    
    protected String name;
    protected String ni;
    protected double salary;
    
    public Employee(String name, String ni, double salary){
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }
    
    public String getName(){
        return this.name;
    }

    public String getNi() {
        return ni;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double salary) {
        if(salary > 0) {
            this.salary += salary;
        }
    }

    public double payBonus() {
        return this.salary * 0.01;
    }

    public void setName(String name) {
        if(name != null){
            this.name = name;
        }

    }
}
