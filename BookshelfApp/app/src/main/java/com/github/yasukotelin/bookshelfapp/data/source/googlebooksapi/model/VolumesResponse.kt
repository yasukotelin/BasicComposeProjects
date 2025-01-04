package com.github.yasukotelin.bookshelfapp.data.source.googlebooksapi.model

import kotlinx.serialization.Serializable

@Serializable
data class VolumesResponse(
    val kind: String,
    val totalItems: Int,
    val items: List<BookItem>
)

@Serializable
data class BookItem(
    val kind: String,
    val id: String,
    val etag: String,
    val selfLink: String,
    val volumeInfo: VolumeInfo,
    val saleInfo: SaleInfo,
    val accessInfo: AccessInfo,
    val searchInfo: SearchInfo? = null
)

@Serializable
data class VolumeInfo(
    val title: String,
    val subtitle: String? = null,
    val authors: List<String>? = null,
    val publisher: String? = null,
    val publishedDate: String? = null,
    val description: String? = null,
    val industryIdentifiers: List<IndustryIdentifier>? = null,
    val readingModes: ReadingModes,
    val pageCount: Int? = null,
    val printType: String,
    val averageRating: Int? = null,
    val ratingsCount: Int? = null,
    val categories: List<String>? = null,
    val maturityRating: String,
    val allowAnonLogging: Boolean,
    val contentVersion: String,
    val panelizationSummary: PanelizationSummary? = null,
    val imageLinks: ImageLinks? = null,
    val language: String,
    val previewLink: String,
    val infoLink: String,
    val canonicalVolumeLink: String
)

@Serializable
data class IndustryIdentifier(
    val type: String,
    val identifier: String
)

@Serializable
data class ReadingModes(
    val text: Boolean,
    val image: Boolean
)

@Serializable
data class PanelizationSummary(
    val containsEpubBubbles: Boolean,
    val containsImageBubbles: Boolean
)

@Serializable
data class ImageLinks(
    val smallThumbnail: String,
    val thumbnail: String
)

@Serializable
data class SaleInfo(
    val country: String,
    val saleability: String,
    val isEbook: Boolean,
    val listPrice: Price? = null,
    val retailPrice: Price? = null,
    val buyLink: String? = null,
    val offers: List<Offer>? = null
)

@Serializable
data class Price(
    val amount: Double,
    val currencyCode: String
)

@Serializable
data class Offer(
    val finskyOfferType: Int,
    val listPrice: PriceInOffer,
    val retailPrice: PriceInOffer,
    val rentalDuration: RentalDuration? = null
)

@Serializable
data class PriceInOffer(
    val amountInMicros: Long,
    val currencyCode: String
)

@Serializable
data class RentalDuration(
    val unit: String,
    val count: Int
)

@Serializable
data class AccessInfo(
    val country: String,
    val viewability: String,
    val embeddable: Boolean,
    val publicDomain: Boolean,
    val textToSpeechPermission: String,
    val epub: FormatInfo,
    val pdf: FormatInfo,
    val webReaderLink: String,
    val accessViewStatus: String,
    val quoteSharingAllowed: Boolean
)

@Serializable
data class FormatInfo(
    val isAvailable: Boolean,
    val acsTokenLink: String? = null
)

@Serializable
data class SearchInfo(
    val textSnippet: String
)
