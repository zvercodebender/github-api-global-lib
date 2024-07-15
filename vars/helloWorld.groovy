import com.ibm.icu.text.CharsetDetector -- check csproj/validate json - common step
@Grab(group='com.ibm.icu', module='icu4j', version='72.1')
Exception in catch: java.io.NotSerializableException

def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}
