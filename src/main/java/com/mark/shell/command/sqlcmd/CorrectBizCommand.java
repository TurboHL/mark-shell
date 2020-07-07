package com.mark.shell.command.sqlcmd;

import com.mark.shell.common.SpringCommon;
import com.mark.shell.service.SqlCommandService;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.util.StringUtils;

@ShellComponent
public class CorrectBizCommand {

    @ShellMethod(key = "mysql-i",value = "insert-sql")
    public String insert(String sql) {
        if (StringUtils.isEmpty(sql)) {
            return String.format("Hi %s", "执行语句不能为空");
        }
        return String.format("影响行数： %s", SpringCommon.getBean(SqlCommandService.class).insertSql(sql));
    }

    @ShellMethod(key = "mysql-u",value = "update-sql")
    public String update(String sql) {
        if (StringUtils.isEmpty(sql)) {
            return String.format("Hi %s", "执行语句不能为空");
        }
        return String.format("影响行数： %s", SpringCommon.getBean(SqlCommandService.class).updateSql(sql));
    }

    @ShellMethod(key = "mysql-q",value = "query-sql")
    public String markQuery(String sql) {
        if (StringUtils.isEmpty(sql)) {
            return String.format("Hi %s", "执行语句不能为空");
        }
        return String.format("影响行数： %s", SpringCommon.getBean(SqlCommandService.class).querySql(sql));
    }
}
