public class TestPhoneDirectoryWithTreeMap {

    public static void main(String[] args) {

        PhoneDirectoryWithTreeMap directory = new PhoneDirectoryWithTreeMap();
        System.out.println("This program creates a PhoneDirectoryWithTreeMap and");
        System.out.println("adds several entries.  It then prints the contents of");
        System.out.println("directory and does a few lookups.");
        System.out.println();

        directory.putNumber("John", "123-456-7890");
        directory.putNumber("Jane", "987-654-3210");
        directory.putNumber("Jim", "098-765-4321");
        directory.putNumber("Jim", "123-456-7890");
        directory.putNumber("Jim", "123-456-7891");
        System.out.println();

        System.out.println("Contents are:");
        System.out.println();
        directory.print();

        System.out.println("Number for Jim is: " + directory.getNumber("Jim"));
        System.out.println("Number for John is: " + directory.getNumber("John"));
        System.out.println("Number for Jane is: " + directory.getNumber("Jane"));

        System.out.println("Number for Adela is: " + directory.getNumber("Adela"));
    }
}