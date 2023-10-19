package src;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin nhan vien:");
        System.out.println("Nhap ten nhan vien:");
        String name = scanner.nextLine();
        System.out.println("Nhap ma nhan vien:");
        String id = scanner.nextLine();
        System.out.println("Nhap so gio lam viec trong thang:");
        int time = scanner.nextInt();
        System.out.println("Nhap muc luong co ban theo gio:");
        int wage = scanner.nextInt();
        System.out.println("Nhap so gio lam them");
        int partime = scanner.nextInt();
        System.out.println("Nhap muc luong lam them theo gio:");
        int wagetime = scanner.nextInt();

        Employee employee = new Employee(name,id,time,wage,partime,wagetime);
        System.out.println(employee.toString());
    }
}
