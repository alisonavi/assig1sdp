public class ServerFactory implements ComputerAbstractFactory {
    // just geetting all of this like in PC.JAVA
    private String ram;
    private String hdd;
    private String cpu;

    // just a construcotr for computer chararectisctics

    public ServerFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }
}