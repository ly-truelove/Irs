package dao;

import pojo.Screen;

public interface ScreenMapper {
    int deleteByPrimaryKey(Integer scrid);

    int insert(Screen record);

    int insertSelective(Screen record);

    Screen selectByPrimaryKey(Integer scrid);

    int updateByPrimaryKeySelective(Screen record);

    int updateByPrimaryKey(Screen record);
}