package lesson5;

class BankAccountTest{
    int userId;
    String name;
    double Balance;
    BankAccountTest(int userId1, String name1, double   Balance1) {
        userId1=userId;
        name1=name;
        Balance=Balance1;


    }
public double popolnenieSheta() {
    return Balance = Balance+=20;
    }
    public double snyatiesoSheta(double a) {

        return Balance = Balance-a;
    }
}

public class BankAccount {

    public static void main(String[] args) {
        BankAccountTest ba = new BankAccountTest(1,"Oleg",100.12);
        BankAccountTest ba1 = new BankAccountTest(2,"Sanek",1004.12);
System.out.println(ba.popolnenieSheta());
System.out.println(ba1.snyatiesoSheta(30));

    }
}
