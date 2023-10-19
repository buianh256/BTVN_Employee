package src;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    @Test
    public void testBasicSalary(){
        String name = "John Doe";
        String id = "12345";
        int time = 160;
        int wage = 10;
        int partime = 20;
        int wagetime = 15;
        Employee employee = new Employee(name, id, time, wage, partime, wagetime);
        String expected = "Thong tin nhan vien:\n" +
                "Tên: John Doe\n" +
                "Mã nhân viên: 12345\n" +
                "Lương cơ bản: $1600\n" +
                "Lương làm thêm: $300\n" +
                "Tổng lương: $1900";
        String actual = employee.toString();
        assertEquals(expected, actual);
    }
    @Test
    public void test1BasicSalary(){
        String name = "Duc Anh";
        String id = "MSV256";
        int time = 200;
        int wage = 30;
        int partime = 0;
        int wagetime = 15;
        Employee employee = new Employee(name, id, time, wage, partime, wagetime);
        String expected = "Thong tin nhan vien:\n" +
                "Tên: Duc Anh\n" +
                "Mã nhân viên: MSV256\n" +
                "Lương cơ bản: $6000\n" +
                "Lương làm thêm: $0\n" +
                "Tổng lương: $6000";
        String actual = employee.toString();
        assertEquals(expected, actual);
    }
}
