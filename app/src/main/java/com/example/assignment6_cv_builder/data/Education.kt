package com.example.assignment6_cv_builder.data

import com.example.assignment6_cv_builder.R

data class Education(
    val collegeName: String,
    val program: String,
    val logo: Int
) {

    companion object {
        fun getEducationList() : MutableList<Education> {
            return mutableListOf(
                Education(
                    "Maharishi Internation University",
                    "Master's in Computer Science",
                    R.drawable.miu
                ),
                Education(
                    "Patan Multiple Campus",
                    "Bachelor's in Computer Science and Information Technology",
                    R.drawable.pmc
                )
            )
        }
    }
}
