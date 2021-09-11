package mediator;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
    private Mediator mediator;
    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {  // 생성자
        super(caption, group, state);
    }
    public void setMediator(Mediator mediator) {            // Mediator를 보관
        this.mediator = mediator;
    }
    public void setColleagueEnabled(boolean enabled) {      // Mediator가 유효/무효를 지시한다.
        setEnabled(enabled);
    }
    public void itemStateChanged(ItemEvent e) {             // 상태가 변하면 Mediator에게 통지
        mediator.colleagueChanged(this);
    }
}
