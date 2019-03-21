package dao;

import pojo.Pinfo;

public interface PinfoMapper {
    int deleteByPrimaryKey(Integer iid);

    int insert(Pinfo record);

    int insertSelective(Pinfo record);

    Pinfo selectByPrimaryKey(Integer iid);

    int updateByPrimaryKeySelective(Pinfo record);

    int updateByPrimaryKey(Pinfo record);
}