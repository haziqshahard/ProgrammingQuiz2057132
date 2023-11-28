package Examinations;

import java.time.LocalDate;

public class BloodPressure extends Exams{

    public int syst = 0;
    public int dias = 0;
    public String duration = "";

    public BloodPressure(LocalDate ExamDate, int syst, int dias, String duration){
        super(ExamDate);
        this.syst = syst;
        this.dias = dias;
        this.duration = duration;
    }
}
