import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver

// Place your Spring DSL code here
beans = {

    //防止hibernate session报错
    openSessionInViewFilter(org.springframework.orm.hibernate4.support.OpenSessionInViewFilter) {}
    
    freeMarkerConfigurer(com.system.FreeMarkerConfigExtend) {
        templateLoaderPath = "\\"
    }
    viewResolver(FreeMarkerViewResolver) {
        cache = false
        prefix = "bin/freemarker"
        suffix = ".ftl"
        exposeSpringMacroHelpers = true
    }
}
