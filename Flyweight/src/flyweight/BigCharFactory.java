package flyweight;

import java.util.Hashtable;

public class BigCharFactory {
    // 이미 만들어진 BigChar의 인스턴스를 관리
    private Hashtable<String,BigChar> pool = 
    		new Hashtable<String,BigChar>();
    // Singleton 패턴
    private static BigCharFactory singleton = new BigCharFactory();
    // 생성자
    private BigCharFactory() {
    }
    // 유일한 하나의 인스턴스를 얻는다.
    public static BigCharFactory getInstance() {
        return singleton;
    }
    // BigChar의 인스턴스 생성(공유)
    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = pool.get("" + charname);
        if (bc == null) {
            bc = new BigChar(charname); // 여기에서 BigChar의 인스턴스를 생성
            pool.put("" + charname, bc);
        }
        return bc;
    }
}
