package stream;

/**
 * Created by a07 on 17/1/3.
 */
public class person {
    private String firstname;
    private String lastname;
    private String job;
    private String gender;

    public person(String firstname, String lastname, String job, String gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.job = job;
        this.gender = gender;
    }

    public person() {
    }

    private static final person instance = new person();

    public static final person getInstance() {
        return instance;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
