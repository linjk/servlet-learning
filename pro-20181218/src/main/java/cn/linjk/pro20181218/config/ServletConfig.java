package cn.linjk.pro20181218.config;

import cn.linjk.pro20181218.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {
    @Bean
    public MyServlet myServlet() {
        return new MyServlet();
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBeanMyServlet(MyServlet myServlet) {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(myServlet);
        servletRegistrationBean.setEnabled(true);
        servletRegistrationBean.addUrlMappings("/my-servlet");
        servletRegistrationBean.setName("MyServlet");
        servletRegistrationBean.addInitParameter("user", "linjk");

        return servletRegistrationBean;
    }

    // =============================================================================================
}
