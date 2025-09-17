package com.wuhao.wuhaozn_springboot.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("solution_table")
public class solution_bean {
    int id;
    String solution_name;
    String solution_brief;
    String solution_image;
    String solution_content;
}
