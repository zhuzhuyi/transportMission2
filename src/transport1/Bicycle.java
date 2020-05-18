package transport1;

public class Bicycle extends LandTransport {
    Bicycle(String id) {
        super(id);
    }
    //重写方法

    @Override
    public void DriveMethod() {
        System.out.println("带上安全帽"
                +"握住方向盘" +
                " 把背伸直"
                +" 蹬脚踏板");
    }
}
