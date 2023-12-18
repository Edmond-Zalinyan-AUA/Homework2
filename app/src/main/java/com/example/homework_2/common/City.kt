package com.example.homework_2.common

import com.example.homework_2.R
import java.util.Objects.nonNull

class City(
    var name: String? = null,
    var country: String? = null,
    var isCapital: Boolean? = null,
    var image: Int = R.drawable.ic_launcher_background,
    var temperature: Float? = null
) {
    fun description(): String {
        if (name == null)
            return "Unknown city"
        var description = ""
        if (isCapital!! && nonNull(country))
            description += "$name is the capital of $country."
        else if (nonNull(country))
            description += "$name is a city located in $country."
        description += " Very beautiful city to live in."
        return description
    }
}
