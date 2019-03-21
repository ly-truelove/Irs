package dao;

import pojo.Inform;
import pojo.InformWithBLOBs;

public interface InformMapper {
    int deleteByPrimaryKey(Integer infoid);

    int insert(InformWithBLOBs record);

    int insertSelective(InformWithBLOBs record);

    InformWithBLOBs selectByPrimaryKey(Integer infoid);

    int updateByPrimaryKeySelective(InformWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(InformWithBLOBs record);

    int updateByPrimaryKey(Inform record);
}