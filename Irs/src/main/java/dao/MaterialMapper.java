package dao;

import pojo.Material;

public interface MaterialMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Material record);

    int insertSelective(Material record);

    Material selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Material record);

    int updateByPrimaryKey(Material record);
}