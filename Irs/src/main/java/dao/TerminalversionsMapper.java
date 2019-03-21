package dao;

import pojo.Terminalversions;

public interface TerminalversionsMapper {
    int deleteByPrimaryKey(Integer tvid);

    int insert(Terminalversions record);

    int insertSelective(Terminalversions record);

    Terminalversions selectByPrimaryKey(Integer tvid);

    int updateByPrimaryKeySelective(Terminalversions record);

    int updateByPrimaryKeyWithBLOBs(Terminalversions record);

    int updateByPrimaryKey(Terminalversions record);
}