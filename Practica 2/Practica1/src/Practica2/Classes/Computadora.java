package Practica2.Classes;

public class Computadora {
    private String cpu; 
    private String gpu;
    private int ram;
    private int fuenteDePoder;
    private int hdd;

    public Computadora(){
        this.cpu = "";
        this.gpu = "";
        this.ram = 0;
        this.fuenteDePoder = 0;
        this.hdd = 0;
    }

    public Computadora(String cpu, String gpu, int ram, int fuenteDePoder, int hdd){
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.fuenteDePoder = fuenteDePoder;
        this.hdd = hdd;
    }

    public String getCpu(){
        return cpu;
    }

    public void setCpu(String cpu){
        this.cpu = cpu;
    }

    public String getGpu(){
        return gpu;
    }

    public void setGpu(String gpu){
        this.gpu = gpu;
    }

    public int getRam(){
        return ram;
    }

    public void setRam(int ram){
        this.ram = ram;
    }

    public int getFuenteDePoder(){
        return fuenteDePoder;
    }

    public void setFuenteDePoder(int fuenteDePoder){
        this.fuenteDePoder = fuenteDePoder;
    }

    public int getHdd(){
        return hdd;
    }

    public void setHdd(int hdd){
        this.hdd = hdd;
    }
}
