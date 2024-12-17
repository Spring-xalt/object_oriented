package Object_.inherit.ComputerInformation;

public class PC extends computer{
    private String brand;
    public PC(String cpu,int memory,int disk,String brand){
        super(cpu,memory,disk);
        this.brand=brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        System.out.println();
    }
    public String getInfo(){
        return re()+" brand="+brand;
    }
}
