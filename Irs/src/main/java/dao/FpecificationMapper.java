package dao;

import pojo.Fpecification;

public interface FpecificationMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Fpecification record);

    int insertSelective(Fpecification record);

    Fpecification selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Fpecification record);

    int updateByPrimaryKey(Fpecification record);
}