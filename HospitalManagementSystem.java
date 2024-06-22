import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class HospitalManagementSystem {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new MainFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Hospital Management System");
        setSize(800, 600);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Patient Management", new PatientManagementPanel());
        tabbedPane.addTab("Staff Management", new StaffManagementPanel());
        tabbedPane.addTab("Inventory Management", new InventoryManagementPanel());
        tabbedPane.addTab("Billing and Accounting", new BillingPanel());
        tabbedPane.addTab("EHR", new EHRPanel());
        tabbedPane.addTab("Laboratory Management", new LaboratoryPanel());
        tabbedPane.addTab("Pharmacy Management", new PharmacyPanel());
        tabbedPane.addTab("Appointment Scheduling", new AppointmentPanel());
        tabbedPane.addTab("Reporting and Analytics", new ReportingPanel());
        tabbedPane.addTab("Security and Access Control", new SecurityPanel());

        add(tabbedPane, BorderLayout.CENTER);
    }
}

class PatientManagementPanel extends JPanel {
    private ArrayList<Object[]> patientData;
    private DefaultTableModel model;

    public PatientManagementPanel() {
        patientData = new ArrayList<>();
        setLayout(new BorderLayout());

        String[] columnNames = {"ID", "Name", "Age", "Address"};
        model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel formPanel = new JPanel(new GridLayout(0, 2));
        formPanel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField();
        formPanel.add(nameField);
        formPanel.add(new JLabel("Age:"));
        JTextField ageField = new JTextField();
        formPanel.add(ageField);
        formPanel.add(new JLabel("Address:"));
        JTextField addressField = new JTextField();
        formPanel.add(addressField);

        JButton addButton = new JButton("Add Patient");
        formPanel.add(addButton);
        addButton.addActionListener(e -> {
            String name = nameField.getText();
            String age = ageField.getText();
            String address = addressField.getText();
            patientData.add(new Object[]{patientData.size() + 1, name, age, address});
            model.addRow(new Object[]{patientData.size(), name, age, address});
        });

        add(formPanel, BorderLayout.SOUTH);
    }
}

class StaffManagementPanel extends JPanel {
    private ArrayList<Object[]> staffData;
    private DefaultTableModel model;

    public StaffManagementPanel() {
        staffData = new ArrayList<>();
        setLayout(new BorderLayout());

        String[] columnNames = {"ID", "Name", "Position"};
        model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel formPanel = new JPanel(new GridLayout(0, 2));
        formPanel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField();
        formPanel.add(nameField);
        formPanel.add(new JLabel("Position:"));
        JTextField positionField = new JTextField();
        formPanel.add(positionField);

        JButton addButton = new JButton("Add Staff");
        formPanel.add(addButton);
        addButton.addActionListener(e -> {
            String name = nameField.getText();
            String position = positionField.getText();
            staffData.add(new Object[]{staffData.size() + 1, name, position});
            model.addRow(new Object[]{staffData.size(), name, position});
        });

        add(formPanel, BorderLayout.SOUTH);
    }
}

class InventoryManagementPanel extends JPanel {
    private ArrayList<Object[]> inventoryData;
    private DefaultTableModel model;

    public InventoryManagementPanel() {
        inventoryData = new ArrayList<>();
        setLayout(new BorderLayout());

        String[] columnNames = {"ID", "Item", "Quantity"};
        model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel formPanel = new JPanel(new GridLayout(0, 2));
        formPanel.add(new JLabel("Item:"));
        JTextField itemField = new JTextField();
        formPanel.add(itemField);
        formPanel.add(new JLabel("Quantity:"));
        JTextField quantityField = new JTextField();
        formPanel.add(quantityField);

        JButton addButton = new JButton("Add Item");
        formPanel.add(addButton);
        addButton.addActionListener(e -> {
            String item = itemField.getText();
            String quantity = quantityField.getText();
            inventoryData.add(new Object[]{inventoryData.size() + 1, item, quantity});
            model.addRow(new Object[]{inventoryData.size(), item, quantity});
        });

        add(formPanel, BorderLayout.SOUTH);
    }
}

