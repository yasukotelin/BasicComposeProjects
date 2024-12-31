package com.github.yasukotelin.mycityapp

import androidx.compose.ui.graphics.Color
import com.github.yasukotelin.mycityapp.model.Category
import com.github.yasukotelin.mycityapp.model.Location

private val categoryTouristSpot = Category(
    id = 2,
    name = "観光地",
    thumbnailColor = Color(0xff48c26e),
    locations = listOf(
        Location(
            id = 1,
            name = "東京タワー",
            description = "東京タワー（とうきょうタワー、英: Tokyo Tower）は、東京都港区芝公園にある総合電波塔。正式名称は日本電波塔（にっぽんでんぱとう）。",
            thumbnailColor = Color(0xffFA764F)
        ),
        Location(
            id = 2,
            name = "東京スカイツリー",
            description = "東京スカイツリー（とうきょうスカイツリー、英: TOKYO SKYTREE）は、東京都墨田区押上にある電波塔（送信所）。",
            thumbnailColor = Color(0xff4e8ccf)
        ),
        Location(
            id = 3,
            name = "日本武道館",
            description = "日本武道館（にっぽんぶどうかん、Nippon Budōkan）は、東京都千代田区北の丸公園2-3にある武道館。日本伝統の武道を普及奨励し、心身錬磨の大道場としての役割を担うことを設立趣旨とする。日本武道協議会加盟。武道以外の屋内競技場、多目的ホールとしても利用される。管理運営者は公益財団法人日本武道館。",
            thumbnailColor = Color(0xffe6b422)
        ),
        Location(
            id = 4,
            name = "東京ドイツ村",
            description = "東京ドイツ村（とうきょうドイツむら、英: Tokyo German Village）は、千葉県袖ケ浦市にあるテーマパーク。ドイツの風景や文化を再現した施設がある。",
            thumbnailColor = Color(0xffFA764F)
        ),
        Location(
            id = 5,
            name = "築地市場",
            description = "築地市場（つきじいちば、英: Tsukiji Market）は、東京都中央区築地にある市場。東京都心部の中央区築地に位置し、日本最大の卸売市場である。築地市場は、東京都内の飲食店や料理人、一般消費者に向けて、新鮮な魚介類や野菜、調味料などを卸売りする業者が集まる市場である。",
            thumbnailColor = Color(0xff4e8ccf)
        ),
        Location(
            id = 6,
            name = "東京国立博物館",
            description = "東京国立博物館（とうきょうこくりつはくぶつかん、英: Tokyo National Museum）は、東京都台東区上野公園にある日本の国立博物館。日本国内最大の美術館であり、日本国内最大の博物館である。",
            thumbnailColor = Color(0xffe6b422)
        ),
    )
)

private val categoryAmusementPark = Category(
    id = 3,
    name = "遊園地",
    thumbnailColor = Color(0xffbf5050),
    locations = listOf(
        Location(
            id = 11,
            name = "東京ディズニーランド",
            description = "東京ディズニーランド（Tokyo Disneyland）は、千葉県浦安市舞浜にあるディズニーパーク。東京ディズニーリゾート内に位置し、オリエンタルランドが運営している。",
            thumbnailColor = Color(0xffFA764F)
        ),
        Location(
            id = 12,
            name = "東京ディズニーシー",
            description = "東京ディズニーシー（Tokyo DisneySea）は、千葉県浦安市舞浜にあるディズニーパーク。東京ディズニーリゾート内に位置し、オリエンタルランドが運営している。",
            thumbnailColor = Color(0xff4e8ccf)
        ),
        Location(
            id = 13,
            name = "よみうりランド",
            description = "よみうりランド（よみうりランド、Yomiurirando）は、東京都稲城市にある遊園地。よみうりランド株式会社が運営している。",
            thumbnailColor = Color(0xffe6b422)
        ),
        Location(
            id = 14,
            name = "東京ドイツ村",
            description = "東京ドイツ村（とうきょうドイツむら、英: Tokyo German Village）は、千葉県袖ケ浦市にあるテーマパーク。ドイツの風景や文化を再現した施設がある。",
            thumbnailColor = Color(0xffFA764F)
        ),
        Location(
            id = 15,
            name = "東京ジョイポリス",
            description = "東京ジョイポリス（Tokyo Joypolis）は、東京都港区台場にあるセガの遊園地。セガエンタープライゼスが運営している。",
            thumbnailColor = Color(0xff4e8ccf)
        ),
        Location(
            id = 16,
            name = "東京サマーランド",
            description = "東京サマーランド（Tokyo Summerland）は、東京都あきる野市にある遊園地。株式会社サマーランドが運営している。",
            thumbnailColor = Color(0xffe6b422)
        ),
        Location(
            id = 17,
            name = "東京ジャンボフェリー",
            description = "東京ジャンボフェリー（Tokyo Jumbo Ferry）は、東京都港区台場にある遊覧船。株式会社東京ジャンボフェリーが運航している。",
            thumbnailColor = Color(0xffFA764F)
        ),
        Location(
            id = 18,
            name = "東京ドームシティ",
            description = "東京ドームシティ（Tokyo Dome City）は、東京都文京区後楽にある複合施設。株式会社東京ドームが運営している。",
            thumbnailColor = Color(0xff4e8ccf)
        ),
    )
)

