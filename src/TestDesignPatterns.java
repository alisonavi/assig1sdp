public class TestDesignPatterns {
    public static void main(String[] args) {
        testAbstractFactory();
    }
    private static void testAbstractFactory() {
        //  a new PC object using the PCFactory object
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        //  a new Server object using the ServerFactory object
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        // the string representation of the PC object and the Server object to the console
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
    }
}