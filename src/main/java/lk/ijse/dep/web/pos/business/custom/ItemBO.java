package lk.ijse.dep.web.pos.business.custom;

import lk.ijse.dep.web.pos.business.SuperBO;
import lk.ijse.dep.web.pos.dto.ItemDTO;

import java.util.List;

public interface ItemBO extends SuperBO {

    public String getNewItemCode();

    public List<ItemDTO> getAllItems();

    public void saveItem(String code, String description, int qtyOnHand, double unitPrice);

    public void deleteItem(String itemCode);

    public void updateItem(String description, int qtyOnHand, double unitPrice, String itemCode) ;
}
