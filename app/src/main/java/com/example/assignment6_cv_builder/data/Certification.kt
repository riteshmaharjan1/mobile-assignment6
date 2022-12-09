package com.example.assignment6_cv_builder.data

import com.example.assignment6_cv_builder.R

data class Certification(
    val logo: Int,
    val name: String
) {
    companion object {
        fun getCertificateList(): MutableList<Certification> {
            return mutableListOf(
                Certification(
                    R.drawable.aws,
                    "AWS Certified Developer - Associate."
                ),
                Certification(
                    R.drawable.scrum,
                    "Scrum Master Certification"
                )
            )
        }
    }
}
