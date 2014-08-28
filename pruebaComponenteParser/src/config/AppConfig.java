package config;

import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.core.env.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate3.HibernateExceptionTranslator;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;


@Configuration
/*@EnableJpaRepositories(basePackages = "tk.ebalsa.strutsok.persistence",
	includeFilters = @ComponentScan.Filter(value = {BookRepository.class}, type = FilterType.ASSIGNABLE_TYPE))
@EnableTransactionManagement
@ComponentScan("tk.ebalsa.strutsok")
@PropertySource("classpath:/tk/ebalsa/strutsok/config/app.properties")*/
public class AppConfig {
	
	  @Resource
	  private Environment environment;
	
	  @Bean(destroyMethod = "shutdown")
	  public DataSource dataSource() {
		return null;
	      
		  
	  }

	 
}