package Staff;

public abstract class Employee {

    protected String name;
    protected String NINumber;
    protected double salary;

    public Employee(String name, String NINumber, double salary){
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNINumber(){
        return this.NINumber;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String raiseSalary(double raise){
        if (raise > 0){
        setSalary(this.salary + raise);
        return "Salary is now " + this.salary;
        }
        else return ("Sorry, no bueno! Must raise salary not decrease.");
    }

    public double bonus(){
        return (this.salary*0.01);
    }

    public void setName(String name){
        this.name = name;
    }


}
