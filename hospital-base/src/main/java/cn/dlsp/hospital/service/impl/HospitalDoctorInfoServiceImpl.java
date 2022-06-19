package cn.dlsp.hospital.service.impl;

import cn.dlsp.hospital.entity.HospitalDoctor;
import cn.dlsp.hospital.mapper.HospitalDoctorMapper;
import cn.dlsp.hospital.service.IHospitalDoctorService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author YuJian95  clj9509@163.com
 * @date 2020/2/4
 */
@Service
public class HospitalDoctorInfoServiceImpl implements IHospitalDoctorService {

    @Resource
    private HospitalDoctorMapper doctorInfoMapper;


    /**
     * 查找医生信息列表
     *
     * @param username         医生名称
     * @param pageNum      第几页
     * @param pageSize     页大小
     * @return 医生信息列表
     */
    @Override
    public List<HospitalDoctor> selectDoctorList(String username,  Integer pageNum, Integer pageSize) {

        PageHelper.startPage(pageNum, pageSize);

        return doctorInfoMapper.selectByDoctorName(username);

    }

}
