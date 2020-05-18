package transport1;

public class HotAirBalloon extends AirTransport {
    HotAirBalloon(String id) {
        super(id);
    }

    //重写驾驶方法
    public void DriveMethod(){
        System.out.println("在连接到丙烷罐的管道上打开一个简单的爆炸阀，" +
                   "丙烷放的越多，热气球就飞得越高。" +
                    "打开降落伞阀以降低气球");
    }
}
