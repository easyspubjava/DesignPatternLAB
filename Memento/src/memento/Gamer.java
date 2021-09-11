package memento;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Gamer {
    private int money;                          // 소유한 돈
    private ArrayList<String> fruits = new ArrayList<String>();       // 과일
    private Random random = new Random();       // 난수발생기
    private static String[] fruitsname = {      // 과일 이름의 표
        "사과", "포도", "바나나", "귤",
    };
    public Gamer(int money) {                   // 생성자
        this.money = money;
    }
    public int getMoney() {                     // 현재의 돈을 얻는닫.
        return money;
    }
    public void bet() {                         // 졌다...게임의 진행
        int dice = random.nextInt(6) + 1;           // 주사위를 던진다.
        if (dice == 1) {                            // 1이 나온다...돈이 증가한다.
            money += 100;
            System.out.println("돈이 증가했습니다.");
        } else if (dice == 2) {                     // 2가 나온다...돈이 반으로 준다.
            money /= 2;
            System.out.println("돈이 반으로 줄었습니다.");
        } else if (dice == 6) {                     // 6이 나온다...과일을 받는다.
            String f = getFruit();
            System.out.println("과일(" + f + ")을 받았습닏다.");
            fruits.add(f);
        } else {                                    // 그 밖에...아무 일도 일어나지 않는다.
            System.out.println("아무일도 일어나지 않았습니다.");
        }
    }
    public Memento createMemento() {                // 스냅샷을 찍는다.
        Memento m = new Memento(money);
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            String f = it.next();
            if (f.startsWith("맛있다.")) {         // 과일은 맛있는 것만 보존
                m.addFruit(f);
            }
        }
        return m;
    }
    public void restoreMemento(Memento memento) {       // undo를 실행한다.
        this.money = memento.money;
        this.fruits = memento.fruits;
    }
    public String toString() {                      // 문자열 표현
        return "[money = " + money + ", fruits = " + fruits + "]";
    }
    private String getFruit() {                     // 과일을 1개 얻는다.
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "맛있다.";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }
}
