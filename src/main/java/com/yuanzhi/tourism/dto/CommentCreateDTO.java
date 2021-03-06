package com.yuanzhi.tourism.dto;

import lombok.Data;

/**
 * @Author: yuanzhi...
 * @Date: created in  2019/10/20 12:06
 */

@Data
public class CommentCreateDTO {

    private Integer parentId;

    private String content;

    private Integer type;

    private Integer userId;

}
