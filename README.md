# SpringBoot_curl_Postman_ConflictResolution

## 概要
- Spring Bootで"Hello, World!"を出力表示するファイルを作成する。  
- その後、ファイル内容変更してmainブランチにmergeする。  
- ※Gitで起こしてしまったコンフリクトを解決する。  

 * * * 

## （1）"Hello, World!"出力表示するファイルをmainブランチにpush



### Postmanの実行結果

![assignment6_main_Postman](https://github.com/silvernyanko/assignment6/assets/145736051/369172d6-68ac-4391-942d-fd40b785dbd5)


 * * * 


### curlの実行結果

![assignment6_main_curlターミナル実行結果](https://github.com/silvernyanko/assignment6/assets/145736051/1a0250c1-e2d1-47f8-86a4-5fa2793885d3)


 * * * 


### curlのURL

curl --location 'http://localhost:8080/greet'


 * * * 


### curlをターミナルで確認した結果

```
StatusCode        : 200                                                                                                                    
StatusDescription :                                                                                                                        
Content           : Hello, World!                                                                                                          
RawContent        : HTTP/1.1 200                                                                                                           
Keep-Alive: timeout=60                                                                                                 
Connection: keep-alive                                                                                                 
Content-Length: 13                                                                                                     
Content-Type: text/plain;charset=UTF-8                                                                                 
Date: Fri, 17 Nov 2023 13:15:59 GMT

                    Hello, World!                                                                                                          
Forms             : {}                                                                                                                     
Headers           : {[Keep-Alive, timeout=60], [Connection, keep-alive], [Content-Length, 13], [Content-Type, text/plain;charset=UTF-8]...}
``` 


 * * * 





## （2）内容変更したファイルをmainブランチにmerge


### Postmanの実行結果のスクリーンショット

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
>>>>>>> character
Images            : {}
InputFields       : {}
Links             : {}
ParsedHtml        : mshtml.HTMLDocumentClass
<<<<<<< HEAD
RawContentLength  : 13
=======
RawContentLength  : 676
``` 


 * * * 

## curlの実行結果のスクリーンショット

![greeting – GreetingApplication java  greeting main  2023_11_18 19_36_57](https://github.com/silvernyanko/assignment6/assets/145736051/e45310f9-6587-4df0-95c6-d9649dfda7d6)



 * * * 

## コンフリクト解決

### 各ブランチの説明

#### mainブランチ
"Hello, World!"をSpringBootで出力させるファイル。

#### greetingブランチ
- 作業過程で使ったブランチ。
- 当初はmainブランチに変更を加えたものをこちらで表示させる予定だった。
- しかし、ブランチの名前と内容が合わなかったので、ローカルのブランチ名を変更して別ブランチでpushした。
- 作業の過程を残すために残している。

#### characterブランチ
- キャラクターの名前と年齢を出力表示させるファイル。
- キャラクターを派閥ごとに分類して、リストに振り分けた。

#### featureブランチ
- mainブランチとcharacterブランチの間の、README.mdにて発生したコンフリクト解決用ブランチ。以下コンフリクト解決手順。
- スタートがmainブランチの状態で、「git branch -b feature」で、featureブランチ(mainブランチから派生)を作成ながら切り替える。
- 上の手順から、mainブランチの内容はfeatureブランチにmerge済み。
- origin characterブランチの内容を、featureブランチにfetchする。
- mergeができなかったので、「git status」でステージングエリアを確認して、「git add README.md」で追加。
- commitで変更内容を書いて、logを確認後、「git merge character」で、featureブランチにcharacterブランチの内容をmergeできた。
- 「git push origin feature」でリモートのfeatureブランチの変更内容をpush。
- 「git checkout main」→「git merge feature」で、ローカルのmainブランチに、featureブランチの内容をmergeした。
- 「git push origin main -u」でリモートのmainブランチに変更内容をpushすることができた。