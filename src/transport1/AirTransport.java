package transport1;

public class AirTransport extends Transport {

    AirTransport(String id) {
        super(id);
    }

    //重写：空中交通工具的驾驶方法肯定都是要起飞
    public void DriveMethod(){
        System.out.println("第一步都是起飞");
    }

}
