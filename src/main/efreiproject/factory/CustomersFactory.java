package efreiproject.factory;

import efreiproject.domain.Customers;

public static class CustomersFactory {
    public static Customers createCustomers( int cus_id, String name, String surname, int pointNumber) {
        if (isEmptyOrNull(name) || isEmptyOrNull(surname))
            return null;

        if (cus_id <= 0)
            return null;

        return new Customers.Builder()
                .setCus_id(cus_id)
                .setName(name)
                .setSurname(surname)
                .setPointNumber(pointNumber)
                .build();
    }
    public static Customers createCustomers( String name, String surname, int pointNumber) {
        if (isEmptyOrNull(name) || isEmptyOrNull(surname))
            return null;

        return new Customers.Builder()
                .setName(name)
                .setSurname(surname)
                .setPointNumber(pointNumber)
                .build();
    }

    private static boolean isEmptyOrNull(String str) {
        return str == null || str.trim().isEmpty();
    }
}