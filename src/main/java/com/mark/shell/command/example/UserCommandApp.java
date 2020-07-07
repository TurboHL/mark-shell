package com.mark.shell.command.example;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class UserCommandApp {
  @ShellMethod("User")
  public void user(final User user) {
    if (user != null) {
      System.out.println(user.getName());
    } else {
      System.out.println("User not found");
    }
  }
}