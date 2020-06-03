package com.shaylee.common.datasource.dynamic.enums;

/**
 * Title: 数据源枚举类
 * Project: shaylee-common
 *
 * @author Adrian
 * @date 2020-02-20
 */
public enum DataSourceType {
    /**
     * API主库
     */
    MASTER("master"),
    /**
     * API从库
     */
    SLAVE("slave");

    private final String name;

    DataSourceType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
