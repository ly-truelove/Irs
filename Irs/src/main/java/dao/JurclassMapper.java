package dao;

import pojo.Jurclass;

public interface JurclassMapper {
    int deleteByPrimaryKey(Integer jcid);

    int insert(Jurclass record);

    int insertSelective(Jurclass record);

    Jurclass selectByPrimaryKey(Integer jcid);

    int updateByPrimaryKeySelective(Jurclass record);

    int updateByPrimaryKey(Jurclass record);
}