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


