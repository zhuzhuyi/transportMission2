package transport1;

public class LandTransport extends Transport {

    LandTransport(String id) {
        super(id);
    }

    //重写：陆地交通工具的驾驶方法肯定都是要先启动
    public void DriveMethod(){
        System.out.println("启动");
    }

}
