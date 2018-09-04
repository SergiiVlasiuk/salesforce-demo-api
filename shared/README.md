## General part of preparing project

    static final String USERNAME     = "YOUR DEVORG USERNAME";
    static final String YOUR_DEVORG_PASSWORD = "YOUR DEVORG PASSWORD";
    static final String SECURITY_TOKEN = "SECURITY TOKEN";
    static final String PASSWORD     = YOUR_DEVORG_PASSWORD + SECURITY_TOKEN;
    static final String LOGINURL     = "https://login.salesforce.com";
    static final String GRANTSERVICE = "/services/oauth2/token?grant_type=password";
    static final String CLIENTID     = "YOUR OAUTH CONSUMER KEY";
    static final String CLIENTSECRET = "YOUR OAUTH CONSUMER SECRET";


#### USERNAME

Ordinal user name for account which has to be used in remote app (sync service for example)

#### YOUR_DEVORG_PASSWORD

Ordinal password for the specified user name. 

#### SECURITY_TOKEN

Unique token that can be generated from [user's account](https://eu16.salesforce.com).

    My settings ->
    Personal ->
    Reset My Security Token ->
    [PRESS] Reset Security Token ->
    [Check Your Email] We sent a new security token to the email address for your account, [email]
     
#### CLIENTID & CLIENTSECRET

in Lightning view:

    Setup ->
    Apps ->
    App Manager ->
        [in case New connected app is not created]
            New Connected App ->
            Basic Information ->
                Connected App Name
                API Name
                Contact Email
            API (Enable OAuth Settings) ->
                Enable OAuth Settings [press] ->
                Enable for Device Flow [press] ->
                Selected OAuth Scopes [select to permit any]
            [PRESS] save ->
            continue ->
            view your {New connected app} page
        [in case New connected app is created]
            find app in list ->
            find drop down button and select view ->
            [specified app] API (Enable OAuth Settings) -> 
                <Consumer Key>
                <Consumer Secret>
                Selected OAuth Scopes
                Callback URL

