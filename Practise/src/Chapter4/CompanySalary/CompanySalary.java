package Chapter4.CompanySalary;

public class CompanySalary {
    public static void main(String args[]) {
        Employee[] employee = new Employee[29];
        for (int i = 0; i < employee.length; i++) {
            if (i % 3 == 0)
                employee[i] = new WeekWorkers();
            else if (i % 3 == 1)
                employee[i] = new MonthWorkers();
            else if (i % 3 == 2)
                employee[i] = new YearWorkers();
        }
        Company company = new Company(employee);
        System.out.println("公司总薪水：" + company.salariesPay() + "元");
    }

}
