import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver

// Place your Spring DSL code here
beans = {

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