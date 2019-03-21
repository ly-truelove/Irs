package dao;

import pojo.Terminal;

public interface TerminalMapper {
    int deleteByPrimaryKey(Integer terid);

    int insert(Terminal record);

    int insertSelective(Terminal record);

    Terminal selectByPrimaryKey(Integer terid);

    int updateByPrimaryKeySelective(Terminal record);

    int updateByPrimaryKey(Terminal record);
}