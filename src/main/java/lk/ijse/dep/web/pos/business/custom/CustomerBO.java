package lk.ijse.dep.web.pos.business.custom;

import lk.ijse.dep.web.pos.business.SuperBO;
import lk.ijse.dep.web.pos.dto.CustomerDTO;

import java.util.List;

public interface CustomerBO extends SuperBO {

    List<CustomerDTO> getAllCustomers() ;

    CustomerDTO getCustomer(String id) ;

    void saveCustomer(String id, String name, String address) ;

    void deleteCustomer(String customerId) ;

    void updateCustomer(String name, String address, String customerId) ;

    String getNewCustomerId() ;

    boolean existsCustomer(String id);
}
