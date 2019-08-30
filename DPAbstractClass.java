package nadiatests;

import org.hsqldb.lib.FileUtil;
import sun.net.www.protocol.file.FileURLConnection;

/**
 * Created with IntelliJ IDEA.
 * User: nadhami
 * Date: 1/11/18
 * Time: 6:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class DPAbstractClass {
    public abstract class Employee {
        String name;
        double salary = 0;
        double sales = 0;
        Employee (String name, double salary, double sales) {
            this.name = name; this.salary = salary; this.salary = sales;
        }
        public void print() {
            System.out.println( name + " has compensation "+computeCompensation());
        }
        public abstract double computeCompensation(); //this is what makes this class abstract
    }
    public class Consultant extends Employee {
        public double computeCompensation() {
            return salary;
        }
        public Consultant(String name, double salary) {
            super(name, salary, 0);
        }
    }
    public class SalesRep extends Employee {
        public double computeCompensation() {
            return salary + (sales * 0.05);  //get a percentage of salary
        }
        public SalesRep(String name, double salary, double sales) {
            super(name, salary, sales);
        }
    }
    public void main(String args[]) {
        DPAbstractClass dpAbstractClass = new DPAbstractClass();
        Consultant consultant = new DPAbstractClass.Consultant("Joe", 1000);
        SalesRep salesRep = new SalesRep("Sara", 1000, 200);
        consultant.print();
        salesRep.print();
    }
}
