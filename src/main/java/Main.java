import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        URL DaphneURL = null;
        URL DaphneMRIURL = null;
        URL SebastianURL = null;
        URL SebastianMRIURL = null;
        try {
            DaphneURL = new URL("https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg");
            DaphneMRIURL = new URL("https://martinh.netfirms.com/BIOE60010/mri1.jpg");
            SebastianURL = new URL("https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg");
            SebastianMRIURL = new URL("https://martinh.netfirms.com/BIOE60010/mri2.jpg");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        Patient Daph = new Patient("Daphne Von Oram",62, DaphneURL);
        Daph.setMRIdetails(LocalDate.of(2023,9,14),DaphneMRIURL,2);
        Daph.setBPdetails(LocalDate.of(2023,9,15),130,70,"ST");
        Patient Sebastian = new Patient("Sebastian Compton", 31, SebastianURL);
        Sebastian.setMRIdetails(LocalDate.of(2023,11,19),SebastianMRIURL,4);
        Sebastian.setBPdetails(LocalDate.of(2023,11,20),150,80,"VST");

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(Daph);
        patients.add(Sebastian);

        Doctor.view(patients);
        Administrator.view(patients);
        Administrator.view(Daph);

    }
}
