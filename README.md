# DevCalc API - DevOps & CI/CD Project

![CI/CD Pipeline](https://github.com/gbussad/devcalc-api/actions/workflows/ci-cd.yml/badge.svg)

Este projeto é uma API de calculadora simples desenvolvida em Java (Javalin) para demonstrar práticas avançadas de DevOps, incluindo Dockerização, Orquestração com Kubernetes e Pipelines de CI/CD no GitHub Actions.

##  Tecnologias Utilizadas
- **Java 17 + Maven**: Backend e Testes Unitários.
- **Docker**: Containerização da aplicação.
- **Kubernetes (K8s)**: Orquestração local (Deployment e Services).
- **GitHub Actions**: Automação de Build, Testes e Deploy.

---

##  Conceitos de DevOps Aplicados (Rúbricas)

### 1. O Papel do Git na Integração Contínua
O Git é a espinha dorsal do DevOps. Ele permite o **versionamento** do código, garantindo que toda alteração seja rastreada. No contexto de CI/CD, o Git funciona como o "gatilho":
- **Commit/Push**: Inicia automaticamente os testes e builds.
- **Branches**: Permitem desenvolvimento isolado. Usamos a branch `ci/setup` para configurar o ambiente sem quebrar a `main`.
- **Tags/Releases**: Marcam versões estáveis do software (ex: v1.0.0), facilitando rollbacks.

### 2. Estrutura do Pipeline (CI/CD)
O arquivo `.github/workflows/ci-cd.yml` automatiza o ciclo de vida:
1.  **Build & Test**: Compila o Java e roda `mvn test`. Se falhar, o processo para.
2.  **Artifact**: Gera um arquivo `.jar` e faz upload como artefato para uso posterior.
3.  **Docker Push**: Se os testes passarem, constrói a imagem e envia para o Docker Hub (`gbussad/devcalc-api`).
4.  **Deploy Seguro**: O deploy para o ambiente `production` exige **Aprovação Manual**, garantindo que nada vá para o ar sem revisão humana.

### 3. Monitoramento e Observabilidade
- **Badges**: O ícone no topo deste README mostra em tempo real se o último build passou ou falhou.
- **Job Summaries**: Resumos detalhados são gerados ao final de cada execução no GitHub Actions.
- **Logs de Debug**: Configuramos `ACTIONS_STEP_DEBUG=true` para facilitar diagnósticos em caso de falha.

---

## Como rodar o projeto

### Pré-requisitos
- Docker Desktop com Kubernetes habilitado.

### Passos
1. Clone o repositório:
   ```bash
   git clone [https://github.com/gbussad/devcalc-api.git](https://github.com/gbussad/devcalc-api.git)