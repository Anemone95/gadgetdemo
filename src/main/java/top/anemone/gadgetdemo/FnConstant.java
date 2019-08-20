package top.anemone.gadgetdemo;

public class FnConstant {
    private User value;
    public Object invoke(Order arg){
        return arg!=null? arg: value;
    }
}
