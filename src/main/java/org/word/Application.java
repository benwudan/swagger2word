package org.word;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author cuixiuyin
 * @description
 * @date: 2018/12/19 21:32
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("===========================使用方式");

        System.out.println(" - 1.4.2 版本，可通过后面类似链接，使用http://host:port/word?url=url下载doc文件，例如: http://127.0.0.1:8080/word?url=https://petstore.swagger.io/v2/swagger.json 直接下载doc文档\n" +
                "- 1.4.1 版本后，json 资源的地址可以通过 url 传递，例如：http://127.0.0.1:8080/toWord?url=https://petstore.swagger.io/v2/swagger.json");
    }
}
