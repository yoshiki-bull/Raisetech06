# 第六回課題
・Spring Bootを使ってみる。

＃＃結果一覧。
![第六回課題提出用.png](..%2F..%2F..%2F..%2FOneDrive%2F%89%E6%91%9C%2F%83%58%83%4E%83%8A%81%5B%83%93%83%56%83%87%83%62%83%67%2F%91%E6%98%5A%89%F1%89%DB%91%E8%92%F1%8F%6F%97%70.png)

## 簡単な構造であればMapで表現するとSpringが「JSON形式」に変換してくれる。
また、あとから入力した値が上にくる。
![JSON形式.png](..%2F..%2F..%2F..%2FOneDrive%2F%89%E6%91%9C%2F%83%58%83%4E%83%8A%81%5B%83%93%83%56%83%87%83%62%83%67%2FJSON%8C%60%8E%AE.png)

##ターミナルで「curlコマンド」を使ってみました。
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