package com.example.emoss.wx.db.dao;

import com.example.emoss.wx.db.pojo.TbHolidays;





        import com.example.emoss.wx.db.pojo.TbHolidays;
        import org.apache.ibatis.annotations.Mapper;

        import java.util.ArrayList;
        import java.util.HashMap;

@Mapper
public interface TbHolidaysDao {
    public Integer searchTodayIsHolidays();
    public ArrayList<String> searchHolidaysInRange(HashMap param);
}