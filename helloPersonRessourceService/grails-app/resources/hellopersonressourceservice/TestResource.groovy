package hellopersonressourceservice

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam

@Path('/api/test')
class TestResource {
	def testsService //injected

	@GET
	@Produces('text/plain')
  /*  String getTestRepresentation() {
		'Test'
	}
	String getTestRepresentation(@QueryParam('name') String name) {
		//"Hello ${name ? name : 'unknown'}"
		'Hello Albert and  ' + (name ? name : 'unknown')
	}*/
	String getTestRepresentation(@QueryParam('name') String name) {
		testsService.greet(name)
	}

}
