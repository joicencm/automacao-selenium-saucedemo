Feature: Login Swag Labs

  Scenario: Login com sucesso
    Given que eu acesso a página de login
    When eu informo usuário "standard_user" e senha "secret_sauce"
    Then devo ser direcionado para a página de produtos
