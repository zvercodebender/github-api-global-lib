import com.ibm.icu.text.CharsetDetector 
import com.ibm.icu.icu4j
@Grab(group='com.ibm.icu', module='icu4j', version='72.1')
//Exception in catch: java.io.NotSerializableException

@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7')
import groovyx.net.http.RESTClient 
//Exception in catch: java.io.NotSerializableException: groovyx.net.http.RESTClient
//java.io.NotSerializableException: groovyx.net.http.RESTClient

def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}
