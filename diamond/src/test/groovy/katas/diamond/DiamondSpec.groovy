package katas.diamond

import spock.lang.Specification
import spock.lang.Subject

class DiamondSpec extends Specification {

    @Subject
    def function = new Diamond()

    def 'testo'() {
        expect:
        def arr = function.apply("z")
        arr.each { println it.join('') }
    }


}
