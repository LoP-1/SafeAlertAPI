package com.apiSafeAlert.SafeAlert;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {

    public void addCorsMappings(CorsRegistry registry) {
        // Permitir solicitudes de cualquier dominio
        registry.addMapping("/**") // Aplica a todas las rutas
                .allowedOrigins("*") // Permite todos los dominios
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos permitidos
                .allowedHeaders("*") // Permite todos los encabezados
                .allowCredentials(true); // Si necesitas permitir credenciales (como cookies)
    }
}
