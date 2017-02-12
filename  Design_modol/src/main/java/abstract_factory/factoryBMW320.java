package abstract_factory;

/**
 * Created by a07 on 17/1/2.
 */
public class factoryBMW320 implements car_factory {
    @Override
    public engine createEngine() {
        return new engineA();
    }

    @Override
    public AC createAC() {
        return new acA();
    }
}
