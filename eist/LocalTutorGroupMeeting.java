package de.tum.in.ase.eist;

public class LocalTutorGroupMeeting extends TutorGroupMeeting {
	// TODO: implement according to problem statement
    private String room;

    public LocalTutorGroupMeeting(FixedDateTimeSlot timeSlot,TutorGroup tutorGroup, Skill skillToPractice, String room) {
        super(timeSlot,tutorGroup, skillToPractice);
        this.room= room;
    }

    @Override
    public void practise() {
        getTutorGroup().getTutor().say("Thank you for coming to "+room+" today." );
        for(Student e: getTutorGroup().getStudents()){
            e.learnSkill(getSkillToPractise());
        }
        getTutorGroup().getTutor().say("See you next time!");
    }

    public String getRoom() {
        return room;
    }
}
