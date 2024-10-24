package com.nadila.UtsNadila

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nadila.UtsNadila.Adapter.AdapterMakanan
import com.nadila.UtsNadila.Model.ModelMakanan

class Makanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makanan)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val items = listOf(
            ModelMakanan("Chicken Curry", "Delicious spicy chicken curry.", R.drawable.img_2),
            ModelMakanan("Chicken Burger", "Tasty chicken burger with fresh vegetables.",
                R.drawable.img_3
            ),
            ModelMakanan("Broccoli Lasagna", "Healthy broccoli lasagna.", R.drawable.img_4),
            ModelMakanan("Mexican Appetizer", "Mexican style nachos with dips.", R.drawable.img_5),
            ModelMakanan("Broccoli Lasagna", "Another healthy broccoli lasagna.", R.drawable.img_6),
            ModelMakanan("Broccoli Lasagna", "Yet another version of broccoli lasagna.", R.drawable.img_7)
        )
        val adapter = AdapterMakanan(items)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter
    }
}