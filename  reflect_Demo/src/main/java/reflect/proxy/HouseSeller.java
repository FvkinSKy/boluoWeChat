package reflect.proxy;

/**
 * Created by a07 on 17/1/8.
 */
public class HouseSeller implements Seller {
    @Override
    public void sell() {
        System.out.println("销售人员在卖房子");
    }
}
