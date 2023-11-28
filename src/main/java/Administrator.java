import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class Administrator extends JFrame {

    static GraphicsConfiguration gc;
    ArrayList<Patient> patients = new ArrayList<>();

    public static void view(ArrayList<Patient> patients) {
        JFrame frame = new JFrame(gc);
        frame.setSize(800, 200);
        frame.setLayout(new GridLayout(0, 1));
        for (int counter = 0; counter < patients.size(); counter++) {
            Patient patient = patients.get(counter);
            JPanel patientPanel = new JPanel();

            JLabel patientLabel = new JLabel();
            patientLabel.setText("<html>Patient: " + patient.name + ": "
                    + "MRI: " + patient.MRI.FieldStrength + " Tesla, "
                    + patient.MRI.ExamDate.toString()
                    + ": BP: "
                    + patient.BP.duration
                    + ", "
                    + patient.BP.ExamDate.toString()
                    + "</html>");

            patientPanel.add(patientLabel);
            frame.add(patientPanel);

        }
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void view(Patient patient) {
        JFrame frame = new JFrame(gc);
        frame.setSize(800, 200);
        frame.setLayout(new GridLayout(0, 1));
        JPanel patientPanel = new JPanel();

        JLabel patientLabel = new JLabel();
        patientLabel.setText("<html>Patient: " + patient.name + ": "
                + "MRI: " + patient.MRI.FieldStrength + " Tesla, "
                + patient.MRI.ExamDate.toString()
                + ": BP: "
                + patient.BP.duration
                + ", "
                + patient.BP.ExamDate.toString()
                + "</html>");

        patientPanel.add(patientLabel);
        frame.add(patientPanel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }
}

