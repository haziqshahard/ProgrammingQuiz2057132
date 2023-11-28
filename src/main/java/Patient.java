import Examinations.BloodPressure;
import Examinations.MRI;

import java.net.URL;
import java.time.LocalDate;

public class Patient {
    public String name = "";
    public int age = 0;
    public URL picture = null;
    public MRI MRI = null;

    public BloodPressure BP = null;

    public Patient(String name, int age, URL picture){
        this.name = name;
        this.age = age;
        this.picture = picture;
    }

    public void setMRIdetails(LocalDate ExamDate, URL imageURL, int FieldStrength){
        if(FieldStrength <0){
            throw new ArithmeticException("Field Strength must be Positive");
        }
        else{
            MRI = new MRI(ExamDate, imageURL, FieldStrength);
        }

    }

    public void setBPdetails(LocalDate ExamDate, int syst, int dias, String duration){
        if(syst <= 0 || dias<= 0){
            throw new ArithmeticException("Blood Pressure Values must be Positive");
        }
        if(duration != "VST" && duration != "ST" ){
            throw new RuntimeException("Duration must be either VST or ST");
        }
        else{
            BP = new BloodPressure(ExamDate, syst, dias, duration);
        }

    }

}
