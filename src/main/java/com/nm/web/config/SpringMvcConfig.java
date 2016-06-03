package com.nm.web.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.concurrent.TimeUnit;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年05月27日上午14:30] 创建方法 by hw
 */
//@Configuration
//@EnableWebMvc
//@ComponentScan(basePackages = "com.nm.web.config")
public class SpringMvcConfig extends WebMvcConfigurerAdapter {
//
//    @Bean
//    public ViewResolver viewResolver() {
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setViewClass(JstlView.class);
//        viewResolver.setPrefix("/WEB-INF/app/");
//        viewResolver.setSuffix(".jsp");
//        return viewResolver;
//    }
//
//    @Bean
//    public MessageSource messageSource() {
//        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//        messageSource.setBasename("messages");
//        return messageSource;
//    }
//
//    /**
//     * Configure ResourceHandlers to serve static resources like CSS/ Javascript etc...
//     */
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/app/**").addResourceLocations("/app/");
//    }
//
//    /**Optional. It's only required when handling '.' in @PathVariables which otherwise ignore everything after last '.' in
//
//     @PathVaidables argument.
//      * It's a known bug in Spring [https://jira.spring.io/browse/SPR-6164], still present in Spring 4.1.7.
//      * This is a workaround for this issue.
//     */
//    @Override
//    public void configurePathMatch(PathMatchConfigurer matcher) {
//        matcher.setUseRegisteredSuffixPatternMatch(true);
//    }
}
