package lk.ijse.dep.web.pos.business.custom;

import lk.ijse.dep.web.pos.business.SuperBO;
import lk.ijse.dep.web.pos.dto.OrderDTO;
import lk.ijse.dep.web.pos.dto.OrderDetailDTO;

import java.util.List;

public interface OrderBO extends SuperBO {

    String getNewOrderId() ;

    void placeOrder(OrderDTO order, List<OrderDetailDTO> orderDetails) ;
}
