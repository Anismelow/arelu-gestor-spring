# Arelú · Gestor de Repostería (API)

API REST para gestionar las ventas de un obrador de repostería: registro de ventas, categorías y resúmenes mensuales. Pensada para ser consumida por un frontend en React.

## Tecnologías

- Java 25
- Spring Boot 4.1 (Web MVC, Data JPA, Validation)
- SQLite
- Lombok
- Maven (con Maven Wrapper)
- JUnit 5

## Requisitos

- JDK 25

No hace falta instalar Maven: el proyecto incluye el Maven Wrapper (`mvnw`).

## Cómo ejecutarlo

```bash
./mvnw spring-boot:run
```

La API arranca en `http://localhost:8080`.

## Tests

```bash
./mvnw test
```

## Estado

🚧 En desarrollo.

### Hoja de ruta

- [x] Proyecto base
- [ ] Migraciones con Flyway y entidades `Categoria` y `Venta`
- [ ] Servicio y DTOs con tests unitarios
- [ ] Endpoints REST con validación
- [ ] Manejo global de errores
- [ ] Ventas por mes y resúmenes
- [ ] CORS y documentación OpenAPI
- [ ] Seguridad con usuarios y roles

## Autor

Anyell · [GitHub](https://github.com/Anismelow)