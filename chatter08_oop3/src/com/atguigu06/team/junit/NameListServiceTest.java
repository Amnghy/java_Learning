package com.atguigu06.team.junit;

import com.atguigu06.team.domain.Employee;
import com.atguigu06.team.service.NameListService;
import com.atguigu06.team.service.TeamException;
import org.junit.Test;

public class NameListServiceTest {
    @Test
    public void testGetAllemployees(){
        NameListService nameListService = new NameListService();
        Employee[] employees = nameListService.getAllEmployees();
//        System.out.println("≤‚ ‘Œƒ±æutf-8");
//        System.out.println(employees[0]);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    @Test
    public void testGetempolyees(){
        try {
            NameListService nameListService = new NameListService();
            Employee employees = nameListService.getEmployee(13);
            System.out.println(employees);
        }catch (TeamException e){
            System.out.println(e.getMessage());
        }
    }
}
