package top.anemone.gadgetdemo;

import java.io.IOException;

public class SuperUser extends User{
    public void execute() throws IOException {
        Runtime.getRuntime().exec(this.getCmd());
    }
}
