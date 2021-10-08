@signup
Feature: SignUp

  @web @negative
  Scenario Template: Unsuccessful E-Mail validation when registering a new user
    Given open a browser
    When navigate to "<web>" page
    And click link with arial-label "<arial-label text>"
    And text with "<header text>" visible
    When set e-mail with "<email text>" to text field for email
    And click web element with tag "<tag name>" and text "<text into tag>"
    And submit button is disable
    And click button with text "Continuar"
    And text with "Formato de email no válido" visible

    Examples:
      |web|arial-label text|header text|tag name|text into tag|email text|
      |https://www.carrefour.es|Ir a mi cuenta|Identifícate o regístrate|H2|Identifícate o regístrate|Abc.example.com|
      |https://www.carrefour.es|Ir a mi cuenta|Identifícate o regístrate|H2|Identifícate o regístrate|Joe Smith <email@example.com>|
      |https://www.carrefour.es|Ir a mi cuenta|Identifícate o regístrate|H2|Identifícate o regístrate|email@example@example.com|
      |https://www.carrefour.es|Ir a mi cuenta|Identifícate o regístrate|H2|Identifícate o regístrate|あいうえお@example.com|

  @web @positive
  Scenario Template: Successful E-Mail validation when registering a new user
    Given open a browser
    When navigate to "<web>" page
    And click link with arial-label "<arial-label text>"
    And text with "<header text>" visible
    When set e-mail with "<email text>" to text field for email
    And submit button is enable
    And click button with text "Continuar"
    And text with "<header text two>" visible
    Then field for input password visible and enable
    Examples:
      |web|arial-label text|header text|email text|header text two|
      |https://www.carrefour.es|Ir a mi cuenta|Identifícate o regístrate|mail@gmail.com|Crear nueva contraseña|


