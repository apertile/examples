package net.codejava.springmvc.config;

import net.codejava.springmvc.BasePackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration
//@EnableWebMvc trae toda la configuraci�n de WebMvcConfigurationSupport.java
@EnableWebMvc
//@ComponentScan le dice que busque a partir de la clase BasePackage todas las clases
//que tengan la anotaci�n @Component para registrarlas. En este caso va a encontrar
//a HomeController que est� anotado con @Controller que es parte de @Component
@ComponentScan(basePackageClasses = BasePackage.class)
//para poder configurar los m�todos traidos por @EnableWebMvc hay que extender la clase
//de WebMvcConfigurerAdapter y hacer un override de los m�todos que se quiera
public class WebAppConfig extends WebMvcConfigurerAdapter {
	private static final String VIEW_RESOLVER_PREFIX = "/WEB-INF/views/";
    private static final String VIEW_RESOLVER_SUFFIX = ".jsp";

    //Hago que busque los resources dentro de la ra�z de la carpeta (paquete) /resources
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    //configuro un handler para manejar el servidor de los recursos est�ticos como im�genes,
    //js, etc. configurer.enable() va a tratar de detectar el nombre del Servlet por default
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    
    //configuramos la vista, donde encontrarla y con qu� mostrarla. En este caso le ponemos
    //JstlView para que pueda entender los tags JSTL (JSP Standard Tag Library)
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix(VIEW_RESOLVER_PREFIX);
        viewResolver.setSuffix(VIEW_RESOLVER_SUFFIX);

        return viewResolver;
    }
}
