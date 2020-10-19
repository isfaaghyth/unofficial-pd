package app.isfaaghyth.home

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRowFor
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import app.isfaaghyth.home.data.Article
import app.isfaaghyth.home.data.User

@Composable
fun LazyArticlesItem(articles: List<Article>) {
    MaterialTheme {
        LazyRowFor(items = articles) {
            ArticleCard(article = it)
        }
    }
}

@Composable
fun ArticleCard(article: Article) {
    Card(elevation = 2.dp) {
        Row(
            verticalGravity = CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Column {
                Text(
                    text = article.user?.username?: "",
                    fontWeight = FontWeight.Light,
                    fontSize = 12.sp
                )
                Text(
                    text = article.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                Text(
                    text = "Dimasukkan oleh ${article.user?.fullName?: ""}",
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewArticleList() {
    val articles = listOf(
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

    LazyArticlesItem(articles)
}