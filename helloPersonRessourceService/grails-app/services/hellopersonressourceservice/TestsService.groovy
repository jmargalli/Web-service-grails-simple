package hellopersonressourceservice

import grails.transaction.Transactional

@Transactional
class TestsService {

     //def serviceMethod() {    }
	String greet(String name) {
		'Bonjour ' + (name ? name : 'unknown')
	}
}
