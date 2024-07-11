package features.expenses.models

import expensenotes.composeapp.generated.resources.Res
import expensenotes.composeapp.generated.resources.home_24dp
import expensenotes.composeapp.generated.resources.local_shipping_24dp
import expensenotes.composeapp.generated.resources.restaurant_24dp
import expensenotes.composeapp.generated.resources.tag_car
import expensenotes.composeapp.generated.resources.tag_food
import expensenotes.composeapp.generated.resources.tag_home
import expensenotes.composeapp.generated.resources.tag_wife
import expensenotes.composeapp.generated.resources.woman_24dp
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.StringResource


interface Tag {
    @OptIn(ExperimentalResourceApi::class)
     val name:  StringResource
    @OptIn(ExperimentalResourceApi::class)
     val icon:  DrawableResource
     val tagName:  String
}

@OptIn(ExperimentalResourceApi::class)
sealed class ExpensesTag : Tag {
    override val name = Res.string.tag_home
    override val icon = Res.drawable.restaurant_24dp
    override val tagName =  "home"

    data class Home(
        override val name: StringResource = Res.string.tag_home,
        override val icon: DrawableResource = Res.drawable.home_24dp,
        override val tagName: String =  "home",
    ) : ExpensesTag()

    data class Food(
        override val name: StringResource = Res.string.tag_food,
        override val icon: DrawableResource = Res.drawable.restaurant_24dp,
        override val tagName: String =  "food",
    ) : ExpensesTag()

    data class Wife(
        override val name: StringResource = Res.string.tag_wife,
        override val icon: DrawableResource = Res.drawable.woman_24dp,
        override val tagName: String =  "wife",
    ) : ExpensesTag()

    data class Car(
        override val name: StringResource = Res.string.tag_car,
        override val icon: DrawableResource = Res.drawable.local_shipping_24dp,
        override val tagName: String =  "car",
    ) : ExpensesTag();
}

fun getExpensesTags() =
    listOf(ExpensesTag.Home(), ExpensesTag.Food(), ExpensesTag.Wife(), ExpensesTag.Car())