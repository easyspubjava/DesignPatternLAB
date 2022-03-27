package responsibility;

public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }
    protected boolean resolve(Trouble trouble) {     // 해결용 메소드
        return false; // 자신은 아무 처리도 하지 않는다.
    }
}
