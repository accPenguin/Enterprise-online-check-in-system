package com.example.emoss.wx.db.dao;







        import com.example.emoss.wx.db.pojo.TbFaceModel;
        import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbFaceModelDao {
    public String searchFaceModel(int userId);
    public void insert(TbFaceModel faceModel);
    public int deleteFaceModel(int userId);
}