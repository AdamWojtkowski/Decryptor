package com.company;

public class User {

    private String fName;
    private String lName;
    private String eMAil;
    private String passWord;

    public User (String fName, String lName, String eMAil, String passWord){
        this.fName = fName;
        this.lName = lName;
        this.eMAil = eMAil;
        this.passWord = passWord;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String geteMAil() {
        return eMAil;
    }

    public void seteMAil(String eMAil) {
        this.eMAil = eMAil;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String password) {
        this.passWord = password;
    }

    @Override
    public String toString() {
        return "Student{" + "fName=" + fName + ", lName=" + lName + ", email=" + eMAil + ", Password=" + passWord + '}';
    }
}
