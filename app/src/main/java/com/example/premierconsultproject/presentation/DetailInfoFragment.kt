package com.example.premierconsultproject.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.premierconsultproject.R
import com.example.premierconsultproject.data.network.model.Products
import com.example.premierconsultproject.databinding.FragmentDetailInfoBinding
import com.squareup.picasso.Picasso

class DetailInfoFragment : Fragment() {

    private var _binding: FragmentDetailInfoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailInfoBinding.inflate(inflater, container, false)
        val product =arguments?.getParcelable<Products>("product")

        with(binding) {
            tvTitleDetail.text = product?.title
            tvPriceDetail.text = product?.price?.toString() + "$"
            tvDescriptionsDetail.text = product?.description
            tvRankDetail.text =product?.rating?.rate.toString()
            Picasso.with(context).load(product?.image).into(ivImageDetail)
        }

        return binding.root
    }

    companion object {
        fun newInstance(product: Products): DetailInfoFragment {
            val fragment = DetailInfoFragment()
            val args = Bundle()
            args.putParcelable("product", product)
            fragment.arguments = args
            return fragment
        }
    }
}