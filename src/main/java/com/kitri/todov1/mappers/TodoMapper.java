package com.kitri.todov1.mappers;

import com.kitri.todov1.dto.request.RequestTodo;
import com.kitri.todov1.dto.response.ResponseTodo;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface TodoMapper {
    ArrayList<ResponseTodo> findAll();
    ResponseTodo findById(Long id);
    void save(RequestTodo todo);
    void update(RequestTodo todo);
    void deleteById(Long id);
}
