package screens.expenses.models

import screens.models.ActionDate
import screens.models.ExpensesStateScreen
import screens.models.TypePeriod
import screens.models.TypeTab

sealed class ExpensesEvent {
    data class OnCategoryClick(val category: TypePeriod) : ExpensesEvent()
    data class OnDateChange(val actionDate: ActionDate) : ExpensesEvent()
    data class OnTabChange(val typeTab: TypeTab) : ExpensesEvent()
    data class OnStateScreenChange(val stateScreen: ExpensesStateScreen) : ExpensesEvent()

    data class OnSumChange(val text: String) : ExpensesEvent()

}