class BillingPanel extends JPanel {
    private ArrayList<Object[]> billingData;
    private DefaultTableModel model;

    public BillingPanel() {
        billingData = new ArrayList<>();
        setLayout(new BorderLayout());

        String[] columnNames = {"Bill ID", "Patient ID", "Amount", "Status"};
        model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel formPanel = new JPanel(new GridLayout(0, 2));
        formPanel.add(new JLabel("Patient ID:"));
        JTextField patientIdField = new JTextField();
        formPanel.add(patientIdField);
        formPanel.add(new JLabel("Amount:"));
        JTextField amountField = new JTextField();
        formPanel.add(amountField);

        JButton addButton = new JButton("Add Bill");
        formPanel.add(addButton);
        addButton.addActionListener(e -> {
            String patientId = patientIdField.getText();
            String amount = amountField.getText();
            billingData.add(new Object[]{billingData.size() + 1, patientId, amount, "Unpaid"});
            model.addRow(new Object[]{billingData.size(), patientId, amount, "Unpaid"});
        });

        add(formPanel, BorderLayout.SOUTH);
    }
}

class EHRPanel extends JPanel {
    private ArrayList<Object[]> ehrData;
    private DefaultTableModel model;

    public EHRPanel() {
        ehrData = new ArrayList<>();
        setLayout(new BorderLayout());

        String[] columnNames = {"Record ID", "Patient ID", "Details"};
        model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel formPanel = new JPanel(new GridLayout(0, 2));
        formPanel.add(new JLabel("Patient ID:"));
        JTextField patientIdField = new JTextField();
        formPanel.add(patientIdField);
        formPanel.add(new JLabel("Details:"));
        JTextField detailsField = new JTextField();
        formPanel.add(detailsField);

        JButton addButton = new JButton("Add Record");
        formPanel.add(addButton);
        addButton.addActionListener(e -> {
            String patientId = patientIdField.getText();
            String details = detailsField.getText();
            ehrData.add(new Object[]{ehrData.size() + 1, patientId, details});
            model.addRow(new Object[]{ehrData.size(), patientId, details});
        });

        add(formPanel, BorderLayout.SOUTH);
    }
}

class LaboratoryPanel extends JPanel {
    private ArrayList<Object[]> labData;
    private DefaultTableModel model;

    public LaboratoryPanel() {
        labData = new ArrayList<>();
        setLayout(new BorderLayout());

        String[] columnNames = {"Test ID", "Patient ID", "Test Name", "Result"};
        model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel formPanel = new JPanel(new GridLayout(0, 2));
        formPanel.add(new JLabel("Patient ID:"));
        JTextField patientIdField = new JTextField();
        formPanel.add(patientIdField);
        formPanel.add(new JLabel("Test Name:"));
        JTextField testNameField = new JTextField();
        formPanel.add(testNameField);
        formPanel.add(new JLabel("Result:"));
        JTextField resultField = new JTextField();
        formPanel.add(resultField);

        JButton addButton = new JButton("Add Test");
        formPanel.add(addButton);
        addButton.addActionListener(e -> {
            String patientId = patientIdField.getText();
            String testName = testNameField.getText();
            String result = resultField.getText();
            labData.add(new Object[]{labData.size() + 1, patientId, testName, result});
            model.addRow(new Object[]{labData.size(), patientId, testName, result});
        });

        add(formPanel, BorderLayout.SOUTH);
    }
}

class PharmacyPanel extends JPanel {
    private ArrayList<Object[]> pharmacyData;
    private DefaultTableModel model;

