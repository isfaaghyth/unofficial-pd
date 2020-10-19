package app.isfaaghyth.home.data

data class Article(
    val title: String = "",
    val user: User? = null,
    val category: String = "",
    val slugs: List<Slug> = emptyList()
)