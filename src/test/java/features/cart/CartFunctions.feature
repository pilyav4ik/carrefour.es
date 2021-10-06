@cart
Feature: Cart

  @web @positive
  Scenario Outline: Add product to cart

	Given open a browser
	When navigate to "<web>" page
	Then text with "Categorías Supermercado" visible
	And click to product category with name "<category name>"
	And click to sub category with name "<sub category name>"
	And click to checkbox with text "<checkbox name>"
	Then text with "<text label>" visible
	When click link with text "<link text>"
	And click button with text "Añadir"
	And cart count is <cart count number>
	When click to cart button
	And total price in cart is "<total price>"
	And product with name "<product name>" visible


	Examples:
	  | web 					| category name 	| sub category name | checkbox name | text label 				 | link text 				 | cart count number | total price | product name 			   | product quantity |
	  | https://www.carrefour.es| Productos Frescos | Frutas 			| Banana 		| Banana a granel 1 Kg aprox | Banana a granel 1 Kg aprox| 1 			 	 | 0,99€ 	   | Banana a granel 1 Kg aprox| 1 |