package codewars;

import java.util.Scanner;

public class IPAddressCounter {

    public static int ipToInt(String ip) {
        String[] parts = ip.split("\\.");
        return (Integer.parseInt(parts[0]) << 24) |
                (Integer.parseInt(parts[1]) << 16) |
                (Integer.parseInt(parts[2]) << 8) |
                Integer.parseInt(parts[3]);
    }

    public static int countIPs(String startIp, String endIp) {
        int startInt = ipToInt(startIp);
        int endInt = ipToInt(endIp);
        return endInt - startInt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальный IP-адрес: ");
        String startIp = scanner.nextLine();

        System.out.print("Введите конечный IP-адрес: ");
        String endIp = scanner.nextLine();

        int result = countIPs(startIp, endIp);
        System.out.println("Количество IP-адресов между " + startIp + " и " + endIp +
                " (включая первый, исключая последний): " + result);

        scanner.close();
    }
}
