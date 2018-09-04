#### OAuth2 endpoints

Enterprise WSDL:

    String authEndPoint = "https://login.salesforce.com/services/Soap/c/44.0/"
    String authEndPoint = "https://community-domain/path-prefix/Soap/c/44.0/"

Partner WSDL:

    String authEndPoint = "https://login.salesforce.com/services/Soap/u/44.0/"
    String authEndPoint = "https://community-domain/path-prefix/Soap/u/44.0/"


### Generate jar

    java -classpath /home/svlasiuk/.m2/repository/com/force/api/force-wsc/44.0.0/force-wsc-44.0.0.jar:/home/svlasiuk/.m2/repository/org/antlr/ST4/4.0.8/ST4-4.0.8.jar:/home/svlasiuk/.m2/repository/org/antlr/antlr-runtime/3.5.2/antlr-runtime-3.5.2.jar \
      com.sforce.ws.tools.wsdlc \
      src/main/resources/myEnterprise.wsdl \
      target/myEnterprise.jar

    java -classpath $M2_HOME/repository/com/force/api/force-wsc/44.0.0/force-wsc-44.0.0.jar:$M2_HOME/repository/org/antlr/ST4/4.0.8/ST4-4.0.8.jar:$M2_HOME/repository/org/antlr/antlr-runtime/3.5.2/antlr-runtime-3.5.2.jar \
      com.sforce.ws.tools.wsdlc \
      src/main/resources/myEnterprise.wsdl \
      target/myEnterprise.jar

### Register local jar

    mvn deploy:deploy-file -Dfile=./demo/soap-client/lib/app.jar -DgroupId=org.generate -DartifactId=salesforce-client -Dversion=1.11 -Dpackaging=jar -Durl=file:./demo/libs/ -DrepositoryId=maven-repository -DupdateReleaseInfo=true

