package com.example.nttdata.model

data class News(
    val id: Int,
    val title: String,
    val description: String,
    val content: String,
    val imageUrl: String? = null,
    val publishDate: String
)

// Sample data for testing
object NewsSampleData {
    val sampleNews = listOf(
        News(
            id = 1,
            title = "New Technology Breakthrough",
            description = "Scientists discover revolutionary technology that could change the future.",
            content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam auctor, nisl eget ultricies tincidunt, nisl nisl aliquam nisl, eget ultricies nisl nisl eget nisl. Nullam auctor, nisl eget ultricies tincidunt, nisl nisl aliquam nisl, eget ultricies nisl nisl eget nisl.",
            publishDate = "2025-07-28"
        ),
        News(
            id = 2,
            title = "Global Economic Summit",
            description = "World leaders gather to discuss economic challenges and opportunities.",
            content = "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
            publishDate = "2025-07-29"
        ),
        News(
            id = 3,
            title = "Sports Championship Results",
            description = "Final results from the international sports championship.",
            content = "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.",
            publishDate = "2025-07-30"
        ),
        News(
            id = 4,
            title = "Health Research Findings",
            description = "New study reveals important health insights for the general population.",
            content = "Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem.",
            publishDate = "2025-07-25"
        ),
        News(
            id = 5,
            title = "Entertainment Industry Updates",
            description = "Latest news from the entertainment world and upcoming releases.",
            content = "Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?",
            publishDate = "2025-07-27"
        )
    )
}