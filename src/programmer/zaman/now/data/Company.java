package programmer.zaman.now.data;

/**
 * Inner class
 * if the class is connected like one class cannot be created without another class
 * Example : You want to make class Employee where Company class was needed. So you can create class Employee as a inner class Company
 * <p>
 * Access Outer Class
 * The advantage of using outer class is you can access the outer class because inner class can access all private member of outer class
 * You can use keyword 'OuterClassName' + '.this'. Example : Company.this
 * if you want to access supper outer class you can use keyword super. Example : Company.super
 * <p>
 * With outer class you don't have to make the class variable to get the access of its data/method
 */
public class Company {//outer class
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Employee {//inner class
        private String name;

        public String getCompany() {//example access outer class method
            return Company.this.getName();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
