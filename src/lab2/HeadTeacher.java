package lab2;

import java.util.ArrayList;
import java.util.List;

public class HeadTeacher {
    List<Class> classes;

    public HeadTeacher() {
        this.classes = new ArrayList<>();
    }

    public void setClass(Class c) {
        classes.add(c);
    }

    public void setSchedule(Class c, Schedule schedule) {
        c.setSchedule(schedule);
    }
}
