package ge.tanini.taro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TaroApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaroApplication.class, args);
    }

}
