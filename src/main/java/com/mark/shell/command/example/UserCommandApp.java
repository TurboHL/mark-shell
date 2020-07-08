package com.mark.shell.command.example;

import com.alibaba.fastjson.JSON;
import com.mysql.cj.xdevapi.JsonArray;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class UserCommandApp {
  @ShellMethod("User")
  public Object user(final User user) {
    if (user != null) {
      System.out.println(user.getName());
      return JSON.toJSON(user);
    } else {
      System.out.println("User not found");
    }
    return user;
  }
}