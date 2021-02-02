package com.JavaPractice;

/*


SOME WORK
    i have to put some more restriction while creating new account
    admin user menu is incomplete where admin can change database,database password,see all user ,remove any user etc
    i have to put edit option in new user menu

 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SwingExample extends JFrame implements ActionListener {
    String[] branchList = {"SELECT", "CSE", "MECHANICAL", "CIVIL", "ELECTRONICS", "ELECTRICAL", "CHEMICAL", "OTHER"},
            semesterList = {"SELECT", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH"},
            genderList = {"Female","Male"};

    JLabel introMainMenu, intro2, name, gender1, mobileNumber, emailID, semester, branch, password, lMobileNumber, lPassword;
    JTextField tName, tMobileNumber, tEmailID, tMobileNumber2;
    JButton admin, newUser, existingUser, back, clear, submit, exit,view2 ,edit;

    JComboBox cGender, cBranch, cSemester;

    JPasswordField PPassword, PPassword2;

    JPanel plshow;

    SwingExample() {
        setTitle("MAIN_MENU");
//        setLayout(new FlowLayout());
        setLayout(null);
        setVisible(true);

        setSize(750, 750);
        setDefaultCloseOperation(3);

        allComponent();
    }

    void allComponent() {
        introMainMenu = new JLabel("WELCOME to JDBC");
        introMainMenu.setBounds(300, 50, 650, 50);


        admin = new JButton("ADMIN");
        admin.setBounds(100, 400, 150, 50);
        admin.setBackground(Color.pink);

        newUser = new JButton("NEW USER");
        newUser.setBounds(300, 400, 150, 50);
        newUser.setBackground(Color.gray);

        existingUser = new JButton("EXISTING USER");
        existingUser.setBounds(500, 400, 150, 50);
        existingUser.setBackground(Color.cyan);

        exit = new JButton("EXIT");
        exit.setBounds(300, 500, 150, 50);
        exit.setBackground(Color.lightGray);

        name = new JLabel("Name");
        name.setBounds(200, 100, 200, 30);

        gender1 = new JLabel("DOB");
        gender1.setBounds(200, 140, 200, 30);

        branch = new JLabel("Branch");
        branch.setBounds(200, 180, 200, 30);

        semester = new JLabel("Semester");
        semester.setBounds(200, 220, 200, 30);

        mobileNumber = new JLabel("Mobile no.");
        mobileNumber.setBounds(200, 260, 200, 30);

        emailID = new JLabel("EMAIL ID");
        emailID.setBounds(200, 300, 200, 30);

        password = new JLabel("PASSWORD");
        password.setBounds(200, 340, 200, 30);
        ;

        lMobileNumber = new JLabel("MobileNumber");
        lMobileNumber.setBounds(200, 180, 200, 50);

        lPassword = new JLabel("Password");
        lPassword.setBounds(200, 300, 200, 50);

        ///////////////////////////////////

        tName = new JTextField();
        tName.setBounds(300, 100, 300, 30);

        cGender = new JComboBox(genderList);
        cGender.setBounds(300, 140, 300, 30);


        cBranch = new JComboBox(branchList);
        cBranch.setBounds(300, 180, 300, 30);


        cSemester = new JComboBox(semesterList);
        cSemester.setBounds(300, 220, 300, 30);


        tMobileNumber = new JTextField(10);
        tMobileNumber.setBounds(300, 260, 300, 30);


        tEmailID = new JTextField();
        tEmailID.setBounds(300, 300, 300, 30);


        PPassword = new JPasswordField();
        PPassword.setBounds(300, 340, 300, 30);

        tMobileNumber2 = new JTextField();
        tMobileNumber2.setBounds(300, 180, 300, 50);

        PPassword2 = new JPasswordField();
        PPassword2.setBounds(300, 300, 300, 50);

        plshow = new JPanel();
        plshow.setBounds(100, 100, 300, 300);


        view2 = new JButton("VIEW");
        view2.setBounds(500, 400, 150, 50);
        view2.setBackground(Color.cyan);

        back = new JButton("BACK");
        back.setBounds(100, 400, 150, 50);
        back.setBackground(Color.gray);

        clear = new JButton("CLEAR");
        clear.setBounds(300, 400, 150, 50);
        clear.setBackground(Color.pink);

        submit = new JButton("SUBMIT");
        submit.setBounds(500, 400, 150, 50);
        submit.setBackground(Color.cyan);


        add(introMainMenu);
        add(admin);
        add(newUser);
        add(existingUser);
        add(exit);

        add(name);
        add(gender1);
        add(branch);
        add(semester);
        add(mobileNumber);
        add(emailID);
        add(password);
        add(lMobileNumber);
        add(lPassword);

        add(tName);
        add(cGender);
        add(cBranch);
        add(cSemester);
        add(tMobileNumber);
        add(tEmailID);
        add(PPassword);
        add(tMobileNumber2);
        add(PPassword2);
        add(plshow);


        add(view2);
        add(back);
        add(clear);
        add(submit);


        plshow.setVisible(false);
        introMainMenu.setVisible(false);
        admin.setVisible(false);
        newUser.setVisible(false);
        existingUser.setVisible(false);
        exit.setVisible(false);

        name.setVisible(false);
        gender1.setVisible(false);
        semester.setVisible(false);
        branch.setVisible(false);
        mobileNumber.setVisible(false);
        emailID.setVisible(false);
        password.setVisible(false);
        lMobileNumber.setVisible(false);
        lPassword.setVisible(false);

        tName.setVisible(false);
        cGender.setVisible(false);
        cBranch.setVisible(false);
        cSemester.setVisible(false);
        tMobileNumber.setVisible(false);
        tEmailID.setVisible(false);
        PPassword.setVisible(false);
        tMobileNumber2.setVisible(false);
        PPassword2.setVisible(false);

        view2.setVisible(false);
        back.setVisible(false);
        clear.setVisible(false);
        submit.setVisible(false);

//////

    }


    public void mainMenu() {


        introMainMenu.setVisible(true);

        admin.setVisible(true);
        newUser.setVisible(true);
        existingUser.setVisible(true);
        exit.setVisible(true);


        admin.addActionListener(this);
        newUser.addActionListener(this);
        existingUser.addActionListener(this);
        exit.addActionListener(this);

    }

    void adminMenu() {
        //i will add later
        back.setVisible(true);
        exit.setVisible(true);


    }

    void newUserMenu() {
        name.setVisible(true);
        gender1.setVisible(true);
        branch.setVisible(true);
        semester.setVisible(true);
        mobileNumber.setVisible(true);
        emailID.setVisible(true);
        password.setVisible(true);

        tName.setVisible(true);
        cGender.setVisible(true);
        cBranch.setVisible(true);
        cSemester.setVisible(true);
        tMobileNumber.setVisible(true);
        tEmailID.setVisible(true);
        PPassword.setVisible(true);

        back.setVisible(true);
        clear.setVisible(true);
        submit.setVisible(true);
        exit.setVisible(true);

//
        back.addActionListener(this);
        clear.addActionListener(this);
        submit.addActionListener(this);
        exit.addActionListener(this);

    }

    void existingUserMenu() {

        tMobileNumber2.setVisible(true);
        PPassword2.setVisible(true);
        lMobileNumber.setVisible(true);
        lPassword.setVisible(true);
        view2.setVisible(true);
        back.setVisible(true);
        exit.setVisible(true);

        view2.addActionListener(this);

    }

    void clearAdminUserMenu() {
        back.setVisible(false);


    }

    void clearMainMenu() {
        introMainMenu.setVisible(false);

        admin.setVisible(false);
        newUser.setVisible(false);
        existingUser.setVisible(false);
        exit.setVisible(false);
//
    }

    void clearNewUserMenu() {

        name.setVisible(false);
        gender1.setVisible(false);
        branch.setVisible(false);
        semester.setVisible(false);
        mobileNumber.setVisible(false);
        emailID.setVisible(false);
        password.setVisible(false);

        tName.setVisible(false);
        cGender.setVisible(false);
        cBranch.setVisible(false);
        cSemester.setVisible(false);
        tMobileNumber.setVisible(false);
        tEmailID.setVisible(false);
        PPassword.setVisible(false);

        tName.setText(null);
//        cGender.;
//        cBranch.();
//        cSemester.;
        tMobileNumber.setText(null);
        tEmailID.setText(null);
        PPassword.setText(null);


        back.setVisible(false);
        clear.setVisible(false);
        submit.setVisible(false);
        exit.setVisible(false);

//
    }

    void clearExistingUserMenu() {
        tMobileNumber.setText(null);
        PPassword2.setText(null);
        tMobileNumber2.setVisible(false);
        PPassword2.setVisible(false);
        lMobileNumber.setVisible(false);
        lPassword.setVisible(false);
        view2.setVisible(false);
        back.setVisible(false);
        exit.setVisible(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == admin) {
            clearMainMenu();
            adminMenu();
        } else if (e.getSource() == newUser) {
            clearMainMenu();
            newUserMenu();

        } else if (e.getSource() == existingUser) {
            clearMainMenu();
            existingUserMenu();
        } else if (e.getSource() == exit) {
            System.exit(0);
        } else if (e.getSource() == back) {
            clearAdminUserMenu();
            clearNewUserMenu();
            clearExistingUserMenu();
            mainMenu();
        } else if (e.getSource() == clear) {
            clearNewUserMenu();
            newUserMenu();
        } else if (e.getSource() == submit) {
            String sName = tName.getText();
            String sGender = cGender.getSelectedItem().toString();
            String sBranch = cBranch.getSelectedItem().toString();
            String sSemester = cSemester.getSelectedItem().toString();

            String sMobileNumber = tMobileNumber.getText();
            String sEmailId = tEmailID.getText();
            String sPassword = new String(PPassword.getPassword());

            int i = checkValue(sName, sGender, sBranch, sSemester, sMobileNumber, sEmailId, sPassword);
            if (i == 0) {
                int c = JDBC.createAccount(this,sName, sGender, sBranch, sSemester, sMobileNumber, sEmailId, sPassword);

            } else {
                ////
            }


        } else if (e.getSource() == view2) {
            String sMobileNumber2 = tMobileNumber2.getText();
            String sPassword2 = new String(PPassword2.getPassword());

            JDBC.showUserDetails(this,sMobileNumber2, sPassword2);
            tMobileNumber2.setText(null);
            PPassword2.setText(null);
        } else {
            //show warning
        }

    }


    int checkValue (String sName, String sGender, String sBranch, String sSemester, String sMobileNumber, String
            sEmailId, String sPassword){
        //required more work for this section,i will add later

        if (sMobileNumber.matches("[0-9]+") && sMobileNumber.length() == 10) {

            if (sName != null && sGender != null && sBranch != null && sSemester != null && sEmailId != null) {
                return 0;

            }
        }
        return 1;

    }


    public static void main (String[]args){
        System.out.println("hi");

    }
}
