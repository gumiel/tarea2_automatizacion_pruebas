Feature: CreateUser

  Scenario: crear una cuenta de usuario

    Given la pagina "http://todo.ly/" este abierta1
    When yo quiero realizar la creacion de usuario
      | full_name | henry                 |
      | email     | maesta12@aaam.com |
      | password  | 123456                |
    Then yo deberia ingresar a la pagina de inicio