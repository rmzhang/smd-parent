package com.zhangl.smdorder.dao;

import com.zhangl.smdorder.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderDao {

    String TABLE_NAME="smd_order";
    String SELECT_FILE="orderId,orderNo,userId,price,buyCount";

    @Select({"select" , SELECT_FILE ,"from ",TABLE_NAME,"where orderNo=#{orderNo}"})
    Order getOrderByNo(String orderNo);

    @Select({"select" , SELECT_FILE ,"from ",TABLE_NAME,"where userId=#{userId}"})
    Order getOrderByUserId(Integer userId);
}
