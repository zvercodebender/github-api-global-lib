@Grab(group='com.ibm.icu', module='icu4j', version='72.1')
import com.ibm.icu.text.CharsetDetector 
//Does not exist: import com.ibm.icu.icu4j

@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7')
import groovyx.net.http.RESTClient 

def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}
