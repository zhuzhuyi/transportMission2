package transport1;

public class Transport {
    private String id;
    private int price;
    private String Brand;
    private String rout;


    Transport(String id){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRout() {
        return rout;
    }

    public void setRout(String rout) {
        this.rout = rout;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }


    //驾驶方法
    public void DriveMethod(){
        System.out.println("有驾驶员操控");
    }

}
