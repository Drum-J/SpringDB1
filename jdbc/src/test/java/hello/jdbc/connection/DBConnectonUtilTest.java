package hello.jdbc.connection;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import java.sql.Connection;

import static org.assertj.core.api.Assertions.*;

@Slf4j
class DBConnectonUtilTest {

    @Test
    void connection() {
        Connection connecion = DBConnectionUtil.getConnection();
        assertThat(connecion).isNotNull();
    }
}
