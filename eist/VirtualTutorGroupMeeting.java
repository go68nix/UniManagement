package de.tum.in.ase.eist;

public class VirtualTutorGroupMeeting extends TutorGroupMeeting{
    private String url;

    public VirtualTutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup,Skill skillToPractice,String url) {
        super(timeSlot,tutorGroup, skillToPractice);
        this.url= url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public void practise() {
        getTutorGroup().getTutor().say("Thank you for joining using "+url+" today." );
        for(Student e: getTutorGroup().getStudents()){
            e.learnSkill(getSkillToPractise());
        }
        getTutorGroup().getTutor().say("See you next time!");
    }
    // TODO: implement according to problem statement
}
