package com.example.homework_2.common

import java.util.Objects.nonNull

class City(
    var name: String? = null,
    var country: String? = null,
    var isCapital: Boolean? = null,
    var imagePath: String? = null
) {
    fun description(): String {
        if (name == null)
            return "Unknown city";
        var description = "";
        if (isCapital!! && nonNull(country))
            description += "$name is the capital of $country."
        else if (nonNull(country))
            description += "$name is a country located in $country."
        description += " Very beautiful city to live in."
        return description;
    }
}
