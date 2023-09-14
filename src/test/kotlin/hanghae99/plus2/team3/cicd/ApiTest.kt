package hanghae99.plus2.team3.cicd

import io.restassured.RestAssured
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.server.LocalServerPort
import org.springframework.test.context.ActiveProfiles

@ActiveProfiles("test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApiTest {

    @LocalServerPort
    var localServerPort: Int = 0

    @BeforeEach
    fun setUp() {
        RestAssured.port = localServerPort
    }

    @Test
    fun test() {
        val response = RestAssured.given()
            .log().all()
            .`when`()
            .get("/api/something")

        assert(response.statusCode == 200)
    }
}
