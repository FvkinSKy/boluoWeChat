package abstract_factory;

/**
 * Created by a07 on 17/1/2.
 */
public class factoryBMW520 implements car_factory {
    @Override
    public engine createEngine() {
        return new engineB();
    }

    @Override
    public AC createAC() {
        return new acB();
    }
}
