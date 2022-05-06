package File;

public class Information {
    private String firstName;
    private  String lastName;
    private  String  age;
    private  String idCard;
    private  String cellNumber;
    private  String password;
    private  String shabaNumber;
    private  String accountNumber;
    private  long money;
    private  String banks;

    public String getBanks() {
        return banks;
    }

    public void setBanks(String banks) {
        this.banks = banks;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

        public String getPassword() {
        long tempPassword=(long) (Math.random()*100000001);
        password=Long.toString(tempPassword);
        return password;
    }


    public String getShabaNumber() {
        long tempShaba=(long)(Math.random()*1000000001);
        shabaNumber="111100"+Long.toString(tempShaba);
        return shabaNumber;
    }



    public String getAccountNumber() {
        long tempAccountNumber=(long)(Math.random()*100000001);
        accountNumber="60379950"+Long.toString(tempAccountNumber);
        return accountNumber;
    }
    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }


    @Override
    public String toString(){
        return getFirstName()+","+getLastName()+","+getCellNumber()+","+getPassword()+","+getBanks()+","+getAge()+","+getIdCard()+","+getShabaNumber()+","+getAccountNumber()+","+getMoney();
    }
}
