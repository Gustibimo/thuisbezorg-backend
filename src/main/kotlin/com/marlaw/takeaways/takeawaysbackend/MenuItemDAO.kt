package com.marlaw.takeaways.takeawaysbackend

import org.springframework.stereotype.Component

@Component

class MenuItemDAO {
    private val menuItems = listOf(
            MenuItem(id = "cheese_tomato_pizza", name = "Cheese & Tomato Pizza",price = "€ 12.5", image = "https://static.thuisbezorgd.nl/images/generic/categories/1_baguette/baguette_knoblauch.png"),
            MenuItem(id = "hot_spicy_pizza", name = "Hot & Spicy Pizza",price = "€ 22.0", image = "https://static.thuisbezorgd.nl/images/generic/categories/1_baguette/baguette_knoblauch.png"),
            MenuItem(id = "vegetarian_pizza", name = "Vegetarian Supreme Pizza",price = "€ 15.25", image = "https://static.thuisbezorgd.nl/images/generic/categories/1_baguette/baguette_knoblauch.png"),
            MenuItem(id = "garlic_bread", name = "Garlic Pizza Bread", price = "€ 2.0",image = "https://static.thuisbezorgd.nl/images/generic/categories/1_baguette/baguette_knoblauch.png"),
            MenuItem(id = "donner_kebab", name = "Donner Kebab",price = "€ 24.0", image = "https://static.thuisbezorgd.nl/images/generic/categories/1_baguette/baguette_knoblauch.png"),
            MenuItem(id = "chicken_tikka_kebab", name = "Chicken Tikka Kebab", price = "€ 30.0", image = "https://static.thuisbezorgd.nl/images/generic/categories/1_baguette/baguette_knoblauch.png"),
            MenuItem(id = "chicken_strips", name = "Chicken Strips (7)",price = "€ 11.4", image = "https://static.thuisbezorgd.nl/images/generic/categories/1_baguette/baguette_knoblauch.png"),
            MenuItem(id = "beef_burger", name = "Beef Burger", price = "€ 1.5",image = "https://static.thuisbezorgd.nl/images/generic/categories/1_baguette/baguette_knoblauch.png"),
            MenuItem(id = "cheeseburger", name = "Cheeseburger", price = "€ 22.0", image = "https://static.thuisbezorgd.nl/images/generic/categories/1_baguette/baguette_knoblauch.png")
    )

    fun lisMenuItems() = menuItems
}