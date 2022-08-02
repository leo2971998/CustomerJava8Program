import Classes.*;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;
import java.time.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        char choice = 'Y';
        CustomerBO CBO = new CustomerBO();
        do {
            Customer C = new Customer();
            Address A = new Address();
            System.out.println("Enter the customer ID:");
            C.setCustomerID(sc.nextInt());
            sc.nextLine();
            System.out.println("Enter the customer name:");
            C.setCustomerName(sc.nextLine());
            System.out.println("Enter the customer type(Premium/Guest):");
            C.setCustomerType(sc.nextLine());
            System.out.println("Enter the customer mobile phone:");
            C.setMobile(sc.nextLine());
            System.out.println("Enter the house number: ");
            A.sethNo(sc.nextLine());
            System.out.println("Enter the street name: ");
            A.setStreet(sc.nextLine());
            System.out.println("Enter the city: ");
            A.setCity(sc.nextLine());
            System.out.println("Enter the zipcode: ");
            A.setZipcode(sc.nextLine());
            System.out.println("Enter the country: ");
            A.setCountry(sc.nextLine());
            C.setPernamentAddress(A);
            System.out.println("Enter the date created: ");
            C.setDateofCreation(LocalDate.parse(sc.nextLine(), formatter));
            CBO.AddCustomer(C);
            System.out.println("Enter the choice(Y/N): ");
            choice = sc.nextLine().charAt(0);
        } while (choice != 'N');
        System.out.println(String.format("%15s %15s %15s %15s %15s %15s %15s %15s %15s %15s",
                "Customer ID", "Customer Name", "Customer Type", "Mobile", "StreetNo", "Street", "City", "Zip Code",
                "Country", "Date of Creation"));
        CBO.getCustomers().stream().forEach(T -> System.out.println(String.format("%15s %15s %15s %15s %15s %15s %15s %15s %15s %15s", T.getCustomerID(),
                T.getCustomerName(), T.getCustomerType(), T.getMobile(), T.getPernamentAddress().gethNo(),
                T.getPernamentAddress().getStreet(), T.getPernamentAddress().getCity(), T.getPernamentAddress().getZipcode(), T.getPernamentAddress().getCountry(),
                T.getDateofCreation().format(formatter))));
    }
}