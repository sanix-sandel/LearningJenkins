pipeline{
    agent any
    triggers{
        pollSCM('* * * * *')

    }
    stages{
        stage("compile"){
            steps{
                sh "./gradlew compileJava"
            }
        }
        stage("Unit test"){
            steps{
                sh "./gradlew test"
            }
        }
//         stage("Code coverage"){
//             steps{
//                 sh "./gradlew jacocoTestReport"
//                 publishHTML (target: [
//                     reportDir: 'build/reports/jacoco/test/html',
//                     reportFiles: 'index.html',
//                     reportName: "JaCoCo Report"
//                 ])
//                 sh "./gradlew jacocoTestCoverageVerification"
//             }
//         }
        stage("Package"){
            steps{
                sh "./gradlew build"
            }
        }
        stage("Docker build"){
            steps{
                sh "docker build -t sanixsandel/calculator ."
            }
        }
    }
}