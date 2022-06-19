package cn.dlsp.hospital.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HospitalDoctor implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 医生编号
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "医生编号")
    private Long id;

    /**
     * 医生姓名
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "医生姓名")
    private String username;

    /**
     * 性别：1，男；2，女
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "性别：1，男；2，女")
    private Integer gender;

    /**
     * 医生职称
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "医生职称")
    private String jobTitle;

    /**
     * 医生专长
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "医生专长")
    private String specialty;

    /**
     * 所属专科
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "所属专科")
    private Long specialId;

    /**
     * 所属门诊
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "所属门诊")
    private Long outpatientId;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "更新时间")
    private Date gmtModified;



}