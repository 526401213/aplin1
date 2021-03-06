package cn.aplin1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 君当作磐石妾当作蒲苇,蒲苇纫如丝磐石无转移
 * @author 附耳聆听
 *
 */
@MapperScan("cn.aplin1.dao")
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	
}
