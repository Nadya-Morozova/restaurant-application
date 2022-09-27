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
                "820 ccal"
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
                "790 ccal"
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
                "820 ccal"
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
                "770 ccal"
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
                "970 ccal"
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
                "865 ccal"
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
                "680 ccal"
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
                "750 ccal"
            ),
            Product(
                id = 9,
                "Chicken burger",
                7.49,
                "burgers",
                    "Wheat bun, chicken cutlet, tomatoes, funchoza fries, iceberg lettuce, cucumber, cheese Dor Blue, burger sauce",
                R.drawable.food_burger_1,
                "Freshly baked homemade bun, tender chicken cutlet and fresh vegetables. The unique taste of the burger is given by the filling of dor-blue cheese and mayonnaise, combined with deep-fried funchose",
                "8 min",
                5.0,
                "350 ccal"
            ),
            Product(
                id = 10,
                "Hamburger",
                8.99,
                "burgers",
                "Wheat bun, beef cutlet, tomatoes, cucumber, tomatoes, onion, burger sauce",
                R.drawable.food_burger_2,
                "Classic burger with fresh homemade bun, juicy beef cutlet, sauce, crispy pickled cucumbers, lettuce and Crimean onion rings",
                "10 min",
                4.9,
                "510 ccal"
            ),
            Product(
                id = 11,
                "Chef burger",
                10.99,
                "burgers",
                "Wheat bun, 3 beef cutlet, tomatoes, cucumber, tomatoes, onion, champignons, burger sauce",
                R.drawable.food_burger_3,
                "A burger with an unusual combination of flavors: juicy beef patty, onion jam and mushrooms in cream, the taste of which is complemented by cheddar cheese, pickled cucumbers, fresh vegetables and a home-made bun",
                "10 min",
                4.7,
                "530 ccal"
            ),
            Product(
                id = 12,
                "Burger Double Cheese",
                9.90,
                "burgers",
                "Wheat bun, beef cutlet, tomatoes, cheese mix, сheddar cheese, cucumber, tomatoes, onion, burger sauce",
                R.drawable.food_burger_4,
                "Burger with juicy beef patty, tender cheese layer, toasted cheddar cheese and sweet onion jam. The taste of the main ingredients is set off by crispy french onions, pickled cucumbers, cheese sauce and a freshly baked bun",
                "5 min",
                4.9,
                "400 ccal"
            ),
            Product(
                id = 13,
                "Beef burger",
                10.40,
                "burgers",
                "Wheat bun, 2 beef cutlet, tomatoes, veal, gouda cheese, cucumber, tomatoes, onion, BBQ sauce, burger sauce",
                R.drawable.food_burger_5,
                "The stuffing of pulled veal, tender cheese layer, gouda and cheddar cheeses is complemented by pickled cucumbers, lettuce, barbecue sauce and a freshly baked bun",
                "10 min",
                5.0,
                "630 ccal"
            ),
            Product(
                id = 13,
                "Brooklyn Burger",
                8.40,
                "burgers",
                "Wheat bun, beef cutlet, bacon, onion, tomatoes, pickles, iceberg lettuce, burger sauce",
                R.drawable.food_burger_6,
                "Fresh homemade bun, juicy beef patty and crispy bacon are paired with French fries, pickled cucumbers and honey mustard sauce",
                "10 min",
                5.0,
                "430 ccal"
            ),
            Product(
                id = 14,
                "Big burger",
                12.40,
                "burgers",
                "Wheat bun, chicken & beef cutlets, iceberg lettuce, onion, cheddar cheese, tomatoes, pickles, burger sauce",
                R.drawable.food_burger_7,
                "Homemade fresh bun, two juicy beef patties, cheddar cheese and scrambled eggs dressed with barbecue and tartar sauces",
                "10 min",
                4.9,
                "530 ccal"
            ),
            Product(
                id = 15,
                "Only cheese",
                7.90,
                "burgers",
                "Wheat bun, cheese cutlet, iceberg lettuce, onion, cheddar cheese, tomatoes, burger sauce",
                R.drawable.food_burger_8,
                "Delicate breaded cheese cutlet, which includes gouda, philadelphia and dor blue cheeses, combined with fresh vegetables, cheese sauce and homemade bun",
                "10 min",
                4.2,
                "330 ccal"
            ),
            Product(
                id = 16,
                "Philadelphia roll",
                20.90,
                "sushi",
                "Salmon, philadelphia cheese, soy sauce",
                R.drawable.food_sushi_1,
                "The most famous roll in the world and in our online restaurant too. Taste the classics!",
                "15 min",
                5.0,
                "430 ccal"
            ),
            Product(
                id = 17,
                "California roll",
                18.20,
                "sushi",
                "Sticks \"Snow Crab\", red tobiko, avocado, cucumber, soy sauce",
                R.drawable.food_sushi_2,
                "The famous roll cooked with rice outside, with snow crab, cucumber and avocado",
                "15 min",
                4.9,
                "420 ccal"
            ),
            Product(
                id = 18,
                "Black Dragon roll",
                24.70,
                "sushi",
                "Acne, caviar masago, avocado, sesame seeds, unagi sauce",
                R.drawable.food_sushi_3,
                "A roll skillfully combined: eel, avocado and masago caviar, covered with sesame seeds and unagi sauce",
                "15 min",
                5.0,
                "340 ccal"
            ),
            Product(
                id = 19,
                "Hot Fila roll",
                23.20,
                "sushi",
                "Salmon, philadelphia cheese, cucumber, egg, tempura flour",
                R.drawable.food_sushi_4,
                "Warm roll fried in tempura batter with a classic combination of salmon, Philadelphia and cucumber",
                "10 min",
                4.7,
                "640 ccal"
            ),
            Product(
                id = 20,
                "Ebi roll",
                25.20,
                "sushi",
                "Tiger shrimp, caviar masago, philadelphia cheese, cucumber, soy sauce",
                R.drawable.food_sushi_5,
                "Roll covered with tiger shrimp, with Philadelphia cheese, cucumber and masago caviar inside",
                "10 min",
                4.8,
                "360 ccal"
            ),
            Product(
                id = 21,
                "Little roll set",
                40.20,
                "sushi",
                "Black Dragon roll, caviar, salmon, tiger shrimp, wasabi, soy sauce",
                R.drawable.food_sushi_6,
                "Everything as you like ;)",
                "10 min",
                4.6,
                "520 ccal"
            ),
            Product(
                id = 22,
                "Classic roll set",
                69.90,
                "sushi",
                "Philadelphia roll, California roll, Black Dragon roll, Hot Fila, soy sauce",
                R.drawable.food_sushi_7,
                "Set of 4 rolls with classic ingredients: combination of salmon and Philadelphia, snow crab and avocado, eel and masago caviar",
                "20 min",
                5.0,
                "860 ccal"
            ),
            Product(
                id = 23,
                "Fantastic Shrimp roll set",
                54.90,
                "sushi",
                "Philadelphia roll, California roll, Ebi roll, soy sauce",
                R.drawable.food_sushi_8,
                "Set of 4 rolls, which contains dishes with tiger prawns in various combinations: with avocado, salmon and Philadelphia",
                "15 min",
                4.8,
                "560 ccal"
            ),
            Product(
                id = 24,
                "Thai vegetable soup",
                9.90,
                "soup",
                "Champignons, bulgarian pepper, broccoli, vegetable cream, pasta tom yum",
                R.drawable.food_soup_1,
                "Fresh vegetables boiled in the best traditions of oriental cuisine. Seasoned with a delicious and healthy selection of spicy and spicy pastes like Tom Yum and Chili Paste",
                "10 min",
                4.5,
                "260 ccal"
            ),
            Product(
                id = 25,
                "Mushroom cream soup",
                12.90,
                "soup",
                "Champignons, onion, sunflower oil, vegetable cream",
                R.drawable.food_soup_2,
                "A traditional recipe for vegetable cream soup with champignons and onions",
                "20 min",
                4.8,
                "760 ccal"
            ),
            Product(
                id = 26,
                "Borscht with veal",
                10.40,
                "soup",
                "Veal, carrot, parsley, garlic, onion, cabbage, potato, beet, tomato paste, sour cream",
                R.drawable.food_soup_3,
                "A traditional dish of Ukrainian cuisine with pieces of veal in our performance, which is served separately with sour cream, lard pate and fresh tortilla from the oven",
                "30 min",
                5.0,
                "740 ccal"
            ),
            Product(
                id = 27,
                "Pea soup",
                11.70,
                "soup",
                "Ham, bacon, hunting sausages, peas, potato, carrot, onion, crackers, parsley",
                R.drawable.food_soup_4,
                "Nutritious pea soup with pieces of bacon, hunting sausages and ham. Served with crackers in a separate package",
                "25 min",
                4.9,
                "670 ccal"
            ),
            Product(
                id = 28,
                "Solyanka soup",
                10.90,
                "soup",
                "Ham, bacon, smoked chicken, hunting sausages, olives, pickles, onion, lemon, tomato pasta, sour cream",
                R.drawable.food_soup_5,
                "Nutritious tomato paste soup with smoked chicken, sausages, bacon and pickled cucumbers. We put sour cream in a separate container",
                "20 min",
                5.0,
                "640 ccal"
            ),
            Product(
                id = 29,
                "Tom Yum Soup",
                11.90,
                "soup",
                "Salmon, tiger shrimp, fish broth, champignons, rice, chili paste, Pasta Tom yum",
                R.drawable.food_soup_6,
                "The classic Thai soup in fish broth combines spiciness and lightness, and also includes mushrooms, wakame seaweed and boiled tiger shrimp. Rice for soup is served in a separate box",
                "30 min",
                4.5,
                "220 ccal"
            ),
            Product(
                id = 29,
                "Tom Yum Soup",
                11.90,
                "soup",
                "Salmon, tiger shrimp, fish broth, champignons, rice, chili paste, Pasta tom yum",
                R.drawable.food_soup_6,
                "The classic Thai soup in fish broth combines spiciness and lightness, and also includes mushrooms, wakame seaweed and boiled tiger shrimp. Rice for soup is served in a separate box",
                "30 min",
                4.5,
                "220 ccal"
            ),
            Product(
                id = 30,
                "Cheese sticks",
                7.90,
                "snack",
                "Gouda cheese, rusks panko, egg",
                R.drawable.food_snack_1,
                "Deep-fried gouda cheese in a batter of tempura flour, egg and panko",
                "10 min",
                5.0,
                "530 ccal"
            ),
            Product(
                id = 31,
                "Chicken nuggets",
                9.90,
                "snack",
                "Chicken fillet, rusks panko, egg",
                R.drawable.food_snack_2,
                "A popular snack in our performance is chicken fillet in a crispy breading made from tempura flour, eggs and panko crackers. It remains only to choose the sauce to taste: spicy, salty or sweet",
                "10 min",
                5.0,
                "560 ccal"
            ),
            Product(
                id = 32,
                "Shrimp tempura",
                10.90,
                "snack",
                "Tiger shrimp, rusks panko, egg, paprika",
                R.drawable.food_snack_3,
                "7 shrimp in batter, deep fried. Weight is approximate, may vary due to batter",
                "10 min",
                5.0,
                "770 ccal"
            ),
            Product(
                id = 33,
                "Squid tempura",
                12.90,
                "snack",
                "Squid, rusks panko, egg",
                R.drawable.food_snack_4,
                "Calamari battered with tempura flour, panko breadcrumbs and deep fried eggs",
                "10 min",
                5.0,
                "690 ccal"
            ),
            Product(
                id = 34,
                "Pancakes with nutella and banana",
                15.40,
                "dessert",
                "Damn tamago, banana, nutella, almond shavings",
                R.drawable.food_dessert_1,
                "Pancakes with banana, Nutella cream and flaked almonds",
                "10 min",
                4.7,
                "630 ccal"
            ),
            Product(
                id = 35,
                "Cheesecakes with mango-orange sauce",
                12.40,
                "dessert",
                "Cottage cheese, egg, flour, mango orange sauce, sour cream, sugar, mint",
                R.drawable.food_dessert_2,
                "Serve with sour cream",
                "15 min",
                5.0,
                "390 ccal"
            ),
            Product(
                id = 36,
                "Mango caramel cheesecake",
                14.40,
                "dessert",
                "Philadelphia cheese, cream, cookie, egg, mango orange sauce, salty caramel, caramel shavings, sugar",
                R.drawable.food_dessert_3,
                "The famous cheese dessert, based on Philadelphia cheese and cream stuffed with mango-orange jam, is decorated with salted caramel and caramel chips",
                "20 min",
                5.0,
                "700 ccal"
            ),
            Product(
                id = 37,
                "Curd balls",
                10.40,
                "dessert",
                "Curd mousse, egg, peanut, strawberry sauce, cornflakes",
                R.drawable.food_dessert_4,
                "Cottage cheese mousse fried in a batter of corn flakes, peanuts, eggs and tempura flour, served with strawberry sauce in a separate container",
                "20 min",
                5.0,
                "700 ccal"
            ),
            Product(
                id = 38,
                "Roll with banana and mango",
                12.40,
                "dessert",
                "Pancake tamago, curd mousse, banana, mango, chocolate sauce",
                R.drawable.food_dessert_5,
                "Sweet roll with cottage cheese mousse and fruit in a tamago pancake. Served with chocolate sauce in a separate container",
                "20 min",
                5.0,
                "700 ccal"
            ),
            Product(
                id = 38,
                "Roll with banana and mango",
                12.40,
                "dessert",
                "Pancake tamago, curd mousse, banana, mango, chocolate sauce",
                R.drawable.food_dessert_5,
                "Sweet roll with cottage cheese mousse and fruit in a tamago pancake. Served with chocolate sauce in a separate container",
                "10 min",
                5.0,
                "670 ccal"
            ),
            Product(
                id = 39,
                "Pancakes with apple and cinnamon",
                9.90,
                "dessert",
                "Pancake tamago, curd mousse, banana, mango, chocolate sauce",
                R.drawable.food_dessert_6,
                "Sweet pancakes stuffed with juicy apples and fragrant cinnamon, covered with chocolate sauce",
                "15 min",
                4.6,
                "470 ccal"
            ),
            Product(
                id = 40,
                "Lemonade",
                1.90,
                "drink",
                "Orange & lemon peel, orange & lemon fresh, mint, sugar",
                R.drawable.food_drink_1,
                "Branded drink based on orange and lemon juice",
                "5 min",
                5.0,
                "200 ccal"
            ),
            Product(
                id = 41,
                "Mango-orange",
                1.90,
                "drink",
                "Orange fresh, mango puree, mint, sugar",
                R.drawable.food_drink_2,
                "Signature drink with mango flavor based on fresh orange juice and mineral water",
                "5 min",
                5.0,
                "200 ccal"
            ),
            Product(
                id = 42,
                "Cranberry-basil",
                1.90,
                "drink",
                "Cranberry, basil, sugar",
                R.drawable.food_drink_3,
                "Signature drink based on cranberries and fresh basil",
                "5 min",
                5.0,
                "200 ccal"
            ),
            Product(
                id = 43,
                "Borjomi",
                1.40,
                "drink",
                "Borjomi",
                R.drawable.food_drink_4,
                "Natural bicarbonate sodium mineral water",
                "-",
                5.0,
                "5 ccal"
            ),
            Product(
                id = 44,
                "Pepsi",
                1.00,
                "drink",
                "Pepsi",
                R.drawable.food_drink_5,
                "Non-alcoholic carbonated drink",
                "-",
                5.0,
                "250 ccal"
            ),
            Product(
                id = 44,
                "Coca-Cola",
                1.00,
                "drink",
                "Coke",
                R.drawable.food_drink_6,
                "Non-alcoholic carbonated drink",
                "-",
                5.0,
                "250 ccal"
            ),
            Product(
                id = 44,
                "Fanta",
                1.00,
                "drink",
                "Fanta",
                R.drawable.food_drink_7,
                "Non-alcoholic carbonated drink",
                "-",
                5.0,
                "250 ccal"
            ),
            Product(
                id = 44,
                "Sprite",
                1.00,
                "drink",
                "Sprite",
                R.drawable.food_drink_8,
                "Non-alcoholic carbonated drink",
                "-",
                5.0,
                "250 ccal"
            ),
        )
    }
}
