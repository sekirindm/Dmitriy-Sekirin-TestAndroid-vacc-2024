package com.example.premierconsultproject.presentation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.premierconsultproject.R
import com.example.premierconsultproject.data.network.model.Products
import com.example.premierconsultproject.databinding.FragmentListItemBinding
import com.example.premierconsultproject.di.App
import com.example.premierconsultproject.presentation.adapters.ItemListAdapter
import com.example.premierconsultproject.presentation.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class ListItemFragment : Fragment() {

    private var _binding: FragmentListItemBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView

    private val viewModel by viewModel<MainViewModel>()

    private val adapter = ItemListAdapter { products ->
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.container, DetailInfoFragment.newInstance(products))
            .addToBackStack(null)
            .commit()
        Log.d("products", "$products")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListItemBinding.inflate(inflater, container, false)

        Log.d("ListItemFragment", "is ListItemFragment")
        initialize()
        initRecyclerView()
        initObserve()
        viewModel.fetchData()
        return binding.root
    }

    private fun initialize() {
        recyclerView = binding.rvMain
    }

    private fun initRecyclerView() {
        val layoutManager = LinearLayoutManager(requireActivity())
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }

    private fun initObserve() {
        viewModel.products.observe(viewLifecycleOwner) { data ->
            productsSubmit(data)
        }
    }

    private fun productsSubmit(products: List<Products>) {
        val submitList = products.map { ItemsList.ProductsItemList(it) }
        adapter.submitList(submitList)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}