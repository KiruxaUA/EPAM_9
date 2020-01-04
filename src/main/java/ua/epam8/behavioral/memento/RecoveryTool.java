package ua.epam8.behavioral.memento;

import java.util.ArrayList;

public class RecoveryTool {
    private ArrayList<RecoveryImage> mementos = new ArrayList<RecoveryImage>();

    public void addImage(RecoveryImage m) {
        mementos.add(m);
    }

    public void deleteLastImage() {
        mementos.remove(mementos.size() - 1);
    }

    public RecoveryImage getLastGoodImage() {
        return mementos.get(mementos.size() - 1);
    }
}
