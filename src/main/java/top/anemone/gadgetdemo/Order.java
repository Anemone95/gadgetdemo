package top.anemone.gadgetdemo;

import java.io.IOException;
import java.io.Serializable;

public class Order implements Serializable {
    @Override
    public String toString() {
        hashCode();
        return "Order{" +
                "user=" + user +
                ", cmd='" + cmd + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        return this.hashCode()==o.hashCode();
    }

    @Override
    public int hashCode() {
        user.setCmd(cmd);
        try {
            user.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 123456;
    }

    private User user;
    private String cmd;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }
}
