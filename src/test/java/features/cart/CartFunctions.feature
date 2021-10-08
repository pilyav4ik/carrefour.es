@cart
Feature: Cart

  @web @positive
  Scenario Outline: Add product to cart

	Given open a browser
	When navigate to "<web>" page
	Then text with "Categorías Supermercado" visible
	And click product category with name "<category name>"
	And click sub category with name "<sub category name>"
	And click checkbox with text "<checkbox name>"
	Then link with text "<text label>" visible
	And click link with text "<text label>"
	And click button with text "Añadir"
	And text with "Producto añadido" visible
	And click button with text "Ir a la cesta"
	Then link with text "<text label>" visible
	Then product quantity in cart is "<product quantity>"
	Then price for product is "<price>"
	And total price in cart is "<total price>"

	Examples:
	  | web 					| category name 	| sub category name | checkbox name | text label 				 | price | total price | product quantity |
	  | https://www.carrefour.es| Productos Frescos | Frutas 			| Banana 		| Banana a granel 1 Kg aprox | 1,05  | 8,05 	   | 1 |