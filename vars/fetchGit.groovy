def call(){
    checkout scm

    sh 'git rev-parse HEAD > git_commit_id.txt'

    env.GIT_COMMIT_ID = readFile('git_commit_id.txt').trim()
    
    env.GIT_COMMIT_SHA = env.GIT_COMMIT_ID.substring(0, 7)
    
    println "GIT Id: ${env.GIT_COMMIT_SHA}"
    
    println "Build Id: ${env.BUILD_TAG}"
}