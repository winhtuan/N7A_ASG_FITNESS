package orther_view;

import Model.Users;
import java.time.LocalDate;
import java.util.Arrays;
import javax.swing.JOptionPane;
import model.Address;
import model.Login;
import service.LoginService;
import service.Service;
import service.UserService;
import view.Validation;

public class RegisterJFrame extends javax.swing.JFrame {

    private Validation validation;

    public RegisterJFrame() {
        validation = new Validation();
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtID = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        txtgender = new javax.swing.JLabel();
        txtSSN = new javax.swing.JLabel();
        getMale = new javax.swing.JRadioButton();
        getFemale = new javax.swing.JRadioButton();
        getMonth = new javax.swing.JComboBox<>();
        getDay = new javax.swing.JComboBox<>();
        getYear = new javax.swing.JComboBox<>();
        txtPhone1 = new javax.swing.JLabel();
        txtgender2 = new javax.swing.JLabel();
        txtGetID = new javax.swing.JTextField();
        txtPhone3 = new javax.swing.JLabel();
        txtGetName = new javax.swing.JTextField();
        txtGetSSN = new javax.swing.JTextField();
        txtGetPhone = new javax.swing.JTextField();
        txtGetWeight = new javax.swing.JTextField();
        txtPhone4 = new javax.swing.JLabel();
        txtGetHeight = new javax.swing.JTextField();
        txtPhone5 = new javax.swing.JLabel();
        txtGetEmail = new javax.swing.JTextField();
        passGetPassword = new javax.swing.JPasswordField();
        txtID1 = new javax.swing.JLabel();
        txtID2 = new javax.swing.JLabel();
        passGetComfirmPassword = new javax.swing.JPasswordField();
        txtGetCountry = new javax.swing.JTextField();
        txtgender5 = new javax.swing.JLabel();
        txtgender1 = new javax.swing.JLabel();
        txtGetStreet = new javax.swing.JTextField();
        txtgender4 = new javax.swing.JLabel();
        txtGetCity = new javax.swing.JTextField();
        txtgender3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        banner = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnRegistration = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        txtPhone.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPhone.setForeground(new java.awt.Color(51, 51, 51));
        txtPhone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtPhone.setText("Adress:");
        txtPhone.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtID.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtID.setForeground(new java.awt.Color(0, 0, 0));
        txtID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtID.setText("User ID");
        txtID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtName.setText("User Name ");
        txtName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtgender.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtgender.setForeground(new java.awt.Color(0, 0, 0));
        txtgender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtgender.setText("Gender");
        txtgender.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtSSN.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtSSN.setForeground(new java.awt.Color(0, 0, 0));
        txtSSN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSSN.setText("User SSN   ");
        txtSSN.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        getMale.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getMale.setForeground(new java.awt.Color(0, 0, 0));
        getMale.setText("Male");

        getFemale.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getFemale.setForeground(new java.awt.Color(0, 0, 0));
        getFemale.setText("Female");

        getMonth.setBackground(new java.awt.Color(255, 255, 255));
        getMonth.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getMonth.setForeground(new java.awt.Color(0, 0, 0));
        getMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getMonth.setSelectedIndex(5);

        getDay.setBackground(new java.awt.Color(255, 255, 255));
        getDay.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getDay.setForeground(new java.awt.Color(0, 0, 0));
        getDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getDay.setSelectedIndex(15);

        getYear.setBackground(new java.awt.Color(255, 255, 255));
        getYear.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getYear.setForeground(new java.awt.Color(0, 0, 0));
        getYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006" }));
        getYear.setSelectedIndex(10);
        getYear.setToolTipText("");

        txtPhone1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPhone1.setForeground(new java.awt.Color(0, 0, 0));
        txtPhone1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtPhone1.setText("Height");
        txtPhone1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtgender2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtgender2.setForeground(new java.awt.Color(0, 0, 0));
        txtgender2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtgender2.setText("Day of birth");
        txtgender2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtGetID.setBackground(new java.awt.Color(255, 255, 255));
        txtGetID.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtGetID.setForeground(new java.awt.Color(0, 0, 0));
        txtGetID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGetID.setToolTipText("");

        txtPhone3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPhone3.setForeground(new java.awt.Color(0, 0, 0));
        txtPhone3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtPhone3.setText("User Phone");
        txtPhone3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtGetName.setBackground(new java.awt.Color(255, 255, 255));
        txtGetName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtGetName.setForeground(new java.awt.Color(0, 0, 0));
        txtGetName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGetName.setToolTipText("");

        txtGetSSN.setBackground(new java.awt.Color(255, 255, 255));
        txtGetSSN.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtGetSSN.setForeground(new java.awt.Color(0, 0, 0));
        txtGetSSN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGetSSN.setToolTipText("");

        txtGetPhone.setBackground(new java.awt.Color(255, 255, 255));
        txtGetPhone.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtGetPhone.setForeground(new java.awt.Color(0, 0, 0));
        txtGetPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGetPhone.setToolTipText("");

        txtGetWeight.setBackground(new java.awt.Color(255, 255, 255));
        txtGetWeight.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtGetWeight.setForeground(new java.awt.Color(0, 0, 0));
        txtGetWeight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGetWeight.setToolTipText("");

        txtPhone4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPhone4.setForeground(new java.awt.Color(0, 0, 0));
        txtPhone4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtPhone4.setText("Weight ");
        txtPhone4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtGetHeight.setBackground(new java.awt.Color(255, 255, 255));
        txtGetHeight.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtGetHeight.setForeground(new java.awt.Color(0, 0, 0));
        txtGetHeight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGetHeight.setToolTipText("");

        txtPhone5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPhone5.setForeground(new java.awt.Color(0, 0, 0));
        txtPhone5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtPhone5.setText("User Email  ");
        txtPhone5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtGetEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtGetEmail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtGetEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtGetEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGetEmail.setToolTipText("");

        passGetPassword.setBackground(new java.awt.Color(255, 255, 255));
        passGetPassword.setForeground(new java.awt.Color(0, 0, 0));
        passGetPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passGetPassword.setToolTipText("");

        txtID1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtID1.setForeground(new java.awt.Color(0, 0, 0));
        txtID1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtID1.setText("Password");
        txtID1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtID2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtID2.setForeground(new java.awt.Color(0, 0, 0));
        txtID2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtID2.setText("Confirm Pass");
        txtID2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        passGetComfirmPassword.setBackground(new java.awt.Color(255, 255, 255));
        passGetComfirmPassword.setForeground(new java.awt.Color(0, 0, 0));
        passGetComfirmPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passGetComfirmPassword.setToolTipText("");

        txtGetCountry.setBackground(new java.awt.Color(255, 255, 255));
        txtGetCountry.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtGetCountry.setForeground(new java.awt.Color(0, 0, 0));
        txtGetCountry.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGetCountry.setToolTipText("");

        txtgender5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtgender5.setForeground(new java.awt.Color(0, 0, 0));
        txtgender5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtgender5.setText("Country");
        txtgender5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtgender1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtgender1.setForeground(new java.awt.Color(0, 0, 0));
        txtgender1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtgender1.setText("Address");
        txtgender1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtGetStreet.setBackground(new java.awt.Color(255, 255, 255));
        txtGetStreet.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtGetStreet.setForeground(new java.awt.Color(0, 0, 0));
        txtGetStreet.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGetStreet.setToolTipText("");

        txtgender4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtgender4.setForeground(new java.awt.Color(0, 0, 0));
        txtgender4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtgender4.setText("Street");
        txtgender4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtGetCity.setBackground(new java.awt.Color(255, 255, 255));
        txtGetCity.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtGetCity.setForeground(new java.awt.Color(0, 0, 0));
        txtGetCity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGetCity.setToolTipText("");

        txtgender3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtgender3.setForeground(new java.awt.Color(0, 0, 0));
        txtgender3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtgender3.setText("City");
        txtgender3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtgender2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getDay, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getYear, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGetHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhone4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGetWeight))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPhone3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPhone5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGetPhone)
                            .addComponent(txtGetEmail)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getMale, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtID2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(passGetComfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passGetPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtGetID, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGetName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSSN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGetSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtgender1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(36, 36, 36)
                                .addComponent(txtgender5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtgender3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGetCity, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtgender4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGetStreet, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(txtGetCountry))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGetID, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passGetPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passGetComfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGetName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtGetSSN, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGetPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGetEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtPhone5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGetWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGetHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtgender, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(getMale, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getDay, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getYear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgender2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtgender1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtgender5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGetCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtgender3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGetStreet)
                        .addComponent(txtgender4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtGetCity)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        banner.setBackground(new java.awt.Color(255, 255, 255));
        banner.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        banner.setForeground(new java.awt.Color(68, 222, 222));
        banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banner.setText("REGISTRATION FORM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(banner))
        );

        btnCancel.setBackground(new java.awt.Color(255, 153, 153));
        btnCancel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 0, 0));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_cancel.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnRegistration.setBackground(new java.awt.Color(204, 255, 255));
        btnRegistration.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegistration.setForeground(new java.awt.Color(0, 153, 153));
        btnRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_registration.png"))); // NOI18N
        btnRegistration.setText("Register");
        btnRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistration)
                .addGap(31, 31, 31)
                .addComponent(btnCancel)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistration))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrationActionPerformed
        String registerID = validation.checkStringInputFormJFRAME(rootPane, txtGetID.getText().trim(), Service.USER_REGEX, "User ID");
        String name = validation.checkStringInputFormJFRAME(rootPane, txtGetName.getText().trim(), Service.TEXT_REGEX, "User Name");
        String ssn = validation.checkStringInputFormJFRAME(rootPane, txtGetSSN.getText().trim(), Service.SSN_REGEX, "User SSN");
        String phone = validation.checkStringInputFormJFRAME(rootPane, txtGetPhone.getText().trim(), Service.PHONE_REGEX, "User Phone Number");
        String email = validation.checkStringInputFormJFRAME(rootPane, txtGetEmail.getText().trim(), Service.EMAIL_REGEX, "User Email");
        String country = validation.checkStringInputFormJFRAME(rootPane, txtGetCountry.getText().trim(), Service.TEXT_REGEX, "Country");
        String city = validation.checkStringInputFormJFRAME(rootPane, txtGetCity.getText().trim(), Service.TEXT_REGEX, "City");
        String street = validation.checkStringInputFormJFRAME(rootPane, txtGetStreet.getText().trim(), Service.TEXT_REGEX, "Street");
        double height = validation.checkDoubleInputFromJFRAM(rootPane, txtGetHeight.getText().trim(), "User Height");
        double weight = validation.checkDoubleInputFromJFRAM(rootPane, txtGetWeight.getText().trim(), "User Weight");
        String day = getDay.getSelectedItem().toString();
        String month = getMonth.getSelectedItem().toString();
        String year = getYear.getSelectedItem().toString();
        String birthdayString = day + "/" + month + "/" + year;
        LocalDate birthDay = validation.convertStringToLocalDate(birthdayString);
        boolean gender = getMale.isSelected();
        Address address = new Address(country, city, street);
        Users users = new Users(registerID, name, ssn, phone, gender, birthDay, email, address, height, weight);
        char[] password = passGetPassword.getPassword();
        char[] confirm = passGetPassword.getPassword();
        if (!Arrays.equals(password, confirm)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Login login = new Login(registerID, new String(password));
            new LoginService().addAccount(login);
        }
        new UserService().addNewCustomer(users);
    }//GEN-LAST:event_btnRegistrationActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRegistration;
    private javax.swing.JComboBox<String> getDay;
    private javax.swing.JRadioButton getFemale;
    private javax.swing.JRadioButton getMale;
    private javax.swing.JComboBox<String> getMonth;
    private javax.swing.JComboBox<String> getYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField passGetComfirmPassword;
    private javax.swing.JPasswordField passGetPassword;
    private javax.swing.JTextField txtGetCity;
    private javax.swing.JTextField txtGetCountry;
    private javax.swing.JTextField txtGetEmail;
    private javax.swing.JTextField txtGetHeight;
    private javax.swing.JTextField txtGetID;
    private javax.swing.JTextField txtGetName;
    private javax.swing.JTextField txtGetPhone;
    private javax.swing.JTextField txtGetSSN;
    private javax.swing.JTextField txtGetStreet;
    private javax.swing.JTextField txtGetWeight;
    private javax.swing.JLabel txtID;
    private javax.swing.JLabel txtID1;
    private javax.swing.JLabel txtID2;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtPhone;
    private javax.swing.JLabel txtPhone1;
    private javax.swing.JLabel txtPhone3;
    private javax.swing.JLabel txtPhone4;
    private javax.swing.JLabel txtPhone5;
    private javax.swing.JLabel txtSSN;
    private javax.swing.JLabel txtgender;
    private javax.swing.JLabel txtgender1;
    private javax.swing.JLabel txtgender2;
    private javax.swing.JLabel txtgender3;
    private javax.swing.JLabel txtgender4;
    private javax.swing.JLabel txtgender5;
    // End of variables declaration//GEN-END:variables
}
