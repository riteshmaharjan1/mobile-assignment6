package com.example.assignment6_cv_builder.data

import com.example.assignment6_cv_builder.R

data class Work(
    val companyName: String,
    val fromDate: String,
    val toDate: String,
    val location: String,
    val logo: Int,
    val roles: String
) {
    companion object {
        fun getWorkList() : MutableList<Work> {
            return mutableListOf(
                Work(
                    "Novelty Technology",
                    "Dec 2016",
                    "Jan 2022",
                    "Charlotte, NC",
                    R.drawable.noveltytech,
                    "Senior Software Engineer"
                ),
                Work(
                    "SPI NEPAL",
                    "Nov 2014",
                    "Dec 2016",
                    "Kathmandu, Nepal",
                    R.drawable.spi,
                    "Software Engineer"
                ),
                Work(
                    "KRB Software Pvt. Ltd.",
                    "Nov 2012",
                    "Oct 2014",
                    "Kathmandu, Nepal",
                    R.drawable.krb,
                    "Associate Software Engineer"
                ),
            )
        }
    }
}
