package transport1;

public class Ship extends MaritimeMeansOfTransport {

    Ship(String id) {
        super(id);
    }

    //重写驾驶方法
    @Override
    public void DriveMethod() {
        System.out.println("检查一切的仪器是否正常；按按钮启动发动专职" +
                "若顺风可打开船帆" +
                "掌舵控制方向；关闭发动机即停止");
    }

}
