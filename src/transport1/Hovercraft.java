package transport1;

public class Hovercraft extends MaritimeMeansOfTransport {
    Hovercraft(String id) {
        super(id);
    }
    //重写驾驶方法

    @Override
    public void DriveMethod() {
        System.out.println("穿好救生衣；解开固定的绳子；拉动发动机，可控制挡位;" +
                "掌舵控制方向；关闭发动机即停止");
    }
}
