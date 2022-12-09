package com.example.assignment6_cv_builder.ui.work


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment6_cv_builder.R
import com.example.assignment6_cv_builder.data.Work

class WorkFragment : Fragment(R.layout.fragment_work) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val workRecyclerView: RecyclerView = view.findViewById(R.id.work_recycler_view)
        val adapter = WorkAdapter(Work.getWorkList())
        workRecyclerView.adapter = adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = WorkFragment()
    }
}