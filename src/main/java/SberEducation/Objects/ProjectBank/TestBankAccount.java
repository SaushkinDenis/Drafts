package SberEducation.Objects.ProjectBank;

import java.util.Scanner;

public class TestBankAccount {
    Scanner scanner = new Scanner(System.in);
    BankAccount[] accounts = new BankAccount[10];

    public static void main(String[] args) {
//        createBankUI();
//        createBankAccount();
    }

    public static void createBankAccount(){
        BankAccount account = new BankAccount(1122,"Petrov", 1000);
        account.setAnnualInterestRate(5.5);
        account.deposit(300);
        account.deposit(400);
        account.deposit(500);
        account.withdraw(500);
        account.withdraw(400);
        account.withdraw(200);

        System.out.println("\n \t\t\t ФИО \t\t\t  Баланс, руб \t Годовая процентная ставка по счету \t\t  Дата создания банковского счета");
        System.out.println("\t\t\t" + account.getOwnerAccount() + "\t\t\t\t " + account.getBalance() + "\t\t\t\t " + account.getMonthlyInterest() + "\t\t\t\t\t\t " + account.getDateCreated().toString());
        System.out.println("\n \t\t\tДата\t\t\t\tТип транзакции\tСумма, руб.\tБаланс, руб.");
        for (Transaction transaction: account.getTransaction()) {
            System.out.format("%28s%10c%17.2f%14.2f%n", transaction.getDate(), transaction.getType(),
                    transaction.getAmount(), transaction.getBalance());
        }
    }

    public void createListBankAccount() {
        for (int i = 0; i < 10; i++) {
            accounts[i] = new BankAccount(i, "Petrov " + i, 10000);
        }
    }

    public static void createBankUI(){
        TestBankAccount testBankAccount = new TestBankAccount();
        testBankAccount.createListBankAccount();

        while (true) {
            System.out.print("ID:");
            int id = testBankAccount.scanner.nextInt();
            if (id < 0 || id > testBankAccount.accounts.length) {
                System.out.println("Введите, пожалуйста, корректный id");

            }
            while (true) {
                switch (testBankAccount.getMenuSelection()) {
                    case (1):
                        System.out.println(testBankAccount.accounts[id].getBalance());
                        break;
                    case (2):
                        testBankAccount.withdraw(id);
                        break;
                    case (3):
                        testBankAccount.deposit(id);
                    case (4):
                        break;
                }
            }
        }
    }

    public int getMenuSelection(){
        while(true){
            System.out.println("\nОсновное меню");
            System.out.println("1: проверить баланс счета");
            System.out.println("2: снять со счета");
            System.out.println("3: положить на счет");
            System.out.println("4: выйти");
            System.out.print("Введите пункт меню: ");
            int select = scanner.nextInt();
            if (select < 0 || select > 4){
                System.out.println("Введите, пожалуйста, корректный пункт меню ");
            }
            else {
                return select;
            }
        }
    }

    public void withdraw(int id){
        System.out.print("Укажите сумму: ");
        int amount = scanner.nextInt();
        if (amount > 0 && accounts[id].getBalance() >= amount){
            accounts[id].withdraw(amount);
        }
        else System.out.println("Ошибка!");
    }

    public void deposit(int id){
        System.out.print("Укажите сумму: ");
        int amount = scanner.nextInt();
        if (amount > 0){
            accounts[id].deposit(amount);
        }
        else System.out.println("Ошибка!");
    }
}
