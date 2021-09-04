package observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();   // �����߻���
    private int number;                     // ������ ��
    public int getNumber() {                // ���� ����Ѵ�.
        return number;
    }
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
