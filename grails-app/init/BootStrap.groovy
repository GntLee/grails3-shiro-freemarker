import com.system.ShiroRole
import com.system.ShiroUser
import grails.converters.JSON
import org.apache.shiro.crypto.hash.Sha256Hash

class BootStrap {

    def init = { servletContext ->

        //domain日期格式转json时的格式
        JSON.registerObjectMarshaller(Date) {
            return it?.format("yyyy-MM-dd HH:mm:ss")
        }

        if(!ShiroUser.findByUsername("admin")) {

            println "初始化Shiro plugins数据中...请稍后..."

            def role1 = new ShiroRole("ROLE_ADMIN","管理员")
            role1.addToPermissions("*:*")
            role1.save(flush:true)

            def role2 = new ShiroRole("ROLE_USER","普通用户")
            role2.addToPermissions("*:*")
            role2.save(flush:true)

            def role3 = new ShiroRole("ROLE_GUEST","来宾用户")
            role3.addToPermissions("test:*")
            role3.save(flush:true)

            def user1 = new ShiroUser("admin",new Sha256Hash("admin").toHex())
            user1.addToRoles(role1)
            user1.save(flush:true)

            def user2 = new ShiroUser("test",new Sha256Hash("test").toHex()).save(flush:true)
            user2.addToRoles(role2)
            user2.save(flush:true)

            def user3 = new ShiroUser("guest",new Sha256Hash("guest").toHex()).save(flush:true)
            user3.addToRoles(role3)
            role3.save(flush:true)
        }

    }

    def destroy = {

    }
}
