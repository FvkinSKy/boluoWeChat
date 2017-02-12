package ioc.constructor;

/**
 * Created by a07 on 17/1/31.
 */
public class Restaurant {
    private Waiter wt;
    public Restaurant() {
        System.out.println("Restaurant的无参构造");
    }

    public Restaurant(Waiter wt) {
        System.out.println("Restaurant的有参构造"+toString());
        this.wt = wt;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "wt=" + wt +
                '}';
    }
}
