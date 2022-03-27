package visitor;

import java.util.Iterator;

public abstract class Entry implements Acceptor {
    public abstract String getName();                                   // 이름을 얻는다.
    public abstract int getSize();                                      // 사이즈를 얻는다.
    public Entry add(Entry entry) throws FileTreatmentException {       // 엔트리를 추가
        throw new FileTreatmentException();
    }
    public Iterator iterator() throws FileTreatmentException {    // Iterator의 생성
        throw new FileTreatmentException();
    }
    public String toString() {                                          // 문자열 표현
        return getName() + " (" + getSize() + ")";
    }
}
