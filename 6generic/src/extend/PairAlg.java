package extend;

public class PairAlg{
	
    public static void printEmployeeBoddies(Pair<Employee> pair) {  
        System.out.println(pair.getFirst().getName() + ":" + pair.getSecond().getName());  
    }  
    
    public static void printEmployeeBoddiesChange(Pair<? extends Employee> pair) {  
        System.out.println(pair.getFirst().getName() + ":" + pair.getSecond().getName());  
    }  
    
    public static void main(String[] args){
        Manager mgr1 = new Manager("Jack", 10000.99);  
        Manager mgr2 = new Manager("Tom", 10001.01);  
        Pair<Manager> managerPair = new Pair<Manager>(mgr1, mgr2);  
        PairAlg.printEmployeeBoddies(managerPair);  //wrong
        
        PairAlg.printEmployeeBoddiesChange(managerPair);
    }
}




class Pair<T> {  
    private T first;  
    private T second;  
  
    public Pair(T first, T second) {  
        this.first = first;  
        this.second = second;  
    }  
  
    public T getFirst() {  
        return first;  
    }  
  
    public T getSecond() {  
        return second;  
    }  
  
    public void setFirst(T newValue) {  
        first = newValue;  
    }  
  
    public void setSecond(T newValue) {  
        second = newValue;  
    }  
    
}  
  

class Employee {  
    private String name;  
    private double salary;  
      
    public Employee(String n, double s) {  
        name = n;  
        salary = s;  
    }  
      
    public String getName() {  
        return name;  
    }  
  
    public double getSalary() {  
        return salary;  
    }  
}  
  
class Manager extends Employee {  
    public Manager(String n, double s) {  
        super(n, s);  
    }  
}  

class President extends Manager {  
    public President(String n, double s) {  
        super(n, s);  
    }  
}  

