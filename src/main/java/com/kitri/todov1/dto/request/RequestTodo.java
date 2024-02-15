package com.kitri.todov1.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestTodo {
    String id;
    String content;
    Boolean done;
}
