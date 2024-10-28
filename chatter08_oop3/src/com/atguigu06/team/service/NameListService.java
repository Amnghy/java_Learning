package com.atguigu06.team.service;

import com.atguigu06.team.domain.*;

import static com.atguigu06.team.service.Data.*;


public class NameListService {
    private Employee[] employees;

    public NameListService(){
        employees = new Employee[EMPLOYEES.length];

        for (int i = 0; i < employees.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);//员工类型
            //获取通用的属性
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            Double bonus;
            int stock;


            switch (type){
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][4]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][4]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }

        }

    }
    private Equipment createEquipment(int index){
        int equipementType = Integer.parseInt(EQUIPMENTS[index][0]);

        String modelOrName = EQUIPMENTS[index][1];
        String priceOrdisplayORtype = EQUIPMENTS[index][2];

        switch (equipementType){
            case PC:
                return new PC(modelOrName,priceOrdisplayORtype);
            case NOTEBOOK:
                Double price = Double.parseDouble(priceOrdisplayORtype);
                return new NootBook(modelOrName,price);
            case PRINTER:
                return new Printer(modelOrName,priceOrdisplayORtype);
        }
        return null;
    }



    public Employee[] getAllEmployees(){

        return employees;
    }
/*
获取指定ID的员工
 */
    public Employee getEmployee(int id)throws TeamException{
        for (int i = 0; i < employees.length; i++) {
            if(id == employees[i].getID()){
                return employees[i];
            }
            
        }
        throw new TeamException("找不到指定员工");
    }




}
