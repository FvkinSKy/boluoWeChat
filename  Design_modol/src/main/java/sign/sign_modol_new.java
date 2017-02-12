package sign;

/**
 * Created by a07 on 17/1/1.
 * 饿汉单例模式
 * 天生线程安全
 */
public class sign_modol_new {
    private sign_modol_new() {
    }

    private static final sign_modol_new sign = new sign_modol_new();

    public static final sign_modol_new getInstance() {
        return sign;
    }
}
