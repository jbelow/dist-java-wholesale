package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Product;
import edu.wctc.wholesale.entity.WholesaleOrder;
import edu.wctc.wholesale.exception.ResourceNotFoundException;
import edu.wctc.wholesale.repo.WholesaleOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class WholesaleOrderImpl implements WholesaleOrderService {

    @Autowired
    private WholesaleOrderRepository wholesaleOrderRepository;

    @Override
    public List<WholesaleOrder> getAllWholesaleOrders() {
        List<WholesaleOrder> list = new ArrayList<>();
        wholesaleOrderRepository.findAll().forEach(list::add);
        return list;
    }

}
