package dao;

import pojo.Systempar;

public interface SystemparMapper {
    int deleteByPrimaryKey(Integer spid);

    int insert(Systempar record);

    int insertSelective(Systempar record);

    Systempar selectByPrimaryKey(Integer spid);

    int updateByPrimaryKeySelective(Systempar record);

    int updateByPrimaryKey(Systempar record);
}