# 第六回課題
・Spring Bootを使ってみる。

## 結果一覧。

<img width="939" alt="第六回課題提出用" src="https://user-images.githubusercontent.com/120367482/211142428-6e127d41-1401-4184-94a7-62d4d9256c30.png">


## 簡単な構造であればMapで表現するとSpringが「JSON形式」に変換してくれる。
また、あとから入力した値が上にくる。

<img width="951" alt="JSON形式" src="https://user-images.githubusercontent.com/120367482/211142451-88d097e0-bdf3-4782-953f-fc483976d6f9.png">


## ターミナルで「curlコマンド」を使ってみました。
```
curl http://localhost:8080/now -i
HTTP/1.1 200
Content-Type: text/plain;charset=UTF-8
Content-Length: 46
Date: Sat, 07 Jan 2023 08:07:01 GMT

今は
2023-01-07T17:07:01.290069200
です。
```