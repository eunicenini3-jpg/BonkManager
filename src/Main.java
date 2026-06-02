public class Main {
    public static void main(String[] args) {
        //Instanciation des classe
        CheckingAccount compteCourant = new CheckingAccount();
        SavingsAccount comptEpargne = new SavingsAccount();
        COD certificatDeDepot = new COD();
    }
    }
class BankAccount{
    String account;
    double balance;
}
class CheckingAccount extends BankAccount{
    double limit;
}

class SavingsAccount extends BankAccount{
}

class COD extends BankAccount{
}


