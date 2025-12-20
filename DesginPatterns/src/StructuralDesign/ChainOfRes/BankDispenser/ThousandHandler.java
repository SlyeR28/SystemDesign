package StructuralDesign.ChainOfRes.BankDispenser;

public class ThousandHandler extends MoneyHandler{

    private int numNotes;

    public ThousandHandler(int numNotes) {
        this.numNotes = numNotes;
    }

    @Override
    public void dispense(double amount) {
          int notesNeeded = (int) amount / 1000;

          if(notesNeeded > numNotes){

          }

    }
}
