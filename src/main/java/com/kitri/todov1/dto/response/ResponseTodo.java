package com.kitri.todov1.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ResponseTodo {
    Long id;
    String content;
    Boolean done;
    Long memberId;
    LocalDateTime createdAt;
    LocalDateTime modifiedAt;
}
