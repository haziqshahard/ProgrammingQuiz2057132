import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Doctor {
    static GraphicsConfiguration gc;
    ArrayList<Patient> patients = new ArrayList<>();
    public JFrame frame = new JFrame(gc);
    public static void view(ArrayList<Patient> patients){
        JFrame frame = new JFrame(gc);
        frame.setSize(800,800);
        frame.setLayout(new GridLayout(0,1));
        for(int counter=0;counter<patients.size();counter++){
            Patient patient = patients.get(counter);
            JPanel patientPanel = new JPanel();
            JPanel patientImage = new JPanel();
            JPanel patientDetails = new JPanel();
            JPanel MRIImage = new JPanel();
            JPanel BPDetails = new JPanel();
            ImageIcon picture = new ImageIcon(patient.picture);
            ImageIcon MRIpicture = new ImageIcon(patient.MRI.imageURL);

            patientPanel.setLayout(new GridLayout(1,4));
            JLabel pictureLabel = new JLabel();
            pictureLabel.setIcon(picture);
            patientImage.add(pictureLabel);

            JLabel MRILabel = new JLabel();
            MRILabel.setIcon(MRIpicture);
            MRIImage.add(MRILabel);

            JLabel patlabel = new JLabel();
            patlabel.setText("<html>Name: "+ patient.name+ "<br>" +"Age: "+ patient.age +"</html>");
            patientDetails.add(patlabel);

            JLabel BPlabel = new JLabel();
            BPlabel.setText("<html>Blood Pressure <br>" + patient.BP.syst + " over " + patient.BP.dias +"</html>");
            BPDetails.add(BPlabel);

            patientPanel.add(patientImage);
            patientPanel.add(patientDetails);
            patientPanel.add(MRIImage);
            patientPanel.add(BPDetails);
            frame.add(patientPanel);

        }
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });
    }

    public static void view(Patient patient){ //To view just one patient
        JFrame frame = new JFrame(gc);
        frame.setSize(800,800);
        frame.setLayout(new GridLayout(0,1));
        JPanel patientPanel = new JPanel();
        JPanel patientImage = new JPanel();
        JPanel patientDetails = new JPanel();
        JPanel MRIImage = new JPanel();
        JPanel BPDetails = new JPanel();
        ImageIcon picture = new ImageIcon(patient.picture);
        ImageIcon MRIpicture = new ImageIcon(patient.MRI.imageURL);

        patientPanel.setLayout(new GridLayout(1,4));
        JLabel pictureLabel = new JLabel();
        pictureLabel.setIcon(picture);
        patientImage.add(pictureLabel);

        JLabel MRILabel = new JLabel();
        MRILabel.setIcon(MRIpicture);
        MRIImage.add(MRILabel);

        JLabel patlabel = new JLabel();
        patlabel.setText("<html>Name: "+ patient.name+ "<br>" +"Age: "+ patient.age +"</html>");
        patientDetails.add(patlabel);

        JLabel BPlabel = new JLabel();
        BPlabel.setText("<html>Blood Pressure <br>" + patient.BP.syst + " over " + patient.BP.dias +"</html>");
        BPDetails.add(BPlabel);

        patientPanel.add(patientImage);
        patientPanel.add(patientDetails);
        patientPanel.add(MRIImage);
        patientPanel.add(BPDetails);
        frame.add(patientPanel);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });

    }
}
