package lab5;

import java.util.HashMap;
import java.util.HashSet;

public class Journal {
    private HashMap<String, HashSet<Discipline>> students = new HashMap<>();

    public void addStudent(String name) throws StudentInJournalException{
        if (students.containsKey(name)){
            throw new StudentInJournalException("The student " + name + " is already in Journal.");
        } else {
            students.put(name, new HashSet<>());
        }
    }

    public void addMark(String name, Discipline discipline) {
        if (students.containsKey(name)){
            HashSet<Discipline> disciplines = students.get(name);
            disciplines.add(discipline);
        }
    }
}

