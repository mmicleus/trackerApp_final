import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalorieCounterPanel extends JPanel {

    private JTextField weightField, heightField, ageField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public CalorieCounterPanel() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        weightField = new JTextField(10);
        heightField = new JTextField(10);
        ageField = new JTextField(10);

        calculateButton = new JButton("Calculate Calories");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateCalories();
            }
        });

        resultLabel = new JLabel("Calories: ");

        add(new JLabel("Weight (kg):"));
        add(weightField);
        add(new JLabel("Height (cm):"));
        add(heightField);
        add(new JLabel("Age:"));
        add(ageField);
        add(calculateButton);
        add(resultLabel);
    }

    private void calculateCalories() {
        try {
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());
            int age = Integer.parseInt(ageField.getText());

            double calories = calculateCaloriesForMen(weight, height, age); 

            resultLabel.setText("Calories: " + calories);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Please enter valid numbers.");
        }
    }

    
    private double calculateCaloriesForMen(double weight, double height, int age) {
        return (13.75 * weight) + (5 * height) - (6.76 * age) + 66.5;
    }
}
