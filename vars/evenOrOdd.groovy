def call(int build_number) {
    if(build_number % 2 == 0) {
        pipeline {
            agent any
            stages {
                stage('Even Stage') {
                    steps {
                        echo build_number + 'is even'
                    }
                }
            }
        }
    } else {
        pipeline {
            agent any 
            stages {
                stage('Odd Stage') {
                    steps {
                        echo build_number + 'is odd'
                    }
                }
            }
        }

    }
}