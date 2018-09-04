### Generate jar client for soap 

    java -classpath $M2_HOME/repository/com/force/api/force-wsc/44.0.0/force-wsc-44.0.0.jar:$M2_HOME/repository/org/antlr/ST4/4.0.8/ST4-4.0.8.jar:$M2_HOME/repository/org/antlr/antlr-runtime/3.5.2/antlr-runtime-3.5.2.jar \
          com.sforce.ws.tools.wsdlc \
          src/main/resources/myEnterprise.wsdl \
          target/myEnterprise.jar
