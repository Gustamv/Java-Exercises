package application;

import Entities.Account;
import Entities.BussinessAccount;
import Entities.SavingsAccount;

public class program01 {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BussinessAccount bacc = new BussinessAccount(1002,"Maria", 0.0, 500.0);

        //UPCASTING
        Account acc1 = bacc;
        //deu certo pois a bussinessAccount eh uma Account (definicao de "é-um")
        Account acc2 = new BussinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // DOWNCASTING
        //tem q fzr "casting manual"
        BussinessAccount acc4 = (BussinessAccount) acc2;
        acc4.loan(100);

        //usar instanceof para ver se o casting funciona
        if(acc3 instanceof BussinessAccount) {
            BussinessAccount acc5 = (BussinessAccount) acc3;
            acc5.loan(200);
            System.out.println("Loan!");
        }
        if(acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}