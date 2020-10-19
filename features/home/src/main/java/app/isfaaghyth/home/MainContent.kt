package app.isfaaghyth.home

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRowFor
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import app.isfaaghyth.home.data.Article
import app.isfaaghyth.home.data.User

@Composable
fun MyApp(articles: List<Article>) {
    MaterialTheme {
        ScrollableColumn(Modifier.fillMaxSize()) {
            LazyArticlesItem(articles)
        }
    }
}

@Composable
fun LazyArticlesItem(articles: List<Article>) {
    articles.forEach {
        ArticleCard(article = it)
    }
}

@Composable
fun ArticleCard(article: Article) {
    Card(
        elevation = 2.dp,
        modifier = Modifier.padding(4.dp)
    ) {
        Row(
            verticalGravity = CenterVertically,
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize()
        ) {
            Column {
                Text("@${article.user?.username?: ""}",
                    fontWeight = FontWeight.Light,
                    fontSize = 12.sp
                )
                Text(
                    text = article.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.preferredSize(10.dp))
                Text(
                    text = "Dimasukkan oleh ${article.user?.fullName?: ""}",
                    fontWeight = FontWeight.Normal,
                    fontSize = 10.sp,
                    color = Color.Gray
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

    MyApp(articles)
}