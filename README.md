# yagfi-back — Backend for "Find good first issues"

yagfi-back is the backend service powering the Good First Issues tooling. It exposes APIs used by the CLI and frontend to search, filter, and cache beginner-friendly GitHub issues.

## Core functionality
- Query GitHub issues with filters (language, labels, difficulty)
- Cache results to reduce GitHub API usage and rate-limit problems
- Authentication handling for higher-rate queries and user-specific data
- Endpoints designed for ease of frontend and CLI consumption

## Tech stack
- Java (Spring Boot recommended)
- Database: Postgres (for persistence), Redis (for caching) — recommended
- API docs via OpenAPI/Swagger

## Prerequisites
- Java 17+ (or the JDK version specified in the project)
- Maven or Gradle
- Database (Postgres) and Redis (optional but recommended)

## Run locally
1. Clone
   ```bash
   git clone https://github.com/Xcoder2003X/yagfi-back.git
   cd yagfi-back
   ```
2. Configure
   Add `application.properties` or `application.yml` with:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/yagfi
   spring.datasource.username=...
   spring.datasource.password=...
   github.token=your_github_token
   ```
   Or use environment variables for secrets.
3. Build & run (Maven)
   ```bash
   mvn clean package
   java -jar target/yagfi-back.jar
   ```
4. Open API docs (if Swagger enabled)
   http://localhost:8080/swagger-ui.html

## Docker (recommended)
- Create Dockerfile / docker-compose.yml to include Postgres and Redis services for local dev and testing.

## Production notes
- Implement caching TTLs to balance freshness and API cost.
- Use GitHub App or OAuth for authenticated higher-rate API access and per-user scopes.
- Add request logging, metrics (Prometheus), and health checks for monitoring.

## Contribution & testing
- Add unit tests for API controllers and integration tests for cached flows.
- Provide Postman / OpenAPI collection for frontend and CLI teams.

## License
- Add a LICENSE file and link API docs in the repo root.