private val categoryAquarium = Category(
    id = 4,
    name = "水族館",
    thumbnailColor = Color(0xff4e8ccf),
    locations = listOf(
        Location(
            id = 21,
            name = "アクアパーク品川",
            description = "アクアパーク品川（アクアパークしながわ、英: Aqua Park Shinagawa）は、東京都品川区にある水族館。株式会社サンシャインシティが運営している。",
            thumbnailColor = Color(0xffFA764F)
        ),
        Location(
            id = 22,
            name = "すみだ水族館",
            description = "すみだ水族館（すみだすいぞくかん、英: Sumida Aquarium）は、東京都墨田区押上にある水族館。株式会社サンシャインシティが運営している。",
            thumbnailColor = Color(0xff4e8ccf)
        ),
        Location(
            id = 23,
            name = "サンシャイン水族館",
            description = "サンシャイン水族館（サンシャインすいぞくかん、英: Sunshine Aquarium）は、東京都豊島区東池袋にある水族館。株式会社サンシャインシティが運営している。",
            thumbnailColor = Color(0xffe6b422)
        ),
        Location(
            id = 24,
            name = "しながわ水族館",
            description = "しながわ水族館（しながわすいぞくかん、英: Shinagawa Aquarium）は、東京都品川区にある水族館。株式会社サンシャインシティが運営している。",
            thumbnailColor = Color(0xffFA764F)
        ),
    )
)

private val categoryZoo = Category(
    id = 5,
    name = "動物園",
    thumbnailColor = Color(0xffe6b422),
    locations = listOf(
        Location(
            id = 31,
            name = "上野動物園",
            description = "上野動物園（うえのどうぶつえん、英: Ueno Zoo）は、東京都台東区上野恩賜公園にある動物園。東京都が運営している。",
            thumbnailColor = Color(0xffFA764F)
        ),
        Location(
            id = 32,
            name = "多摩動物公園",
            description = "多摩動物公園（たまどうぶつこうえん、英: Tama Zoological Park）は、東京都日野市にある動物園。東京都が運営している。",
            thumbnailColor = Color(0xff4e8ccf)
        ),
        Location(
            id = 33,
            name = "井の頭自然文化園",
            description = "井の頭自然文化園（いのかしらしぜんぶんかえん、英: Inokashira Park Zoo）は、東京都武蔵野市にある動物園。東京都が運営している。",
            thumbnailColor = Color(0xffe6b422)
        ),
    )
)

val categories = listOf(
    Category(
        id = 1,
        name = "すべて",
        thumbnailColor = Color(0xff6b32a8),
        locations = categoryTouristSpot.locations + categoryAmusementPark.locations + categoryAquarium.locations + categoryZoo.locations
    ),
    categoryTouristSpot,
    categoryAmusementPark,
    categoryAquarium,
    categoryZoo
)

