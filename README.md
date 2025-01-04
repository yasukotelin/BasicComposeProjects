# BasicComposeProjects

『COMPOSE を用いた ANDROID アプリ開発の基礎』のプロジェクト課題レビュー参考用プロジェクト

## ユニット1: 名刺アプリを作成する

- サンプルコード: [BuisinessCardApp](https://github.com/yasukotelin/BasicComposeProjects/tree/main/BusinessCardApp)
- [プロジェクト課題ページ](https://developer.android.com/codelabs/basic-android-kotlin-compose-business-card?hl=ja&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%3Fhl%3Dja%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-business-card#0)

<img src="./BusinessCardApp/img/Screenshot_20241228_002445.png" width="220px" />

## ユニット2: アートスペース アプリを作成する

- サンプルコード: [ArtSpaceApp](https://github.com/yasukotelin/BasicComposeProjects/tree/main/ArtSpaceApp)
- [プロジェクト課題ページ](https://developer.android.com/codelabs/basic-android-kotlin-compose-art-space?hl=ja&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-3%3Fhl%3Dja%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-art-space#0)

<img src="./ArtSpaceApp//img/Screen_recording_20241229_004034.gif" width="220px" />

## ユニット3: 30 日間アプリの作成

- サンプルコード: [30DaysOfDiary](https://github.com/yasukotelin/BasicComposeProjects/tree/main/30DaysOfDiary)
- [プロジェクト課題ページ](https://developer.android.com/codelabs/basic-android-kotlin-compose-30-days?hl=ja&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-3%3Fhl%3Dja%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-30-days#0)

<div>
<img src="./30DaysOfDiary/img/Screenshot_20241229_025817.png" width="220px" />
<img src="./30DaysOfDiary/img/Screenshot_20241229_025852.png" width="220px" />
</div>

## ユニット4: My City アプリを作成する

- サンプルコード: [MyCityApp](https://github.com/yasukotelin/BasicComposeProjects/tree/main/MyCityApp)
- [プロジェクト課題ページ](https://developer.android.com/codelabs/basic-android-kotlin-compose-my-city?hl=ja&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-4-pathway-3%3Fhl%3Dja%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-my-city#0)

<div>
<img src="./MyCityApp/img/Screenshot_20241230_160741.png" width="220px" />
<img src="./MyCityApp/img/Screenshot_20241230_160818.png" width="220px" />
<img src="./MyCityApp/img/Screenshot_20241230_160853.png" width="220px" />
</div>

## ユニット5: Bookshelfアプリの作成

- サンプルコード: [BookshelfApp](https://github.com/yasukotelin/BasicComposeProjects/tree/main/BookshelfApp)
- [プロジェクト課題ページ](https://developer.android.com/codelabs/basic-android-kotlin-compose-bookshelf?hl=ja&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-5-pathway-2%3Fhl%3Dja%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-bookshelf#0)

<div>
<img src="./BookshelfApp/img/Screenshot_20250105_011224.png" width="220px" />
</div

### Points

- グリット表示
- Google Boooks APIを活用したAPI通信
    - Retrofit2を使ったHTTPS通信
    - kotlinx.serializerを使ったJSONパース処理
- Coilを使ってネットワーク画像の表示
- Hiltを使ったDI処理
- ViewModel
- StateFlow
- データレイヤーを意識したパッケージ構成
- navigation composeを使った画面遷移
    - 理想はリスト表示と詳細表示だが画像表示だけでも結構大変だと思うので無しでOK