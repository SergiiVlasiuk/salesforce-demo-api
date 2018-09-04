package shared.oauth.secrets.demo.only;

public interface Constants {

    String USERNAME     = "USERNAME";
    String SECURITY_TOKEN = "SECURITY_TOKEN";
    String YOUR_DEVORG_PASSWORD = "YOUR_DEVORG_PASSWORD";
    String PASSWORD     = YOUR_DEVORG_PASSWORD + SECURITY_TOKEN;
    String LOGINURL     = "https://login.salesforce.com";
    String GRANTSERVICE = "/services/oauth2/token?grant_type=password";
    String CLIENTID     = "CLIENTID";
    String CLIENTSECRET = "CLIENTSECRET";

}
