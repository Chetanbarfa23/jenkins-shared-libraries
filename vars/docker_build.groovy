def call(String ProjectName , String ImageTag , String DockerHubUser){
 def call(String ProjectName, String ImageTag, String DockerHubUser) {
    sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
    sh "docker tag ${DockerHubUser}/${ProjectName}:${ImageTag} ${ProjectName}:${ImageTag}"
}
