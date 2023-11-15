package christmas.domain

class EventBadgeManager {
    fun createBadge(totalDiscount: Int): Badge {
        return Badge.entries.first { badge ->
            badge.hasRequiredDiscount(totalDiscount)
        }
    }
}