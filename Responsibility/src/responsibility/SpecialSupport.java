package responsibility;

public class SpecialSupport extends Support {
    private int number;                                 // 이 번호만 해결할 수 있다.
    public SpecialSupport(String name, int number) {    // 생성자
        super(name);
        this.number = number;
    }
    protected boolean resolve(Trouble trouble) {     // 해결용 메소드 
        if (trouble.getNumber() == number) {
            return true;
        } else {
            return false;
        }
    }
}
