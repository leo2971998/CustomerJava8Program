package Classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerBO {
    private static List<Customer> CList = new ArrayList<Customer>();

    private static boolean Validate(Customer customer) {
        if (customer.getDateofCreation().compareTo(LocalDate.now()) > 0) {
            return false;
        }
        if (!(customer.getCustomerType().toUpperCase().equals("PREMIUM") || (customer.getCustomerType().toUpperCase().equals("GUEST")))) {
            return false;
        }
        if (!customer.getPernamentAddress().getZipcode().matches("^\\d{5}$")) {
            return false;
        }
        return true;
    }
    public static void AddCustomer(Customer customer) {
        if (Validate(customer)) {
            CList.add(customer);
        }
    }
    public static List<Customer>getCustomers() {
        return CList.stream().sorted(Comparator.comparing(Customer::getDateofCreation)).collect(Collectors.toList());
    }
}
