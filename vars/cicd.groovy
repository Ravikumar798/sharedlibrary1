def contDownload(repo)
{
  echo git "https://github.com/Ravikumar798/${repo}.git"
}
def contBuild()
{
   echo sh "mvn package"
}
def deploytomcat(ip,context)
{
  echo deploy "adapters: [tomcat9(credentialsId: 'ee329ab3-6634-416e-9558-5e974dec7e8c', path: '', url: 'http://${ip}:8080')], contextPath: '${context}', war: '**/*.war'"
}
