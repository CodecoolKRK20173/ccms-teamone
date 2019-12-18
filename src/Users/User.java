package Users;

public abstract class User {
    int id;
    String name;
    String password;
    int accountType;
    String email;
    long phoneNumber;
    String address;

    public User(int id, String name, String password, int accountType, String email, long phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.accountType = accountType;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
