package Interface;

import java.util.List;

/**
 * Created by LynnTeng on 2019/4/16.
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
