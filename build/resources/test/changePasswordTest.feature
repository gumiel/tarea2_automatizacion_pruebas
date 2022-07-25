Feature: Change

  Scenario: Verificar el cambio de password este correcto

    Given la pagina "http://todo.ly/" este abierta.
    When yo quiero realizar el login para cambiar el password
      | email    | hperezcbba@gmail.com |
      | password | 123456 |
    Then yo deberia ingresar a la app web para dar click en Settings
    Then yo deberia ingresar el antiguo y nuevo password
      | old_password | 123456 |
      | new_password | 123456 |
    Then cambial el password