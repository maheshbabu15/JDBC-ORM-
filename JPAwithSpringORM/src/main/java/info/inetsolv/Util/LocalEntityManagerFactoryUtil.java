package info.inetsolv.Util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class LocalEntityManagerFactoryUtil {

	
	@Bean
	public LocalEntityManagerFactoryBean localEntityManagerFactoryBean() {

		LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("JPAwithSpringORM");
		return factoryBean;

	}

}
