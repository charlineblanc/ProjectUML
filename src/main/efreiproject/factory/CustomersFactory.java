package efreiproject.factory;

import efreiproject.domain.Customers;
import efreiproject.util.Helper;

public static class CustomersFactory {
    public static Customers createCustomers( int cus_id, String name, String surname, int pointNumber) {
        if (Helper.isNullorEmpty(name) || Helper.isNullorEmpty(surname))
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

}