package de.tum.in.ase.eist;

import java.time.LocalDate;
import java.time.LocalTime;

public class FixedDateTimeSlot extends TimeSlot{
	// TODO: implement according to problem statement
    private LocalDate date;
    public FixedDateTimeSlot(LocalDate date, LocalTime a, LocalTime b){
        super(a,b);
        this.date= date;
    }

    public LocalDate getDate() {
        return date;
    }

}
