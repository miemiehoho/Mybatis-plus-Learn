package edu.gdut.learn.core.entity;

import com.baomidou.mybatisplus.annotation.*;
import edu.gdut.learn.core.enums.AgeEnum;
import edu.gdut.learn.core.enums.StatusEnum;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "user")
public class User {
    @TableId
    private Long id;
    @TableField(value = "name", select = false)
    private String name;
    private Integer age;
    @TableField(exist = false)
    private String gender;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    @Version
    private Integer version;
    private StatusEnum status;
    //status 名字要与数据库字段名status匹配或加注解
    //@TableField(value = "status")
    //private StatusEnum statusEnum;
//    @TableLogic
    private Integer deleted;
}
