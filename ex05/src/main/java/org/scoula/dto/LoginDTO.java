package org.scoula.dto;

public class LoginDTO {
    public LoginDTO(String name, String passwd) {
        this.name=name;
        this.passwd=passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }

    private String name;
    private String passwd;


}