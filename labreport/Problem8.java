package labreport;

class Bank {

    int amount;

    Bank(int amount) {
        this.amount = amount;
    }

    void displayInterest() {
        int rate = 5;
        int interest = amount + (amount * rate / 100);
        System.out.println("Bank interest of " + amount + "tk =" + interest);
    }

}

class Sonali extends Bank {

    public Sonali(int amount) {
        super(amount);
    }

    @Override
    void displayInterest() {
        int rate = 7;
        int interest = amount + (amount * rate / 100);
        System.out.println("interest of sonali bank on" + amount + "tk =" + interest);
    }

}

class DuchBangla extends Bank {

    public DuchBangla(int amount) {
        super(amount);
    }

    @Override
    void displayInterest() {
        int rate = 4;
        int interest = amount + (amount * rate / 100);
        System.out.println("interest of duchbangla bank on " + amount + "tk =" + interest);
    }

}

class Problem8 {

    public static void main(String args[]) {
        Bank b1, b2, b3;

        b1 = new Bank(10000);
        b1.displayInterest();

        b2 = new Sonali(10000);
        b2.displayInterest();

        b3 = new DuchBangla(10000);
        b3.displayInterest();
    }
}
