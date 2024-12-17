package Object_.inherit.ComputerInformation;

public class computer {
    private String cpu;
    private int memory;
    private int disk;
    public computer(){//无参空方法体构造器
    }

    public String re(){
        return "cpu="+cpu+" memeory="+memory+" disk="+disk;
    }
    public computer(String cpu,int memory,int disk) {
        this.cpu=cpu;
        this.memory = memory;
        this.disk=disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }


    public String getCpu() {
        return cpu;
    }
    public int getMemory() {
        return memory;
    }

    public int getDisk() {
        return disk;
    }


}
