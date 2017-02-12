package factory;

/**
 * Created by a07 on 17/1/1.
 */
public class simple_Factory {
    public easy_factory createCar(int num){
        switch (num){
            case 320:
                return new BMW320();
            case 520:
                return new BMW520();
                default:
                    break;
        }
        return null;
    }
}
