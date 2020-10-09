package lk.ijse.dep.web.pos.repository;

import lk.ijse.dep.web.pos.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,String> {

    Customer getFirstLastCustomerIdByOrderByIdDesc() ;

//    List<Customer> findAllCustomersByOrderByName() ;
//
//    List<Customer> readAllCustomersByAddressLike(String query) ;
//
//    long countAllCustomersByNameStartingWithAndAddressStartingWith(String name, String address) ;

    //@Query(value = "SELECT * FROM Customer c WHERE c.name LIKE ?1%", nativeQuery = true)
//    @Query(value = "SELECT c FROM Customer c WHERE c.name LIKE ?1%")
//    List<Customer> findCustomers1(String name);
//
//    List<String> getCustomersViaNamedQuery() ;
//
//    List<String> getCustomersViaNamedNativeQuery() ;

}
