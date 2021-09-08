#Author: freeautomationlearning@gmail.com
Feature: Google Search

	@web
  Scenario Template: Validate google search text field
    Given I open a browser
    When I navigate to <web> page
    Then page title is <title>

    Examples:
      |web|title|
      |"https://www.carrefour.es/order_locator"|"Consulta tu pedido"|