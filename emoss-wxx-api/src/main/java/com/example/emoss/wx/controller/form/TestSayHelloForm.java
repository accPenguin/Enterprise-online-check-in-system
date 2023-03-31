package com.example.emoss.wx.controller.form;
//测试含参数的swagger


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@ApiModel
@Data
public class TestSayHelloForm {
    @NotBlank
    @Pattern(regexp = "^[\\u4e00-\\u9fa5]{2,15}$",message = "不符合正则表达式")
    @ApiModelProperty("姓名")
    private String name;
}
