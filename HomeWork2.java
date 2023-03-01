/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.homework2;

import java.util.Scanner;


public class HomeWork2 {

    public static void main(String[] args) {
        
    //Подрузамевается, что эта информация заносится в какуюто базу, поэтому в качестве объектов выступают Фамилии владельцев
        Scanner inobj = new Scanner(System.in);
        System.out.print("Введите фамилию владельца: ");
        String odject = inobj.nextLine();
        
        Scanner inbrand = new Scanner(System.in);
        System.out.print("Введите марку автомобиля: ");
        String brand = inbrand.nextLine();
        
        Scanner inenj = new Scanner(System.in);
        System.out.print("Введите тип двигателя(бензиновый,диельный...): ");
        String enginetype = inenj.nextLine();
        
        Scanner intrans = new Scanner(System.in);
        System.out.print("Введите тип коробки передач: ");
        String transmission = intrans.nextLine();
        
        Scanner incount = new Scanner(System.in);
        System.out.print("Введите страну производителя: ");
        String country = incount.nextLine();
        
        Scanner inmodel = new Scanner(System.in);
        System.out.print("Введите модель автомобиля: ");
        String model = inmodel.nextLine();
        
        Scanner inengineval = new Scanner(System.in);
        System.out.print("Введите объем двигателя: ");
        String engineval = inengineval.nextLine();
        
        Scanner incol = new Scanner(System.in);
        System.out.print("Введите цвет автомобиля: ");
        String colour = incol.nextLine();
        
        Scanner incost = new Scanner(System.in);
        System.out.print("Введите стоимость: ");
        double cost = incost.nextDouble();
        
       Truck object = new Truck(model, engineval, colour,cost,brand,enginetype, transmission,country);
       
       System.out.println("");
       System.out.println(object.toString());
       
       System.out.println("");
       System.out.println("Работу выполнил:Макриков Егор, Обучающтйся РИБО-02-21");
       System.out.println("Вариант №1");
    }
}
