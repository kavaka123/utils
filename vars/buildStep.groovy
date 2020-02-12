def call(Map config) {
    node {
        git url: "https://github.com/kavaka123/${config.name}.git"
        sh "cd maven-example && mvn clean install package"
        mail to: "avant.aditya@gmail.com", subject: "${config.name} is built", body: "Check the log: ${env.JENKINS_URL}"
    }
}