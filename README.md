## 概要

### mainブランチ
"Hello, World!"をSpringBootで出力させるファイル。

### greetingブランチ
- 作業過程で使ったブランチ。
- 当初はmainブランチに変更を加えたものをこちらで表示させる予定だった。
- しかし、ブランチの名前と内容が合わなかったので、ローカルのブランチ名を変更して別ブランチでpushした。
-  ~~今は消しても問題ない。~~ 作業の過程を残すために残している。

### characterブランチ
- キャラクターの名前と年齢を出力表示させるファイル。
- キャラクターを派閥ごとに分類して、リストに振り分けた。

 * * * 

## Postmanの実行結果のスクリーンショット

![greeting – GreetingApplication java  greeting main  2023_11_18 20_02_14](https://github.com/silvernyanko/assignment6/assets/145736051/82d6fd54-31b7-42a5-b1c3-735abec2d202)


 * * * 

## PostmanのBodyの詳細(JSON)

<details><summary>PostmanのBodyの詳細(JSON)</summary>

```
[
    {
        "factionalName": "麦わらの一味",
        "character": [
            {
                "name": "ルフィ",
                "age": 19
            },
            {
                "name": "ゾロ",
                "age": 21
            },
            {
                "name": "ナミ",
                "age": 20
            },
            {
                "name": "ウソップ",
                "age": 19
            },
            {
                "name": "サンジ",
                "age": 21
            },
            {
                "name": "チョッパー",
                "age": 17
            },
            {
                "name": "ロビン",
                "age": 30
            },
            {
                "name": "フランキー",
                "age": 36
            },
            {
                "name": "ブルック",
                "age": 90
            },
            {
                "name": "ジンベエ",
                "age": 46
            }
        ]
    },
    {
        "factionalName": "ライバル",
        "character": [
            {
                "name": "シャンクス",
                "age": 39
            },
            {
                "name": "ティーチ",
                "age": 40
            },
            {
                "name": "キッド",
                "age": 23
            },
            {
                "name": "ロー",
                "age": 26
            }
        ]
    },
    {
        "factionalName": "海軍",
        "character": [
            {
                "name": "サカズキ",
                "age": 55
            },
            {
                "name": "ガープ",
                "age": 78
            },
            {
                "name": "コビー",
                "age": 18
            }
        ]
    }
]
```
</details>

 * * * 

## curlのURL

curl --location 'http://localhost:8080/character'

 * * * 

## curlをターミナルで確認した結果

``` 
StatusCode        : 200
StatusDescription : 
Content           : [{"factionalName":"éº¦ã　　　//以下コピペ不可
RawContent        : HTTP/1.1 200 
                    Transfer-Encoding: chunked
                    Content-Type: application/json
                    Date: Sat, 18 Nov 2023 10:34:23 GMT

                    [{"factionalName":"éº¦ã　　　//以下コピペ不可
Forms             : {}
Headers           : {[Transfer-Encoding, chunked], [Content-Type, application/json], [Date, Sat, 18 Nov 2023 10:34:23 GMT]}
Images            : {}
InputFields       : {}
Links             : {}
ParsedHtml        : mshtml.HTMLDocumentClass
RawContentLength  : 676
``` 


 * * * 

## curlの実行結果のスクリーンショット

![greeting – GreetingApplication java  greeting main  2023_11_18 19_36_57](https://github.com/silvernyanko/assignment6/assets/145736051/e45310f9-6587-4df0-95c6-d9649dfda7d6)


