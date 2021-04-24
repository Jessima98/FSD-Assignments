

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
	    // write your code here
        Scanner scanner = new Scanner(System.in);
        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
        System.out.println("Please select any one options");
        System.out.println("**************");
        System.out.println("Press 1: Insert");
        System.out.println("Press 2: Update");
        System.out.println("Press 3: Delete");
        System.out.println("Press 4: Get");
        System.out.println("**************");

        int option = scanner.nextInt();
        switch (option){
            case 1: {
                insert();
                break;
            }
            case 2: {
                update();
                break;
            }
            case 3: {
                delete();
                break;
            }
            case 4: {
                get();
                break;
            }
            default: {
                System.out.println("Incorrect options");
            }
        }





        //EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
        //Employee employee = new Employee(1, "mark", "m@gmail.com");
        //dao.addEmployee(employee);

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter EmpId: ");
//        int id = scanner.nextInt();
//
//        System.out.print("Enter Employee Name: ");
//        String name = scanner.next();
//
//        System.out.print("Enter Employee Email: ");
//        String email = scanner.next();
//
//        Employee employee = new Employee(id, name, email);
//        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
//        dao.addEmployee(employee);


        List<Employee> list =  dao.getEmployees();
        for (Employee emp:list) {
            System.out.println(emp.toString());
        }
    }
    private static void insert(){

    }

    private static void update(){

    }

    private static void delete(){

    }

    private static void get() throws SQLException, ClassNotFoundException {

        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
        List<Employee> list =  dao.getEmployees();
        System.out.println(list.size());
        for (Employee emp:list) {
            System.out.println(emp);
        }
    }
}
