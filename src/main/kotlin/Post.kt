//package ru.netology

import java.util.*

data class Post(
    var id: Int,
    var ownerId: Int,
    var fromId: Int,
    var cratedBy: Int,
    var date: Int,
    var text: String,
    var replyOwnerId: Int,
    var replyPostId: Int,
    var friendsOnly: Boolean,
    var comments: Objects,
    var copyright: String,
    var likes: Int,
    var reposts: Objects,
    var views: Objects,
    var postType: String,
    var signerId: Int,
    var canPin: Boolean,
    var canDelete: Boolean,
    var canEdit: Boolean,
    var isPinned: Boolean,
    var markedAsAds: Boolean,
    var isFavorite: Boolean,
    var postponnedId: Int
){}

