package br.com.exemplo.springbootjsf;

import org.springframework.boot.context.embedded.ServletContextInitializer;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.faces.webapp.FacesServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by zozfabio on 02/06/15.
 */
@Configuration
public class FacesConfiguration {

    @Bean
    public ServletRegistrationBean facesServletRegistrationBean() {
        ServletRegistrationBean registration = new ServletRegistrationBean();
        registration.setServlet(new FacesServlet());
        registration.addUrlMappings("*.jsf");
        registration.setLoadOnStartup(1);
        registration.setName("facesServlet");
        return registration;
    }

    /**
     * Created by zozfabio on 02/06/15.
     */
    @Configuration
    public static class FacesInitializer implements ServletContextInitializer {

        @Override
        public void onStartup(ServletContext servletContext) throws ServletException {
            servletContext.setInitParameter("primefaces.THEME", "eggplant");
            servletContext.setInitParameter("primefaces.CLIENT_SIDE_VALIDATION", "true");
            servletContext.setInitParameter("javax.faces.PROJECT_STAGE", "Development");
        }
    }
}
