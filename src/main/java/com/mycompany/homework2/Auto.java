/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework2;


public class Auto {
private String carbrand;
private String enginetype;
private String transmission;
private String country;


    public Auto() {
    }

    public Auto(String carbrand, String enginetype, String transmission, String country) {
        this.carbrand = carbrand;
        this.enginetype = enginetype;
        this.transmission = transmission;
        this.country = country;
        
    }
    
    public void go(){
        System.out.println("Автомобиль на ходу");            
}
    public void repair(){
        System.out.println("Автомобиль не требует ремонта");
}
    public void fuel(){
        System.out.println("Бак автомобиля полон");
}

   @Override
    public String toString() {
        
        String str ="Марка автомобиля:" + this.carbrand + ",Тип двигателя:" + this.enginetype + ",Тип коробки передач:" + this.transmission + ",Страна производитнль:" + this.country;
        return str;
                
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public void setModel(String enginetype) {
        this.enginetype = enginetype;
    }

    public void setRelease(String transmission) {
        this.transmission = transmission;
    }

    public void setColour(String colour) {
        this.country = country;
    }

    public String getCarbrand() {
        return carbrand;
    }

    public String getEnginetype() {
        return enginetype;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getCountry() {
        return country;
    }
   
}
