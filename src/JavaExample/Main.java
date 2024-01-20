package JavaExample;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Снежинск", "Забабахина", 64);
        Address address2 = address1;
//        address1.hashCode();
        if (address1.equals(address2)) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }
        System.out.println(address1.hashCode());
        System.out.println(address2.hashCode());
    }
}


