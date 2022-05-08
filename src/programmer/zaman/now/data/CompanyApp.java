package programmer.zaman.now.data;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Asus");

        Company.Employee employee = company.new Employee();
        employee.setName("Hizkia");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("Tesla");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Bokir");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
}
