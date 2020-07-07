package com.mark.shell;

import com.mark.shell.service.CorrectTaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MarkShellApplicationTests {

    @Autowired
    private CorrectTaskService correctTaskService;

    @Test
    public void contextLoads() {

    }

    @Test
    public void test1(){
        System.out.println("=================================");
        int count = correctTaskService.countTask();
        System.out.println(count);
        System.out.println("=================================");
    }

    @Test
    public void test2(){
        System.out.println("=======================++++++++++++++++++++");
    }

}
