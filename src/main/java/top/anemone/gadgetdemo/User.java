package top.anemone.gadgetdemo;


import java.io.IOException;
import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private int age;
    private String cmd;

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name+"::"+age;
    }
    public void execute() throws IOException {
        System.out.println("Not Superuser");
    }
}
