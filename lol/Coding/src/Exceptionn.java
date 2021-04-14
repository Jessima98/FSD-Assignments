

class InsufficientFundException extends Exception{
    private  int amount;

    public InsufficientFundException(){
        System.out.println("Insufficient amount requested");
    }

    public InsufficientFundException(String message){
        System.out.println(message);
    }
}

class Account{
    private int balance = 0;
    private int accountNumber;

    public Account(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public  int getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public void deposit(int amount){
        balance += amount;
        System.out.println("Amount credited: "+ amount);
    }

    public void withdraw(int amount) {
        if(amount <= balance){
            balance -= amount;
            System.out.println("Amount debited: "+ amount);
        }else{
            try {
                throw new InsufficientFundException();
            } 
            catch (InsufficientFundException e) {
            	 e.printStackTrace();
            }
        }
    }

   
}


public class Exceptionn {
    public static void main(String[] args) throws InsufficientFundException {
        Account account = new Account(123456);
        System.out.println(account.getAccountNumber());
        account.deposit(5000);
        account.withdraw(2000);
        account.deposit(1000);
        account.withdraw(10000);
    }
}