import hellopersonressourceservice.*

class BootStrap {

    def init = { servletContext ->
		new Person("firstname":"Sam","lastname":"Hill").save(flush:true)
    }
    def destroy = {
    }
}
