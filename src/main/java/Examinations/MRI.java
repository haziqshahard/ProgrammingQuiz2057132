package Examinations;

import java.net.URL;
import java.time.LocalDate;

public class MRI extends Exams{

    public URL imageURL = null;
    public int FieldStrength = 0;
    public MRI(LocalDate ExamDate, URL imageURL, int FieldStrength){
        super(ExamDate);
        this.imageURL = imageURL;
        this.FieldStrength = FieldStrength;
    }






}
