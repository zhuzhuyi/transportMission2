package transport1;

public class MaritimeMeansOfTransport extends Transport {
    MaritimeMeansOfTransport(String id) {
        super(id);
    }

    //重写：水上交通工具的驾驶方法肯定都是要先下水
    public void DriveMethod(){
        System.out.println("下水");
    }

}
