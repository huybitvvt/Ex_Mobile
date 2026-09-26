package com.huybitvvt.bt02

import android.app.Activity
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.Space
import android.widget.TextView

// Sinh vien: Nguyen Doan Huy - BIT240115
class MainActivity : Activity() {
    private lateinit var selectedText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = Color.WHITE
        window.navigationBarColor = Color.WHITE
        window.decorView.systemUiVisibility =
            View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR

        val screen = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(16), dp(12), dp(16), dp(10))
            setBackgroundColor(Color.WHITE)
        }

        screen.addView(numberTile("1", "#1D7BF2"), tileParams(96, 12))
        screen.addView(numberTile("2", "#F53235"), tileParams(96, 12))
        screen.addView(createMiddleRow(), tileParams(170, 12))
        screen.addView(numberTile("6", "#FF760D"), tileParams(145, 0))
        screen.addView(Space(this), LinearLayout.LayoutParams(1, 0, 1f))
        screen.addView(createStudentInfo())

        setContentView(screen)
    }

    private fun createMiddleRow(): LinearLayout {
        return LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            addView(numberTile("3", "#FFD21A", Color.BLACK), weightedTileParams(12))
            addView(numberTile("4", "#2BB36A"), weightedTileParams(12))
            addView(numberTile("5", "#7B3BDA"), weightedTileParams(12))
            addView(Space(this@MainActivity), weightedTileParams(0))
        }
    }

    private fun createStudentInfo(): LinearLayout {
        val name = TextView(this).apply {
            text = "Nguyễn Doãn Huy - BIT240115"
            textSize = 22f
            setTextColor(Color.rgb(64, 64, 64))
            setTypeface(typeface, Typeface.BOLD)
            gravity = Gravity.CENTER
        }

        selectedText = TextView(this).apply {
            textSize = 13f
            setTextColor(Color.rgb(128, 128, 128))
            gravity = Gravity.CENTER
            visibility = View.GONE
        }

        return LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(0, 0, 0, dp(6))
            addView(name)
            addView(selectedText, LinearLayout.LayoutParams(-1, -2).apply {
                topMargin = dp(5)
            })
        }
    }

    private fun numberTile(
        number: String,
        color: String,
        textColor: Int = Color.WHITE
    ): TextView {
        return TextView(this).apply {
            text = number
            textSize = 60f
            setTextColor(textColor)
            setTypeface(typeface, Typeface.BOLD)
            gravity = Gravity.CENTER
            background = GradientDrawable().apply {
                setColor(Color.parseColor(color))
                cornerRadius = dp(2).toFloat()
            }
            isClickable = true
            isFocusable = true
            contentDescription = "Ô số $number"
            setOnClickListener {
                selectedText.text = "Đã chọn ô $number"
                selectedText.visibility = View.VISIBLE
                alpha = 0.72f
                animate().alpha(1f).setDuration(160).start()
            }
        }
    }

    private fun tileParams(heightDp: Int, bottomMarginDp: Int) =
        LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, dp(heightDp)).apply {
            bottomMargin = dp(bottomMarginDp)
        }

    private fun weightedTileParams(endMarginDp: Int) =
        LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, 1f).apply {
            marginEnd = dp(endMarginDp)
        }

    private fun dp(value: Int): Int =
        (value * resources.displayMetrics.density).toInt()
}

