package Aufgabe15_Vererbung;

public class Program {

   public static void main(String[] args) {
      DeutscheBank deutscheBank = new DeutscheBank(1000);
      UniCredit uniCredit = new UniCredit(2000);
      KfW kfW = new KfW(3000);
      CommerzBank commerzBank = new CommerzBank(4000);

      Person hendrik = new Person("Hendrik", "Pruin", 2300);
      Person mueller = new Person("Anton", "Müller", 7000);
      Person muster = new Person("Max", "Mustermann", 70);

      deutscheBank.openBankAccout(hendrik);
      deutscheBank.openBankAccout(muster);
      commerzBank.openBankAccout(mueller);
      uniCredit.openBankAccout(muster);

   }

}
