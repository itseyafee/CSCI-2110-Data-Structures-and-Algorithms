package E3;

public class StudentRecord {

    private String firstName;
    private String lastName;
    private int bannerID;

    public StudentRecord(String firstName, String lastName, int bannerID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bannerID = bannerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBannerID() {
        return bannerID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBannerID(int bannerID) {
        this.bannerID = bannerID;
    }

//toString method

    public String toString() {
        return firstName + " " + lastName + " " + bannerID;
    }
}
