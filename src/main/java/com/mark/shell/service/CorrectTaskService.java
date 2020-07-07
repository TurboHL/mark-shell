package com.mark.shell.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CorrectTaskService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Integer countTask(){
      return jdbcTemplate.queryForList(" select * from correct_question_task ").size();
    }
}
