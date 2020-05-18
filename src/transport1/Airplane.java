package transport1;

public class Airplane extends AirTransport {
    Airplane(String id) {
        super(id);
    }

    //重写驾驶方法
    public void DriveMethod(){
        System.out.println("专业的飞行驾驶员，通过控制油门、脚蹬、操纵杆驾驶");
    }


}
