package app.isfaaghyth.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.setContent
import app.isfaaghyth.home.data.Article
import app.isfaaghyth.home.data.User

class MainActivity: AppCompatActivity() {

    private val articles = listOf(
        Article(
            title = "Productivity App UI using React Native and Expo",
            user = User(fullName = "Isfhani Ghiath", username = "isfaaghyth")
        ),
        Article(
            title = "Productivity App UI using React Native and Expo",
            user = User(fullName = "Isfhani Ghiath", username = "isfaaghyth")
        ),
        Article(
            title = "Productivity App UI using React Native and Expo",
            user = User(fullName = "Isfhani Ghiath", username = "isfaaghyth")
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { LazyArticlesItem(articles = articles) }
    }

}