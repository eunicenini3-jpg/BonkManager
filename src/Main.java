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

        // lire les valeurs (affichage)
        System.out.println("Le compte courant a pour compte " + compteCourant.account + " et son solde est " + compteCourant.balance);
        System.out.println("Le compte d'épargne a pour compte "+ comptEpargne.account + " et son solde est " + comptEpargne.balance);
        System.out.println("Le certificat de dépôt a pour compte "+ certificatDeDepot.account + " et son solde est " + certificatDeDepot.balance);
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


