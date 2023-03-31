package com.example.emoss.wx.db.dao;
//手动配置的dao，这里面都是自己定义的方法。
import com.example.emoss.wx.db.pojo.TbUser;

//public interface TbUserDao {
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(TbUser record);
//
//    int insertSelective(TbUser record);
//
//    TbUser selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(TbUser record);
//
//    int updateByPrimaryKey(TbUser record);
//}



        import com.example.emoss.wx.db.pojo.TbUser;
        import org.apache.ibatis.annotations.Mapper;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Set;

@Mapper
public interface TbUserDao {
    public boolean haveRootUser();

    public int insert(HashMap param);

    public Integer searchIdByOpenId(String openId);

    public Set<String> searchUserPermissions(int userId);

    public TbUser searchById(int userId);

    public HashMap searchNameAndDept(int userId);

    public String searchUserHiredate(int userId);

    public HashMap searchUserSummary(int userId);

    public ArrayList<HashMap> searchUserGroupByDept(String keyword);

    public ArrayList<HashMap> searchMembers(List param);

    public HashMap searchUserInfo(int userId);

    public int searchDeptManagerId(int id);

    public int searchGmId();

    public List<HashMap> selectUserPhotoAndName(List param);

    public String searchMemberEmail(int id);
}