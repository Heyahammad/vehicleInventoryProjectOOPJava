
package vehicleinventory;

/**
 *
 * @author Faisal Ahammad PC
 */
public class Vehicle {
    String regNo, color, status, condition;

    public Vehicle(String regNo, String color, String status, String condition) {
        this.regNo = regNo;
        this.color = color;
        this.status = status;
        this.condition = condition;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
    
    
    
}

class Car extends Vehicle{
    private String brand, model, dom;

    public Car(String regNo, String brand, String model, String color, 
            String status, String dom, String condition) {
        super(regNo, color, status, condition);
        this.brand = brand;
        this.model = model;
        this.dom = dom;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }
    
}

class Bike extends Vehicle{
    private String brand, model, dom, cc;

    public Bike(String regNo, String brand, String model,
            String color, String status, String dom, String condition, String cc) {
        super(regNo, color, status, condition);
        this.brand = brand;
        this.model = model;
        this.dom = dom;
        this.cc = cc;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
    
    
}
