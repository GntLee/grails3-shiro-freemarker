package com.system

import com.jagregory.shiro.freemarker.ShiroTags
import freemarker.template.Configuration
import freemarker.template.TemplateException
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer

/**
 * @auther Lee
 * @Date 2018/4/19 15:44
 * return 
 *
 */
class FreeMarkerConfigExtend extends FreeMarkerConfigurer {
    @Override
    public void afterPropertiesSet() throws IOException, TemplateException {
        super.afterPropertiesSet()
        Configuration cfg = this.getConfiguration()
        cfg.setSharedVariable("shiro", new ShiroTags())//shiro标签
        cfg.setNumberFormat("#")//防止页面输出数字,变成2,000
        //可以添加很多自己的要传输到页面的[方法、对象、值]
        cfg.setDateFormat("yyyy-MM-dd")
        cfg.setTimeFormat("hh:mm")
        cfg.setDateTimeFormat("yyyy-MM-dd hh:mm")
        cfg.setBooleanFormat("true,false")
    }
}