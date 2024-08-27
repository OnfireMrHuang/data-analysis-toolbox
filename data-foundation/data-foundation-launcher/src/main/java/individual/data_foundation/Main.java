package individual.data_foundation;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication(scanBasePackages = "individual.data_foundation")
public class Main {

    public static void main(String[] args) {
        log.info("启动数据基座项目!");
        SpringApplication.run(Main.class, args);
    }
}