package pl.grabinski.traviscispike;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccessingSomeEnvVariablesTests {

    @Autowired
    private SomeCredentials someCredentials;

    @Test
    public void testAccessingEnvironmentVariables() {
        assertEquals("Bob", someCredentials.getUser());
        assertEquals("topsecret", someCredentials.getPassword());
    }

    /**
     * travis encrypt SOME_OTHER_SECRET=super_secret --add env.global
     */
    @Test
    public void testAccessingEncryptedEnvVariableFromTravisYaml() {
        assertEquals("super_secret", someCredentials.getOtherSecret());
    }

}
