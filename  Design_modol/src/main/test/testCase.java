import abstract_factory.factoryBMW320;
import abstract_factory.factoryBMW520;
import factory.*;
import org.junit.jupiter.api.Test;
import sign.sign_modol;
import sign.sign_modol_new;

/**
 * Created by a07 on 17/1/1.
 */
public class testCase {
    @Test
    public void test() {
        sign_modol s = sign_modol.getInstance();
        s.setAddress("earth");
        s.setName("tom");

        sign_modol_new s2 = sign_modol_new.getInstance();
    }

    @Test
    public void test2() {
        simple_Factory s = new simple_Factory();
//        easy_factory b320 = s.createCar(320);
//        easy_factory b520 = s.createCar(520);
    }

    @Test
    public void test3() {
        factory320 f3 = new factory320();
        BMW320 bmw320 = f3.create();

        factory520 f5 = new factory520();
        BMW520 bmw520=f5.create();
    }

    @Test
    public void test4(){
        factoryBMW320 bmw320=new factoryBMW320();
        bmw320.createAC();
        bmw320.createEngine();

        factoryBMW520 bmw520=new factoryBMW520();
        bmw520.createEngine();
        bmw520.createAC();
    }
}
