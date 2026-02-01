# 🛠 Automação de Testes – SauceDemo

Automação de testes do site [SauceDemo](https://www.saucedemo.com/inventory.html) utilizando **Selenium**, **Cucumber** e **Page Object Pattern** em **Java** com **Maven**.

O projeto está organizado para seguir boas práticas de automação e ser facilmente escalável para novos testes.

---

## 📁 Estrutura do Projeto

automacao-selenium-saucedemo
│
├─ pom.xml
├─ README.md
│
├─ src
│ ├─ main
│ │ ├─ java
│ │ │ ├─ core → DriverFactory, BasePage
│ │ │ ├─ elements → Locators dos elementos da página
│ │ │ └─ pages → Classes de página (Page Objects)
│ │
│ └─ test
│ ├─ java
│ │ ├─ runner → Classe Runner do Cucumber
│ │ └─ steps → Steps do Cucumber
│ └─ resources
│ └─ features → Arquivos .feature com os cenários


---

## ⚡ Tecnologias Utilizadas

- **Java 17**
- **Maven**
- **Selenium 4.14.0**
- **Cucumber 7.15.0**
- **JUnit 4.13.2**
- **WebDriverManager 5.4.1**

---

## 🚀 Como Rodar

1. **Clonar o projeto**

2. **Executar os testes via Maven**
```bash
git clone <url-do-repositorio>
cd automacao-selenium-saucedemo
Executar os testes via Maven
```
3. **Visualizar relatórios do Cucumber**
- Após rodar os testes, abrir o relatório HTML gerado:
```bash
target/cucumber-report.html
```
---
## 🧩 Detalhes do Page Object
`core`
- `BasePage.java` → contém métodos comuns a todas as páginas e o driver
- `DriverFactory.java` → gerencia a instância do WebDriver

`elements`
- Classes que contêm os locators dos elementos da página, separados por página

`pages`
- Classes que representam as páginas do site e contêm métodos para interagir com os elementos (`login`, `acessarUrl`, etc.)
---

## ⚙️ Cucumber
### Estrutura dos Steps
- Cada Step corresponde a uma ação ou validação de teste
- Chamam apenas métodos da Page (não acessam o WebDriver diretamente)

### Runner
- `RunCucumberTest.java` → classe principal para rodar os cenários

Exemplo de configuração:
```java
@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources/features",
glue = "steps",
plugin = {
"pretty",
"html:target/cucumber-report.html"
}
)
public class RunCucumberTest {}
```
---

## ✅ Boas Práticas Seguidas
- **Page Object Pattern**
- **Encapsulamento do WebDriver** (protected ou private com getters)
- **Separation of Concerns**: Steps → Pages → Elements
- Relatórios HTML automáticos
- Maven para dependências e execução
---

## 🔧 Próximos Passos / Melhorias
- Adicionar testes de **logout** e **carrinho**
- Configuração de **testes paralelos**
- Integração com **CI/CD** (Jenkins, GitHub Actions)
- Uso de headless **browser** para execução mais rápida

