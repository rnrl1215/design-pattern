package patterns.composite;

public class PrintUtils {
    public static void printList(Component component) {
        System.out.println(component.getClass().getName() +" | "+ component.getName());
        if (component instanceof Directory) {
            for(Component directory : ((Directory) component).getChildren()) {
                printList(directory);
            }
        }
    }

}
