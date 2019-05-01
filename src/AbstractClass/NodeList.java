package AbstractClass;

/**
 * Created by LynnTeng on 2019/5/1.
 */
public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
