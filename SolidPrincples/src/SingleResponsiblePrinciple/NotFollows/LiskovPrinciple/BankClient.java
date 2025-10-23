package SingleResponsiblePrinciple.NotFollows.LiskovPrinciple;

import java.util.List;

public class BankClient {

    private List<Account> accountList;

    public BankClient() {
    }

    public BankClient(List<Account> accountList) {
        this.accountList = accountList;
    }

    public void processTransaction(){
        for(Account ax : accountList){
            ax.depositAmount(2000);

            try{
                ax.withdrawAmount(500);
            }catch (Exception e){
                e.getMessage();
            }

        }
    }
}
