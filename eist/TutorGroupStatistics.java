package de.tum.in.ase.eist;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public final class TutorGroupStatistics {

	private TutorGroupStatistics() {

	}

	public static double averageDuration(Stream<TutorGroupMeeting> meetingStream) {
		return meetingStream.mapToLong(x->x.getTimeSlot().getDuration().getSeconds()).average().orElse(0);
	}

	public static Set<Skill> repeatedSkills(Stream<TutorGroupMeeting> meetings) {
		Set<Skill> a=new HashSet<>();
		meetings.forEach(x->a.add(x.getSkillToPractise()));
		return a;
	}
}
