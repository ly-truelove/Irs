package dao;

import pojo.Mclassify;

public interface MclassifyMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Mclassify record);

    int insertSelective(Mclassify record);

    Mclassify selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Mclassify record);

    int updateByPrimaryKey(Mclassify record);
}