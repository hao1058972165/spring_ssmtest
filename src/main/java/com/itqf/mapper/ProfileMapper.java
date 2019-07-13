package com.itqf.mapper;

import com.itqf.pojo.Profile;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ProfileMapper {
    List<Profile> queryProfile();
    Profile querySimple(int id);
    int  updateProfile(Profile profile);
    int  deleteProfile(int id);
    List<Profile> queryProfile2(int uid);
}
