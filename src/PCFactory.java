public class PCFactory implements ComputerAbstractFactory {
    private String ram;
    // creating a new 3 strings for storing computers characteristcs
    private String hdd;
    private String cpu;

    // just a constructor that taking 3 properties and returning value
    public PCFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    // overriding methods to returning values
    @Override
    public Computer createComputer() {
        return new PC(ram,hdd,cpu);
    }
}