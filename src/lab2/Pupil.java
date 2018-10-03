package lab2;

import java.util.HashMap;
import java.util.Map;

public class Pupil {
    private Map<Discipline, Integer> marks;

    public Pupil(){
        this.marks = new HashMap<>();
    }

    public int getMark(Discipline discipline){
        if (this.marks.containsKey(discipline))
            return this.marks.get(discipline);

        return 0;
    }

    public void setMark(Discipline discipline, int mark){
        this.marks.put(discipline, mark);
    }
}
