package com.mark.shell.command.example;

import com.mark.shell.service.UserService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserConverter implements Converter<String, User> {
 
  private final UserService userService = new UserService();
 
  @Override
  public User convert(String source) {
    return userService.findUser(source);
  }
}