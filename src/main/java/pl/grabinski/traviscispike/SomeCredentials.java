package pl.grabinski.traviscispike;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "some")
public class SomeCredentials {
    private String user;
    private String password;
    private String otherSecret;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOtherSecret() {
        return otherSecret;
    }

    public void setOtherSecret(String otherSecret) {
        this.otherSecret = otherSecret;
    }
}
