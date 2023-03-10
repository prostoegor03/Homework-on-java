
package com.mycompany.homework2;

public class Service {
    public void modify(Truck truck){
        String brand = truck.getCarbrand();
        brand = brand.toLowerCase();
        String newStr = brand.replaceAll("a","o");
        newStr= newStr.replaceAll("i","e");
        truck.setCarbrand(newStr);
    }
    
}
