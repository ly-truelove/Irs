package dao;

import pojo.Terminalinfo;

public interface TerminalinfoMapper {
    int deleteByPrimaryKey(Integer tiid);

    int insert(Terminalinfo record);

    int insertSelective(Terminalinfo record);

    Terminalinfo selectByPrimaryKey(Integer tiid);

    int updateByPrimaryKeySelective(Terminalinfo record);

    int updateByPrimaryKey(Terminalinfo record);
}