package User;

import Addresses.Address;
import Insurance.Insurance;
import Addresses.BusinessAddress;

import java.util.ArrayList;

public abstract class Account implements Comparable<Account> {

    private AuthenticationStatus authenticationStatus;
    private User user;
    protected ArrayList<Insurance> insurances;

    public enum AuthenticationStatus {
        SUCCESS, FAIL
    }

    public Account(User user) {
        this.authenticationStatus = authenticationStatus;
        this.user = user;
        this.insurances = insurances;
    }
    public void login(String email, String password) throws InvalidAuthenticationException {
        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
            this.authenticationStatus = AuthenticationStatus.SUCCESS;
        } else {
            throw new InvalidAuthenticationException("Invalid account");
        }
    }
    public void addAddress(Address address) {
        if (authenticationStatus == AuthenticationStatus.SUCCESS) {
            user.addAddress(address);
        }
    }

    public void removeAddress(Address address) {
        if (authenticationStatus == AuthenticationStatus.SUCCESS) {
            user.removeAddress(address);
        }
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public abstract void addInsurance(Insurance insurance);

    public final void showUserInfo() {
        System.out.println("------------------------------------------");
        System.out.println("Name: " + user.getName());
        System.out.println("Surname: " + user.getSurname());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Profession: " + user.getProfession());
        System.out.println("Age: " + user.getAge());
        user.updateLastLogin();
        System.out.println("Last login date: " + user.getLastLogin());
        if (this instanceof Enterprise) {
            System.out.println("Company Name: " + ((Enterprise) this).getCompanyName());
        }
        System.out.println("Addresses: ");
        System.out.println("------------------------------------------");
        for (Address address : user.getAddresses()) {
            System.out.println(address);
        }
        System.out.println("Insurances: ");
        System.out.println("------------------------------------------");
        for (Insurance insurance : insurances) {
            System.out.println(insurance);
        }
        System.out.println("------------------------------------------");
    }

    @Override
    public int compareTo(Account other) {
        // hesapları e-postaya göre karşılaştırabilirsiniz
        return this.user.getEmail().compareTo(other.user.getEmail());
    }

    @Override
    public int hashCode() {
        // e-postayı karma kodun temeli olarak kullanabilirsiniz
        return user.getEmail().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Account)) {
            return false;
        }
        Account other = (Account) obj;
        // e-postaya göre iki hesabın eşit olup olmadığını kontrol edebilirsiniz
        return this.user.getEmail().equals(other.user.getEmail());
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(ArrayList<Insurance> insurances) {
        this.insurances = insurances;
    }

}
