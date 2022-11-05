package study.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Component {
    List<Component> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for(Component component : children) {
            size += component.getSize();
        }
        return size;
    }

    public void add(Component component) {
        children.add(component);
    }


    public void remove(Component component) {
        children.remove(component);
    }

    public List<Component> getChildren() {
        return children;
    }
}
