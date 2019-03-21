package dao;

import pojo.Player;

public interface PlayerMapper {
    int deleteByPrimaryKey(Integer yid);

    int insert(Player record);

    int insertSelective(Player record);

    Player selectByPrimaryKey(Integer yid);

    int updateByPrimaryKeySelective(Player record);

    int updateByPrimaryKey(Player record);
}