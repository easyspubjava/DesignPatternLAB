package responsibility;

public class LimitSupport extends Support {
    private int limit;                              // 이 번호 미만이면 해결 할수 있다.
    public LimitSupport(String name, int limit) {   // 생성자
        super(name);
        this.limit = limit;
    }
    protected boolean resolve(Trouble trouble) {         // 해결용 메소드
        if (trouble.getNumber() < limit) {
            return true;
        } else {
            return false;
        }
    }
}
