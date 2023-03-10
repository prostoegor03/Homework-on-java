/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework2;


public class Truck extends Auto {
    private String model;
    private String engineval; 
    private String color;
    private double cost;
    
    public Truck() {
    }

    public Truck(String model, String engineval, String color, double cost, String carbrand, String enginetype, String transmission, String country) {
        super(carbrand, enginetype, transmission, country);
        this.model = model;
        this.engineval = engineval;
        this.color = color;
        this.cost = cost;
    }
    
    public void purch(){
        System.out.println("Автомобиль находится в продаже");
}
    public void tax(double cost){
        if (cost > 3500000){
            System.out.println("Автомобиль облагется налогом на роскошь");
        }
        else{
            System.out.println("Автомобиль не облагается дополнительными нологами");
        }
    }  
    @Override
    public void go(){
        System.out.println("Автомобиль не может перемещаться в пределах МКАД");
    }
    
  // + ",Модель: " + this.model + ",Объем двигателя" + engineval + ",Цвет автомобиля:" + color + ",Стоимость:" + cost; 
      @Override
    public String toString() {
        
        String str ="Марка автомобиля:" + getCarbrand() + ",Тип двигателя:" + getEnginetype() + ",Тип коробки передач:" + getTransmission()+ ",Страна производитнль:" + getCountry()+ ",Модель: " + this.model + ",Объем двигателя" + engineval + ",Цвет автомобиля:" + color + ",Стоимость:" + cost;
        return str;   
                
    }
}
