package com.example

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
class ExampleResourceTest {

    @Test
    fun testBuggyEndpoint() {
        given()
            .`when`().get("/hello/bug")
            .then()
            .statusCode(200)
            .header("transfer-encoding", "chunked")
    }
}
