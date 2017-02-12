package sign;

/**
 * Created by a07 on 17/1/1.
 * 单例模式
 */
public class sign_modol {
    private String name;
    private String address;

    private sign_modol() {

    }

    private sign_modol(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private static class Lazy {
        private static final sign_modol INSTANCE = new sign_modol();
    }

    public static final sign_modol getInstance() {
        return Lazy.INSTANCE;
    }
}

