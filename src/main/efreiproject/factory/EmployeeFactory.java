package efreiproject.factory;

import efreiproject.domain.Employee;

public class EmployeeFactory {

    public static Employee createEmployee(int emp_id, String name, String surname, String rayon) {
        if (isEmptyOrNull(name) || isEmptyOrNull(surname) || isEmptyOrNull(rayon))
            return null;

        if (emp_id <= 0)
            return null;

        return new Employee.Builder()
                .setEmp_id(emp_id)
                .setName(name)
                .setSurname(surname)
                .setRayon(rayon)
                .build();
    }

    public static Employee createEmployee(String name, String surname, String rayon) {
        if (isEmptyOrNull(name) || isEmptyOrNull(surname) || isEmptyOrNull(rayon))
            return null;

        return new Employee.Builder()
                .setName(name)
                .setSurname(surname)
                .setRayon(rayon)
                .build();
    }

    private static boolean isEmptyOrNull(String str) {
        return str == null || str.trim().isEmpty();
    }
}