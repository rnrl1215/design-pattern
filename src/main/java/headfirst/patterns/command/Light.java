package headfirst.patterns.command;

import lombok.extern.slf4j.Slf4j;
public class Light {
    public void on() {
        System.out.println("Light On");
    }
    public void off() {
        System.out.println("Light Off");
    }
}
