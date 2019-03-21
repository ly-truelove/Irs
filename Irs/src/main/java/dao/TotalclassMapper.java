package dao;

import pojo.Totalclass;

public interface TotalclassMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Totalclass record);

    int insertSelective(Totalclass record);

    Totalclass selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Totalclass record);

    int updateByPrimaryKey(Totalclass record);
}