#Author: robson@ideamaker.com.br
@tag
Feature: Como usuario quero comprar CAP
  Estando dentro do app quero comprars CAPs e presentear os Amigos com CAPs
  
  @tag1
  Scenario: Baixar o APP Login e Comprar
    Given Estando com o Celular quero baixar e abrir o APP 

    When Abrir o APP colocar meu CPF e Senha
    And Clicar no Botao comprar pra mim
    

    Then validando tudo eu fecho os app

