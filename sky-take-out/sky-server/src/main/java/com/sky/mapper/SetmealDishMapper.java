package com.sky.mapper;

import java.util.List;

public interface SetmealDishMapper {
    /**
     * 根据菜品id查询对应的套餐id
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
    /**
     * 根据id集合批量删除菜品口味
     * @param ids
     */
    void deleteByDishIds(List<Long> ids);
}
