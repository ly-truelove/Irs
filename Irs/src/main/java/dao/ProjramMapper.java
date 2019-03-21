package dao;

import pojo.Projram;

public interface ProjramMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Projram record);

    int insertSelective(Projram record);

    Projram selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Projram record);

    int updateByPrimaryKey(Projram record);
}