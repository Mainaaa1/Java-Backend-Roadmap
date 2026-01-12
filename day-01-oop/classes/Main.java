public class Main {

    public static void main(String[] args) {

        Person person = new Person("Ian", 24);
        Student student = new Student("ST123", person);

        BankAccount account = new BankAccount("ACC001");
        account.deposit(500);
        account.withdraw(200);

        student.displayStudentInfo();
        System.out.println("Account balance: " + account.getBalance());
    }
}
