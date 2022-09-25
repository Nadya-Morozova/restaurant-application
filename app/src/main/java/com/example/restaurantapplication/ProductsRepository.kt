package com.example.restaurantapplication

import com.example.restaurantapplication.data.Product

class ProductsRepository {

    fun fillList(): List<Product> {
        return listOf(
            Product(
                id = 1,
                "Pizza with bacon and mushrooms",
                14.90,
                "pizza",
                "Champignon mushrooms, bacon, mozzarella cheese, basil, tomatoes in own juice or passata, garlic",
                R.drawable.food_pizza_1,
                "Pizza is good, first of all, because the filling for it can be any. We propose to prepare a classic pizza with bacon and mushrooms, using mozzarella as cheese. This is a very Italian combination, and the recipe is as close to the original as possible. The aroma of Italy will be carried around the house and thanks to the fact that the pizza is prepared with basil. Italian style is simple, but very tasty and sunny dish!",
                "40 min",
                4.9,
                "220 ccal"
            ),
            Product(
                id = 2,
                "Margherita pizza",
                12.90,
                "pizza",
                "Tomato sauce, mozzarella cheese, tomatoes, basil, olive oil",
                R.drawable.food_pizza_2,
                "Pizza Margherita is a traditional Italian pizza, perhaps the most popular in the world, even the menu of any pizzeria, as a rule, begins with it. The composition of this pizza is unusually simple, its main ingredients are mozzarella cheese, ripe tomatoes and fresh basil leaves, which give it a unique taste and aroma.",
                "35 min",
                5.0,
                "190 ccal"
            ),
            Product(
                id = 3,
                "Pepperoni pizza",
                13.40,
                "pizza",
                "Spicy pepperoni, sweet pepper, tomato sauce, mozzarella cheese",
                R.drawable.food_pizza_3,
                "The classic composition of pizza in which there is nothing superfluous: spicy pepperoni sausages with light peppercorns, mozzarella cheese with a creamy taste and traditional Italian herbs. Pizza base on traditional thin Italian dough with spicy tomato sauce for pizza, which we cook with Italian herbs and spices.",
                "30 min",
                4.7,
                "220 ccal"
            ),
            Product(
                id = 4,
                "Hawaiian pizza",
                10.40,
                "pizza",
                "ketchup or tomato paste, pineapple, ham, cheese",
                R.drawable.food_pizza_4,
                "Elegant and bright, fragrant and juicy - Hawaiian pizza embodies all the best that we expect from a dish. The motley pattern of tender ham, intoxicatingly viscous mozzarella and sunny pineapples is similar to the Hawaiian landscape.",
                "40 min",
                4.3,
                "170 ccal"
            ),
            Product(
                id = 5,
                "Hunting pizza",
                15.70,
                "pizza",
                "Tomato sauce, mozzarella, juicy chicken fillet, crispy bacon, fragrant ham, beef, hunting sausages, bavarian sausages on the side.",
                R.drawable.food_pizza_5,
                "Hunting pizza is familiar to us as pizza with hunting sausages. This dish has a special colorful taste, which is very vividly remembered and quickly becomes a favorite. Hunting sausages are smoked and crispy, concealing the smell of a fire and the taste of smoke, which, combined with salted pickled gherkins, gives a unique and familiar flavor from childhood.",
                "40 min",
                4.8,
                "270 ccal"
            ),
            Product(
                id = 6,
                "Salami pizza",
                12.30,
                "pizza",
                "Tomato sauce, salami, mozzarella cheese, basil",
                R.drawable.food_pizza_6,
                "Perhaps everything is simple here. The secret of the popularity of the delicacy is its spicy spicy taste. In addition, pork sausage in the classic version is 70% pork and 30% beef. Therefore, the percentage of fat and calories is a little less than you would expect.",
                "35 min",
                4.0,
                "265 ccal"
            ),
            Product(
                id = 7,
                "Supermeat pizza",
                14.90,
                "pizza",
                "Tomato sauce, mozzarella, juicy chicken fillet, crispy bacon, fragrant ham, beef, hunting sausages, bavarian sausages",
                R.drawable.food_pizza_7,
                "Meat pizza, perhaps, is the first thing that comes to mind when ordering a pizza. For some reason, everyone thinks that pizza must contain meat, and in any form. The origin of the word \"pizza\" seems to be connected with the Latin verb, which means \"to break\".",
                "45 min",
                4.8,
                "280 ccal"
            ),
            Product(
                id = 8,
                "Mexican pizza",
                12.30,
                "pizza",
                "Tomato sauce, mozzarella, juicy chicken fillet, crispy bacon, pickled onions, sweet peppers, hot Jalapeno peppers, tomatoes, chili sauce",
                R.drawable.food_pizza_8,
                "The hottest, spiciest, fragrant, for the whole family! Mexican spicy pizza is a variant of everyone's favorite dish, which, along with the usual ingredients, has added a large amount of chili peppers to the filling. Its combination with sweet corn makes pizza extraordinarily tasty!",
                "40 min",
                4.5,
                "200 ccal"
            ),
//            TODO продолжай список. Желательно явно указывать чтобы id был как именнованым аргументом
        )
    }

}
