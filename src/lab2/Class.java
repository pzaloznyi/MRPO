package lab2;

import java.util.ArrayList;

public class Class {
    private Schedule schedule;
    private ArrayList<Pupil> pupils;

    public Class() {
        this.pupils = new ArrayList<>();
    }

    public void addPupil(Pupil pupil) {
        this.pupils.add(pupil);
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
