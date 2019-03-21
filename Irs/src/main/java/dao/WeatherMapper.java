package dao;

import pojo.Weather;

public interface WeatherMapper {
    int deleteByPrimaryKey(Integer wid);

    int insert(Weather record);

    int insertSelective(Weather record);

    Weather selectByPrimaryKey(Integer wid);

    int updateByPrimaryKeySelective(Weather record);

    int updateByPrimaryKey(Weather record);
}