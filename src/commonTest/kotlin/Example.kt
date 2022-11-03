import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.http.HttpStatusCode

class SampleTest : StringSpec({
    "Ktor get should work" {
        HttpClient().get("https://echo.zuplo.io/").also { println(it) }.status shouldBe HttpStatusCode.OK
    }
})