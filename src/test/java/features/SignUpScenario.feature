Feature: SignIn



  @web
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


