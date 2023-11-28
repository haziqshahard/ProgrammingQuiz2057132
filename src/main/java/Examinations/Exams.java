package Examinations;

import java.time.LocalDate;

public abstract class Exams {
    public LocalDate ExamDate;

    public Exams(LocalDate ExamDate){
        this.ExamDate = ExamDate;
    }

}
