package nadiatests;

public class DPInterface {
    public interface salaryCalculator {
        public double getSalary();
    }
    public class CategoryA implements salaryCalculator {
        double baseSalary;
        double OT;
        public CategoryA(double base, double ot) {
            this.baseSalary = base; this.OT = ot;
        }
        public double getSalary() {
            return baseSalary + OT;
        }
    }
    public class CategoryB implements salaryCalculator {
        double salesAmount;
        double baseSalary;
        final static double commission = 0.02;
        public CategoryB(double salesAmount, double baseSalary) {
            this.baseSalary = baseSalary; this.salesAmount = salesAmount;
        }
        public double getSalary() {
            return baseSalary + (commission * salesAmount);
        }
    }
    public static class Employee {
        salaryCalculator salaryCalculator;
        String name;
        public Employee(String a, salaryCalculator c) {
            name = a; salaryCalculator = c;
        }
        public void display() {
            System.out.println(name + " salary = "+ salaryCalculator.getSalary());
        }
    }
    public class MainApp {
        public void main(String[] args) {
            salaryCalculator calculatorA  = new CategoryA(1000, 200);
            salaryCalculator calculatorB  = new CategoryB(1000, 200);
            Employee employee = new Employee("Janet", calculatorA);
            Employee employee1 = new Employee("Jack", calculatorB);
            employee.display();
            employee1.display();
        }
    }

}
