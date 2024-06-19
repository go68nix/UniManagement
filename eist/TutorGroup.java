package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TutorGroup {
	// TODO: implement according to problem statement
    private String id;
    private Person tutor;
    private WeeklyTimeSlot timeSlot;
    private Set<Student> students;
    private List<TutorGroupMeeting> meetings;
    public TutorGroup(String id,WeeklyTimeSlot weeklyTimeSlot,Person person){
        this.id= id;
        this.timeSlot= weeklyTimeSlot;
        this.tutor= person;
        this.students= new HashSet<>();
        this.meetings= new ArrayList<>();
    }
    void addMeeting(TutorGroupMeeting u){
        meetings.add(u);
    }
    public void register(Student a){
        students.add(a);
    }

    public Person getTutor() {
        return tutor;
    }

    public String getId() {
        return id;
    }

    public WeeklyTimeSlot getTimeSlot() {
        return timeSlot;
    }

    public List<TutorGroupMeeting> getMeetings() {
        return meetings;
    }

    public Set<Student> getStudents() {
        return students;
    }
}