    public PharmacyPanel() {
        pharmacyData = new ArrayList<>();
        setLayout(new BorderLayout());

        String[] columnNames = {"Prescription ID", "Patient ID", "Medication", "Dosage"};
        model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel formPanel = new JPanel(new GridLayout(0, 2));
        formPanel.add(new JLabel("Patient ID:"));
        JTextField patientIdField = new JTextField();
        formPanel.add(patientIdField);
        formPanel.add(new JLabel("Medication:"));
        JTextField medicationField = new JTextField();
        formPanel.add(medicationField);
        formPanel.add(new JLabel("Dosage:"));
        JTextField dosageField = new JTextField();
        formPanel.add(dosageField);

        JButton addButton = new JButton("Add Prescription");
        formPanel.add(addButton);
        addButton.addActionListener(e -> {
            String patientId = patientIdField.getText();
            String medication = medicationField.getText();
            String dosage = dosageField.getText();
            pharmacyData.add(new Object[]{pharmacyData.size() + 1, patientId, medication, dosage});
            model.addRow(new Object[]{pharmacyData.size(), patientId, medication, dosage});
        });

        add(formPanel, BorderLayout.SOUTH);
    }
}

class AppointmentPanel extends JPanel {
    private ArrayList<Object[]> appointmentData;
    private DefaultTableModel model;

    public AppointmentPanel() {
        appointmentData = new ArrayList<>();
        setLayout(new BorderLayout());

        String[] columnNames = {"Appointment ID", "Patient ID", "Date", "Time"};
        model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel formPanel = new JPanel(new GridLayout(0, 2));
        formPanel.add(new JLabel("Patient ID:"));
        JTextField patientIdField = new JTextField();
        formPanel.add(patientIdField);
        formPanel.add(new JLabel("Date:"));
        JTextField dateField = new JTextField();
        formPanel.add(dateField);
        formPanel.add(new JLabel("Time:"));
        JTextField timeField = new JTextField();
        formPanel.add(timeField);

        JButton addButton = new JButton("Add Appointment");
        formPanel.add(addButton);
        addButton.addActionListener(e -> {
            String patientId = patientIdField.getText();
            String date = dateField.getText();
            String time = timeField.getText();
            appointmentData.add(new Object[]{appointmentData.size() + 1, patientId, date, time});
            model.addRow(new Object[]{appointmentData.size(), patientId, date, time});
        });

        add(formPanel, BorderLayout.SOUTH);
    }
}

class ReportingPanel extends JPanel {
    private ArrayList<Object[]> reportData;
    private DefaultTableModel model;

    public ReportingPanel() {
        reportData = new ArrayList<>();
        setLayout(new BorderLayout());

        String[] columnNames = {"Report ID", "Title", "Date"};
        model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel formPanel = new JPanel(new GridLayout(0, 2));
        formPanel.add(new JLabel("Title:"));
        JTextField titleField = new JTextField();
        formPanel.add(titleField);
        formPanel.add(new JLabel("Date:"));
        JTextField dateField = new JTextField();
        formPanel.add(dateField);

        JButton addButton = new JButton("Generate Report");
        formPanel.add(addButton);
        addButton.addActionListener(e -> {
            String title = titleField.getText();
            String date = dateField.getText();
            reportData.add(new Object[]{reportData.size() + 1, title, date});
            model.addRow(new Object[]{reportData.size(), title, date});
        });

        add(formPanel, BorderLayout.SOUTH);
    }
}

class SecurityPanel extends JPanel {
    private ArrayList<Object[]> userData;
    private DefaultTableModel model;

    public SecurityPanel() {
        userData = new ArrayList<>();
        setLayout(new BorderLayout());

        String[] columnNames = {"User ID", "Name", "Role", "Access Level"};
        model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel formPanel = new JPanel(new GridLayout(0, 2));
        formPanel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField();
        formPanel.add(nameField);
        formPanel.add(new JLabel("Role:"));
        JTextField roleField = new JTextField();
        formPanel.add(roleField);
        formPanel.add(new JLabel("Access Level:"));
        JTextField accessLevelField = new JTextField();
        formPanel.add(accessLevelField);

        JButton addButton = new JButton("Add User");
        formPanel.add(addButton);
        addButton.addActionListener(e -> {
            String name = nameField.getText();
            String role = roleField.getText();
            String accessLevel = accessLevelField.getText();
            userData.add(new Object[]{userData.size() + 1, name, role, accessLevel});
            model.addRow(new Object[]{userData.size(), name, role, accessLevel});
        });

        add(formPanel, BorderLayout.SOUTH);
}
}