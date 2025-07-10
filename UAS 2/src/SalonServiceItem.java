/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Difa
 */
public class SalonServiceItem {
    private String serviceName;
    private double price;
    private String serviceType;

    public SalonServiceItem(String serviceName, double price, String serviceType) {
        this.serviceName = serviceName;
        this.price = price;
        this.serviceType = serviceType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getPrice() {
        return price;
    }

    public String getServiceType() {
        return serviceType;
    }

    @Override
    public String toString() {
        return serviceName + " - Rp" + price + " (" + serviceType + ")";
    }
}