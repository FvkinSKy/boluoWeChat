/**
 * Created by a07 on 17/1/8.
 */
public enum Size {
    SMALL("我是小号披萨"),MEDIUM("我是中号披萨"),LARGE("我是大号披萨");

    private String detail;
    Size() {
    }

    Size(String detail) {
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public static void main(String[] args) {
        for (Size size:Size.values()){
            System.out.println(size.getDetail());
        }
    }
}
