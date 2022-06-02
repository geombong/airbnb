package com.example.todo.airbnb.presentation.search.date.components

import com.example.todo.airbnb.data.datasource.CalendarYear
import com.example.todo.airbnb.data.datasource.MonthOfYear
import java.util.*

data class DaySelected(
    val day: Int,
    val month: CalendarMonth,
    val year: CalendarYear,
) {
    val calendarDay = lazy {
        month.getDay(day)
    }

    override fun toString(): String {
        return "${MonthOfYear.formatMonth(month.name)}월 ${day}일"
    }

    operator fun compareTo(other: DaySelected): Int {
        if (day == other.day && month == other.month) return 0
        if (month == other.month) return day.compareTo(other.day)
        return (year.indexOf(month)).compareTo(
            year.indexOf(other.month)
        )
    }
}

val DaySelectedEmpty =
    DaySelected(0, CalendarMonth("", "", 0, 0, DayOfWeek.Sunday), emptyList())