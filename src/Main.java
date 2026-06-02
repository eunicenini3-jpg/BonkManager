public class Main {
    public static void main(String[] args) {
        //Instanciation des classe
        CheckingAccount compteCourant = new CheckingAccount();
        SavingsAccount comptEpargne = new SavingsAccount();
        COD certificatDeDepot = new COD();

        //Accés aux account et balance

        //définir les valeurs du compte courant
        compteCourant.account = "C001";
        compteCourant.balance =  5000;

        //définir les valeurs du compte d'épargne
        comptEpargne.account = "S001";
        comptEpargne.balance =  8000;

        //définir les valeurs du certificat de dépôt
        certificatDeDepot.account =  "D001";
        certificatDeDepot.balance = 10000;

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


