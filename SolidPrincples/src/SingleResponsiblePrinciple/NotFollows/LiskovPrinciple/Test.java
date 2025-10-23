package SingleResponsiblePrinciple.NotFollows.LiskovPrinciple;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
         List<Account> accountList1 = new ArrayList<>();
         accountList1.add(new SavingsAccount());
         accountList1.add(new CurrentAccount());
         accountList1.add(new FixedDeopist());

         BankClient bc = new BankClient(accountList1);
         bc.processTransaction();
    }



}
