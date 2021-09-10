import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstDoubleRoomGuest1 = scanner.next();
        String firstDoubleRoomGuest2 = scanner.next();
        // String nextRoom1 = scanner.nextLine();
        String singleRoomGuest = scanner.next();
        // String nextRoom2 = scanner.nextLine();
        String familyRoomGuest1 = scanner.next();
        String familyRoomGuest2 = scanner.next();
        String familyRoomGuest3 = scanner.next();
        // String nextRoom3 = scanner.nextLine();
        String secondDoubleRoomGuest1 = scanner.next();
        String secondDoubleRoomGuest2 = scanner.next();
        System.out.println(secondDoubleRoomGuest2);
        System.out.println(secondDoubleRoomGuest1);
        System.out.println(familyRoomGuest3);
        System.out.println(familyRoomGuest2);
        System.out.println(familyRoomGuest1);
        System.out.println(singleRoomGuest);
        System.out.println(firstDoubleRoomGuest2);
        System.out.println(firstDoubleRoomGuest1);
    }
}