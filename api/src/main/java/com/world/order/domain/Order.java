package com.world.order.domain;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import com.mybatisflex.core.keygen.KeyGenerators;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author SWUST
 */
@Data
@Table("t_order")
public class Order implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @Id(keyType = KeyType.Generator, value = KeyGenerators.snowFlakeId)
    private Long id;

    /**
     * 订单
     */
    private String orderNo;

    /**
     * 用户
     */
    private Long userId;

    /**
     * 数量
     */
    private BigDecimal amount;

    /**
     * 删除标记（0：正常；1：删除）
     */
    @Column(ignore = true)
    private String delFlag;

}
