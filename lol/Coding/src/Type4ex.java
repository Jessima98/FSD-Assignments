class Employee{
    public void display(){
        System.out.println("display...");
    }
}

public class Type4ex {
    public static void main(String[] args) {

        String str = "Mark";
        System.out.println(str.length());

        String str2 = null;
        try {
            System.out.println(str2.length());
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }

        Employee emp = new Employee();
        emp.display();

        Employee emp2 = null;
        emp2.display();


    }
}