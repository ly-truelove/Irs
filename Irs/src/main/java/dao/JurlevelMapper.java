package dao;

import pojo.Jurlevel;

public interface JurlevelMapper {
    int deleteByPrimaryKey(Integer jlid);

    int insert(Jurlevel record);

    int insertSelective(Jurlevel record);

    Jurlevel selectByPrimaryKey(Integer jlid);

    int updateByPrimaryKeySelective(Jurlevel record);

    int updateByPrimaryKey(Jurlevel record);
}