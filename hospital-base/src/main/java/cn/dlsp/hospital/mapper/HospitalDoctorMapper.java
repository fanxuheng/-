package cn.dlsp.hospital.mapper;

import cn.dlsp.hospital.entity.HospitalDoctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface HospitalDoctorMapper {

    //    查询医院所有的医生
    List<HospitalDoctor> selectByDoctorName(@Param("username") String username);


}