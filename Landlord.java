public class Landlord{
    private String name;
    private String email;
    private String password;
    private String phone;
    private String idproof;
    static int count = 0;

    Landlord(String name, String email, String password, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.idproof = ++count;
    }

    String getName() {
        return this.name;
    }

    String getEmail() {
        return this.email;
    }

    String getPassword() {
        return this.password;
    }

    String getPhoneNumber() {
        return this.phone;
    }

    int getLandlordID() {
        return this.idproof;
    }

    void setName(String name) {
        this.name = name;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void setPassword(String password) {
        this.password = password;
    }

    void setPhoneNumber(String phone) {
        this.phone = phone;
    }

    void setLandlordID(int landid) {
        this.idproof = landid;
    }

}
