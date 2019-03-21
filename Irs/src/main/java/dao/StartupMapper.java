package dao;

import pojo.Startup;

public interface StartupMapper {
    int deleteByPrimaryKey(Integer staid);

    int insert(Startup record);

    int insertSelective(Startup record);

    Startup selectByPrimaryKey(Integer staid);

    int updateByPrimaryKeySelective(Startup record);

    int updateByPrimaryKey(Startup record);
}