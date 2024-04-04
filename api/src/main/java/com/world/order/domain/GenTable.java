package com.world.order.domain;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class GenTable implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @Id
    private Long id;

    /**
     * 表名称
     */
    private String tableName;

    /**
     * 删除标记（0：正常；1：删除）
     */
    @Column(ignore = true)
    private String delFlag;
}
