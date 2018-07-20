package com.practice.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/**
 *
 */

/**
 * @author aswini
 *
 */
public class EmployeeSorter {

    private static Employee[] employees;
    private static ComparatorSort[] compEmployees;

    public EmployeeSorter(int size) {
        this.employees = new Employee[size];

    }
    
//    public EmployeeSorter(int size) {
//        this.compEmployees = new ComparatorSort[size];
//
//    }

    private static void sort(Employee[] obj){

        Comparator<Employee> comparator = new Comparator<Employee>() {

            public int compare(Employee o1, Employee o2) {
                return o2.getEmpNo()>o1.getEmpNo()? 1 : -1;
            }
        };

        Collections.sort(Arrays.asList(obj), comparator);
        for (Employee employee : obj) {
            System.out.println(employee.getEmpNo());
        }


    }

    private static void insertsionSort(){

        for (int i = 0; i < employees.length; i++) {
            Employee current = employees[i];
            int j = i-1;
            while (j >=0 && employees[j].getEmpNo() >= current.getEmpNo()) {
                employees[j+1] = employees[j];
                j--;
            }
            employees[j+1] = current;
        }
        
        for(int i=0; i< employees.length; i++) {
        	System.out.println(employees[i].getEmpNo());
        }
        
    }
    /**
     * @param args
     */
    public static void main(String[] args) {

///************************    	Insertion sort
		Employee o1 = new Employee();
        Employee o2 = new Employee();
        Employee o3 = new Employee();
        Employee o4 = new Employee();
        o4.setEmpNo(1213);
        o1.setEmpNo(567567);
        o2.setEmpNo(4655467);
        o3.setEmpNo(1213);

        //Employee[] obj = new Employee[]{o1,o2,o3};
        EmployeeSorter sorter = new EmployeeSorter(4);
        sorter.employees[0]=o1;
        sorter.employees[1]=o2;
        sorter.employees[2]=o3;
        sorter.employees[3]=o4;
        sorter.insertsionSort();
//        sorter.sort(employees);

        
    	
///************************    	Comparator
/*		ComparatorSort o1 = new ComparatorSort();
        ComparatorSort o2 = new ComparatorSort();
        ComparatorSort o3 = new ComparatorSort();
        ComparatorSort o4 = new ComparatorSort();
        o4.setEmpNo(1213);
        o1.setEmpNo(567567);
        o2.setEmpNo(4655467);
        o3.setEmpNo(1213);
        
        ArrayList<ComparatorSort> arraylist = new ArrayList<ComparatorSort>();
        arraylist.add(o1);
        arraylist.add(o2);
        arraylist.add(o3);
        arraylist.add(o4);
        
        Collections.sort(arraylist, ComparatorSort.empNoComparator);
        
        for(ComparatorSort emp : arraylist) {
        	System.out.println(emp.getEmpNo());
        }
        System.out.println("*******");
*/
        
        
///************************    	Comparable        
/*		ComparableSort o1 = new ComparableSort();
    	ComparableSort o2 = new ComparableSort();
    	ComparableSort o3 = new ComparableSort();
    	ComparableSort o4 = new ComparableSort();
        o4.setEmpNo(1213);
        o1.setEmpNo(567567);
        o2.setEmpNo(4655467);
        o3.setEmpNo(1213);
        
        ArrayList<ComparableSort> arraylist = new ArrayList<ComparableSort>();
        arraylist.add(o1);
        arraylist.add(o2);
        arraylist.add(o3);
        arraylist.add(o4);
        
        Collections.sort(arraylist);
        
        for(ComparableSort emp : arraylist) {
        	System.out.println(emp.getEmpNo());
        }
        System.out.println("*******");*/
        
        
        

    }

}