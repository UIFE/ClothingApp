package com.uife.clothesapp.binding

import android.graphics.Typeface
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter

@BindingAdapter("app:setImageFromName")
fun setImage(view: ImageView, imageName: String) {
    val context = view.context
    val resourceId = context.resources.getIdentifier(
        imageName, "drawable", view.context.packageName
    )

    view.setImageDrawable(
        ContextCompat.getDrawable(context, resourceId)
    )
}

@BindingAdapter("app:setColorFromName")
fun setColor(view: View, colorName: String) {
    val context = view.context
    val resourceId = context.resources.getIdentifier(
        colorName, "color", view.context.packageName
    )

    view.backgroundTintList = ContextCompat.getColorStateList(context, resourceId)
}

