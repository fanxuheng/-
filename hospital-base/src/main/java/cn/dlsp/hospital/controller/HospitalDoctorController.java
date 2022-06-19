package cn.dlsp.hospital.controller;

import cn.dlsp.hospital.common.api.CommonPage;
import cn.dlsp.hospital.common.api.CommonResult;
import cn.dlsp.hospital.entity.HospitalDoctor;
import cn.dlsp.hospital.service.IHospitalDoctorService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * @author YuJian95  clj9509@163.com
 * @date 2020/2/4
 */

@Api(value = "医院模块", tags = "医生信息接口")
@RestController
@CrossOrigin
@RequestMapping("/hospital")
public class HospitalDoctorController {

    private static final int GIRL = 2;
    private static final int BOY = 1;


    @Resource
    private IHospitalDoctorService doctorService;


    @ApiOperation(value = "分页：通过姓名，搜索医生信息", notes = "传入 医生姓名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "医生姓名", paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "pageNum", value = "第几页", paramType = "query", dataType = "Integer",
                    required = true),
            @ApiImplicitParam(name = "pageSize", value = "页大小", paramType = "query", dataType = "Integer",
                    required = true),
    })
    @RequestMapping(value = "/doctor/list", method = RequestMethod.GET)
    public CommonResult<CommonPage<HospitalDoctor>> searchDoctor(@RequestParam(defaultValue = "")String username,
                                                                 @RequestParam Integer pageNum,
                                                                 @RequestParam Integer pageSize) {
        return CommonResult.success(CommonPage.restPage(doctorService.selectDoctorList(username, pageNum, pageSize)));
    }
}
