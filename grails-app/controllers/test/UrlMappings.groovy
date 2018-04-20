package test

class UrlMappings {

    static mappings = {
        //配置伪静态
        "/$controller/$action?.html/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "index",action: "index")
        "500"(controller: "error",action: "error")
        "404"(controller: "error", action:'notFound')
    }
}
