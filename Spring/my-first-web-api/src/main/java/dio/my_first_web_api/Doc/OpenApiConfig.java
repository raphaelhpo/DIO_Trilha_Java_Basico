package dio.my_first_web_api.Doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.info.Info;
///localhost:8080/swagger-ui.html
@Configuration
public class OpenApiConfig {
        @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                .title("Título da API")
                .description("Descrição da sua API")
                .version("1.0")
                .license(new License()
                .name("Apache 2.0")
                .url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                .description("Documentação Externa")
                .url("http://seusite.com.br"));
    }
}
