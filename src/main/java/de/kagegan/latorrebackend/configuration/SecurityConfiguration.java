package de.kagegan.latorrebackend.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.List;

@Configuration
@EnableWebSecurity
@EnableWebMvc
public class SecurityConfiguration implements WebMvcConfigurer {

    @Value(value = "#{'${de.latorre.security.originPattern}'.split(',')}")
    private List<String> originPatterns;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowedHeaders(Arrays.asList("Authorization","Cache-Control", "Contet-Text","baggage", "sentry-trace"));
        corsConfiguration.setAllowedOrigins(originPatterns);
        corsConfiguration.setAllowedMethods(List.of("GET","POST","DELETE","PUT"));
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.setExposedHeaders(List.of("Authorization"));


        http.csrf(AbstractHttpConfigurer::disable).cors(cors -> cors.configurationSource(r -> corsConfiguration))
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/", "/home", "/article/**", "/main").permitAll()
                        .anyRequest().authenticated()
                );

        return http.build();
    }
}
