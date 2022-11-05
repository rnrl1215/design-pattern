package study.patterns.composite;

public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract String getName();
    public abstract int getSize();
}