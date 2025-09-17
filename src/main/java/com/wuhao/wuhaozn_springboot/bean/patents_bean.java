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
@TableName("patents_table")
public class patents_bean {
    int id;
    String patents_name;
    String patents_brief;
    String patents_image;
    String patents_content;
}
