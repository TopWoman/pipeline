package test.pipeline;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PipelineApplicationTests {

    @Test
    public void testGetPost() {
        RestAssured.baseURI = "https://httpbin.org/#/HTTP_Methods";

        given()
                .when()
                .get("/get")
                .then()
                .statusCode(200);
    }
}
