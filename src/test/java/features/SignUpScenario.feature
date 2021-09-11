Feature: SignIn

  @web @negative
  Scenario Template: Unsuccessful E-Mail validation when registering a new user
    Given open a browser
    When navigate to "<web>" page
    And click to link with "<link text>"
    And text with "<text into tag>" visible
    When set e-mail with "<email text>" to text field for email
    And click web element with tag "<tag name>" and text "<text into tag>"
    And submit button is disable
    And click submit button with text "Continuar"
    And text with "Formato de email no válido" visible

    Examples:
      |web|link text|tag name|text into tag|email text|
      |https://www.carrefour.es|Inicio de sesión|H2|Identifícate o regístrate|Abc.example.com|
      |https://www.carrefour.es|Inicio de sesión|H2|Identifícate o regístrate|Joe Smith <email@example.com>|
      |https://www.carrefour.es|Inicio de sesión|H2|Identifícate o regístrate|email@example@example.com|
      |https://www.carrefour.es|Inicio de sesión|H2|Identifícate o regístrate|あいうえお@example.com|

  @web @positive
  Scenario Template: Successful E-Mail validation when registering a new user
    Given open a browser
    When navigate to "<web>" page
    And click to link with "<link text>"
    And text with "<header text>" visible
    When set e-mail with "<email text>" to text field for email
    And submit button is enable
    And click submit button with text "Continuar"
    And text with "<header text two>" visible
    Then field for input password visible and enable
    Examples:
      |web|link text|header text|email text|header text two|
      |https://www.carrefour.es|Inicio de sesión|Identifícate o regístrate|mail@gmail.com|Crear nueva contraseña|


