/**
 * Created by a07 on 17/1/8.
 */
public class EnumClass {
    public static void main(String[] args) {
        for (Size size:Size.values()){
            System.out.println(size+"的顺序是"+size.ordinal());
            System.out.println(size.compareTo(Size.SMALL));
            System.out.println(size.name());
        }
    }
}
