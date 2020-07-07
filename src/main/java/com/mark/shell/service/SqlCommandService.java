package com.mark.shell.service;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class SqlCommandService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int updateSql(String sql){
        log.info("sql={}",sql);
        return jdbcTemplate.update(sql);
    }

    public int insertSql(String sql){
        log.info("sql={}",sql);
        return jdbcTemplate.update(sql);
    }

    public String querySql(String sql){
        log.info("sql={}",sql);
        List list = jdbcTemplate.queryForList(sql);
        for (int i = 0; i < list.size(); i++) {
            log.info("条目-[{}],data={}",(0+1), JSON.toJSON(list.get(i)));
        }
        return String.valueOf(list.size());
    }
}
