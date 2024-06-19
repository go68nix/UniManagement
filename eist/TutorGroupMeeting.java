package de.tum.in.ase.eist;

import java.util.Set;

public abstract class TutorGroupMeeting {
	// TODO: implement according to problem statement
    private FixedDateTimeSlot timeSlot;
    private Skill skillToPractise;
    private TutorGroup tutorGroup;
    public TutorGroupMeeting(FixedDateTimeSlot timeSlot,TutorGroup tutorGroup ,Skill skillToPractice){
        this.timeSlot= timeSlot;
        this.skillToPractise= skillToPractice;
        this.tutorGroup= tutorGroup;
        tutorGroup.addMeeting(this);
    }
    public abstract void practise();

    public FixedDateTimeSlot getTimeSlot() {
        return timeSlot;
    }

    public Skill getSkillToPractise() {
        return skillToPractise;
    }

    public TutorGroup getTutorGroup() {
        return tutorGroup;
    }
}
