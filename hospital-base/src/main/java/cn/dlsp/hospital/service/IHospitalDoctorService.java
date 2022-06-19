package cn.dlsp.hospital.service;


import cn.dlsp.hospital.entity.HospitalDoctor;

import java.util.List;


/**
 * @author YuJian95  clj9509@163.com
 * @date 2020/2/4
 */

public interface IHospitalDoctorService {
    /**
     * 查询医生所有信息
     *
     * @param username     医生名称
     * @param pageNum  第几页
     * @param pageSize 页大小
     * @return 医生信息列表
     */
    List<HospitalDoctor> selectDoctorList(String username, Integer pageNum, Integer pageSize);

}
