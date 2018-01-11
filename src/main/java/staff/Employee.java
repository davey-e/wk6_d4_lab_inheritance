package staff;

public class Employee {
    
    private String name;
    private String ni;
    private double salary;
    
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
        this.salary += salary;
    }
}
