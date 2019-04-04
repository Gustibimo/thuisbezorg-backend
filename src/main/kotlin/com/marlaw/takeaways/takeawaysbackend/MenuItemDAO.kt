package com.marlaw.takeaways.takeawaysbackend

import org.springframework.stereotype.Component

@Component

class MenuItemDAO {
    private val menuItems = listOf(
            MenuItem(id = "cheese_tomato_pizza", name = "Cheese & Tomato Pizza", image = "https://static.thuisbezorgd.nl/images/generic/categories/1_baguette/baguette_knoblauch.png"),
            MenuItem(id = "hot_spicy_pizza", name = "Hot & Spicy Pizza", image = "https://static.thuisbezorgd.nl/images/generic/categories/1_baguette/baguette_knoblauch.png"),
            MenuItem(id = "vegetarian_pizza", name = "Vegetarian Supreme Pizza", image = "https://static.thuisbezorgd.nl/images/generic/categories/1_baguette/baguette_knoblauch.png"),
            MenuItem(id = "garlic_bread", name = "Garlic Pizza Bread", image = "https://static.thuisbezorgd.nl/images/generic/categories/1_baguette/baguette_knoblauch.png"),
            MenuItem(id = "donner_kebab", name = "Donner Kebab", image = "https://static.thuisbezorgd.nl/images/generic/categories/1_baguette/baguette_knoblauch.png"),
            MenuItem(id = "chicken_tikka_kebab", name = "Chicken Tikka Kebab", image = "https://static.thuisbezorgd.nl/images/generic/categories/1_baguette/baguette_knoblauch.png"),
            MenuItem(id = "chicken_strips", name = "Chicken Strips (7)", image = "https://static.thuisbezorgd.nl/images/generic/categories/1_baguette/baguette_knoblauch.png"),
            MenuItem(id = "beef_burger", name = "Beef Burger", image = "https://static.thuisbezorgd.nl/images/generic/categories/1_baguette/baguette_knoblauch.png"),
            MenuItem(id = "cheeseburger", name = "Cheeseburger", image = "https://static.thuisbezorgd.nl/images/generic/categories/1_baguette/baguette_knoblauch.png")
    )

    fun lisMenuItems() = menuItems
}