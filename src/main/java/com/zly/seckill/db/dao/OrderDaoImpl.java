package com.zly.seckill.db.dao;

import com.zly.seckill.db.mappers.OrderMapper;
import com.zly.seckill.db.po.Order;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;

@Repository
public class OrderDaoImpl implements OrderDao{
    @Resource
    private OrderMapper orderMapper;

    @Override
    public void insertOrder(Order order) {
        orderMapper.insert(order);

    }

    @Override
    public Order queryOrder(String orderNo) {
        return orderMapper.selectByOrderNo(orderNo);
    }

    @Override
    public void updateOrder(Order order) {
        orderMapper.updateByPrimaryKey(order);
    }
}
