import java.io.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class AccountManager {

    private ArrayList<Landlord> l = new ArrayList<>();
    private ArrayList<Student> s = new ArrayList<>();

    public static int flag = 0;

    public static AccountManager instance;

    private AccountManager() throws IOException {
        isCalledOnce();
    }

    void isCalledOnce() throws IOException {
        int ch;
        FileReader fa = new FileReader("database/land.txt");
        BufferedReader br = new BufferedReader(fa);
        int c = 0;
        char s;
        String name = "";
        String email = "";
        String password = "";
        String phone = "";
        String idproof = "";
        String temp = "";
        while (temp != null) {
            name = "";
            email = "";
            password = "";
            phone = "";
            idproof = "";
            c = 0;
            temp = br.readLine();
            if (temp != null) {
                for (int i = 0; i < temp.length(); i++) {
                    ch = temp.charAt(i);
                    if ((char) ch == ',') {
                        c++;
                        continue;
                    }
                    if (c == 0) {
                        name = name + (char) ch;
                    }
                    if (c == 1) {
                        email = email + (char) ch;
                    }
                    if (c == 2) {
                        password = password + (char) ch;
                    }
                    if (c == 3) {
                        phone = phone + (char) ch;
                    }
                    if (c == 4) {
                        idproof = idproof + (char) ch;
                    }

                }
                Landlord land = new Landlord(name, email, password, phone);
                land.setLandlordID(Integer.parseInt(idproof));
                this.l.add(land);
            }

        }
        temp = "";
        FileReader da = new FileReader("database/stud.txt");
        BufferedReader dbr = new BufferedReader(da);
        while (temp != null) {
            name = "";
            email = "";
            password = "";
            phone = "";
            idproof = "";
            c = 0;
            temp = dbr.readLine();
            if (temp != null) {
                for (int i = 0; i < temp.length(); i++) {
                    ch = temp.charAt(i);
                      if ((char) ch == ',') {
                        c++;
                        continue;
                    }
                    if (c == 0) {
                        name = name + (char) ch;
                    }
                    if (c == 1) {
                        email = email + (char) ch;
                    }
                    if (c == 2) {
                        password = password + (char) ch;
                    }
                    if (c == 3) {
                        phone = phone + (char) ch;
                    }
                    if (c == 4) {
                        idproof = idproof + (char) ch;
                    }

                }
                Student st = new Student(name, email, password, phone);
                st.setStudentID(Integer.parseInt(idproof));

            }

        }
        flag = 1;
    }

    void writeInLandFile(Landlord obj) throws IOException {
        FileWriter fw = new FileWriter("database/land.txt", true);
        BufferedWriter bf = new BufferedWriter(fw);
        bf.write(obj.getName() + "," + obj.getEmail() + "," + obj.getPassword() + "," + obj.getPhone() + "," 
                 + obj.getidproof() + "\n");
        bf.close();
    }

    void writeInStudFile(Student obj) throws IOException {
        FileWriter fw = new FileWriter("database/stud.txt", true);
        BufferedWriter bf = new BufferedWriter(fw);
        bf.write(obj.getName() + "," + obj.getEmail() + "," + obj.getPassword() + "," + obj.getPhone() + "," 
                 + obj.getidproof() + "\n");
        bf.close();
    }

    public static AccountManager getInstance() throws IOException {
        if (instance == null) {
            instance = new AccountManager();
        }
        return instance;
    }

    void createAccount(Landlord obj) throws IOException {
        l.add(obj);
        writeInLandFile(obj);
    }

    void createAccount(Student obj) throws IOException {
        s.add(obj);
        writeInStudFile(obj);

    }

    Landlord displayAccount(int landid) {
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getidproof() == idproof) {
                System.out.println("Name=" + l.get(i).getName());
                System.out.println("Email=" + l.get(i).getEmail());
                System.out.println("Phone Number=" + l.get(i).getPhone());
                System.out.println("Landlord ID=" + l.get(i).getidproof());
                return l.get(i);
            }
        }
        System.out.println("Landlord does not exist in our database");
        return null;
    }

    Student displayAccount(int studid) {
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).getidproof() == idproof) {
                System.out.println("Name=" + s.get(i).getName());
                System.out.println("Email=" + s.get(i).getEmail());
                System.out.println("Phone Number=" + s.get(i).getPhone());
                System.out.println("Student ID=" + s.get(i).getidproof());
                return s.get(i);
            }
        }
        System.out.println("Landlord does not exist in our database");
        return null;
    }

    public static void main(String[] args) throws IOException {
        AccountManager obj = getInstance();
        obj.displayAccount(2);
    }

}