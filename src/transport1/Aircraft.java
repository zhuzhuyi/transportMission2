package transport1;

public class Aircraft extends AirTransport {

    Aircraft(String id) {
        super(id);
    }

    //重写：飞艇的具体驾驶方法
    public void DriveMethod(){
        System.out.println("需要飞艇驾驶员在紧急情况下人工驾驶，" +
                            "其余都是按照提前预设好的情况飞行");
    }


}
