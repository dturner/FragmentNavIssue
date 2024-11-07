package com.example.fragmentnavissue

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import androidx.fragment.compose.content
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController

class AFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = content {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Green),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "AFragment", fontSize = 30.sp)
            Button(
                modifier = Modifier.align(Alignment.BottomCenter),
                onClick = {
                    findNavController().navigate(
                        resId = R.id.bFragment,
                        args = null,
                        navOptions = NavOptions.Builder().apply {
                            setEnterAnim(R.anim.slide_in_right)
                            setExitAnim(R.anim.slide_out_left)
                            setPopExitAnim(R.anim.slide_out_right)
                            setPopEnterAnim(R.anim.slide_in_left)
                        }.build()
                    )
                }
            ) {
                Text(text = "Go to BFragment")
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()

        Log.d("AFragment", "BFragment - onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("AFragment", "BFragment - onDestroy")
    }
}