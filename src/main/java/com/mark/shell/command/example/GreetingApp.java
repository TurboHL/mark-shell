package com.mark.shell.command.example;

import com.mark.shell.service.CorrectTaskService;
import com.mark.shell.common.SpringCommon;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class GreetingApp {

  // say-hi
  @ShellMethod("Say hi")
  public String sayHi(String name) {
    CorrectTaskService correctTaskService = SpringCommon.getBean(CorrectTaskService.class);
    return String.format("Hi %s", correctTaskService.countTask());
  }

  // say-hi
  @ShellMethod("exesql")
  public String exesql(String sql) {
    return "execute-sql:" + sql;
  }

  @ShellMethod("Echo1")
  public String echo1(int a, int b, int c) {
    return String.format("a = %d, b = %d, c = %d", a, b, c);
  }

  @ShellMethod("Echo2")
  public String echo2(int a, @ShellOption("--boy") int b, int c) {
    return String.format("a = %d, b = %d, c = %d", a, b, c);
  }

  @ShellMethod(key = "default", value = "With default value")
  public void withDefault(@ShellOption(defaultValue = "Hello") final String value) {
    System.out.printf("Value: %s%n", value);
  }

//  @ShellMethod("Echo3")
//  public String echo3(@ShellOption(arity = 3) int[] numbers) {
//    return String.format("a = %d, b = %d, c = %d", numbers[0], numbers[1], numbers[2]);
//  }

}