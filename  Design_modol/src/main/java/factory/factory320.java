package factory;

public class factory320 implements BMWfactory{

    @Override
    public BMW320 create() {
        return new BMW320();
    }
}
