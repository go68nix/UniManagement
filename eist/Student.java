package de.tum.in.ase.eist;

import java.util.HashSet;
import java.util.Set;

public class Student extends Person {

    private String matriculationNumber;
    private int semester;
    private Set<String> knowledge;
    private Set<Skill> skills;
    private StudyLevel studyLevel;
    public Student(String name, int age, String tumId,String matriculationNumber,StudyLevel studyLevel,int semester) {
        super(name, age, tumId);
        this.matriculationNumber= matriculationNumber;
        this.semester= semester;
        this.studyLevel= studyLevel;
        this.knowledge= new HashSet<>();
        this.skills= new HashSet<>();
    }
    public void learnSkill(Skill haja){
        skills.add(haja);
    }
    public void acquireKnowledge(String a){
        knowledge.add(a);
    }

    public int getSemester() {
        return semester;
    }

    public String getMatriculationNumber() {
        return matriculationNumber;
    }

    public Set<String> getKnowledge() {
        return knowledge;
    }

    public StudyLevel getStudyLevel() {
        return studyLevel;
    }

    public Set<Skill> getSkills() {
        return skills;
    }
    // TODO: implement according to problem statement
}
