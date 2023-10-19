package src;

public class Employee {
    private String name;
    private String id;
    private int time;
    private int wage;
    private int partime;
    private int wagetime;
    public Employee(){}
    public Employee(String name, String id, int time, int wage, int partime, int wagetime){
        this.name = name;
        this.id = id;
        this.time = time;
        this.wage = wage;
        this.partime = partime;
        this.wagetime = wagetime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getPartime() {
        return partime;
    }

    public void setPartime(int partime) {
        this.partime = partime;
    }

    public int getWagetime() {
        return wagetime;
    }

    public void setWagetime(int wagetime) {
        this.wagetime = wagetime;
    }
    public String getEmployeeSalary() {
        int basicSalary = getTime() * getWage();
        int overtimePay = getWagetime() * getPartime();
        int totalSalar = basicSalary + overtimePay;
        return "Lương cơ bản: $" + basicSalary + "\n" +
                "Lương làm thêm: $" + overtimePay + "\n" +
                "Tổng lương: $" + totalSalar ;


    }
    @Override
    public String toString(){
        return  "Thong tin nhan vien:" + "\n" +
                "Tên: " + getName() + "\n" +
                "Mã nhân viên: " + getId() + "\n" +
                getEmployeeSalary();
    }
}
