package lab2;

public class Teacher {
    private Discipline discipline;

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public void setMarkToPupil(Pupil pupil, int mark){
        pupil.setMark(this.discipline, mark);
    }
}
