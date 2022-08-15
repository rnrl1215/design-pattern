package patterns.composite;

public class File extends Component {
    private int size = 0;
    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getSize() {
        return size;
    }
}
