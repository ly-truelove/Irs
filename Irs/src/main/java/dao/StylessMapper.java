package dao;

import pojo.Styless;

public interface StylessMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Styless record);

    int insertSelective(Styless record);

    Styless selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Styless record);

    int updateByPrimaryKey(Styless record);
}