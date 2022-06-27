# GeminiPDA Japanese Keyboard Remap apk

## Description

このプログラムは、Gemini PDA 日本語キーボードのキーマッピングを変更するアプリです。
GeminiPDA, ASTRO SLIDE 5G で日本語キーが正しく入力できるようになります。

Fn+: で、- が入力できるようになっています(Symが無効です)。
Fn+U で"-"が入力できます。

kcmファイルは、以下の記事とソースコードからいただきカスタマイズしました。

http://ayati.cocolog-nifty.com/blog/2018/06/gemini-pdaroot-.html

開発のメインマシンは ASTRO SLIDE 5G となりましたが、最初のリリースを継承するため アプリの名称にのみ GeminiPDA が残っています。

## Requirement

開発環境は以下の通り。

* Android Studio Chipmunk | 2021.2.1 Patch 1
* API Level 25
  
以下のハードウェアで動作検証をしています。

* GeminiPDA : Version 1.0.3 まで(バッテリー不具合のため今後検証できず)
* ASTRO SLIDE 5G 日本語キーボード

## Usage

src/ ディレクトリ以下に、Android Studio プロジェクトがそのまま保存されているのでビルド可能。
ビルド済みapk(署名済み)は、以下の場所に保存済みです。

<pre>
bin/GeminiPDAJP-release.apk
</pre>

本アプリは、以下のプラットフォーム向けに開発しています。

* GeminiPDA 日本語キーボードモデル (現在バッテリー不具合で未検証)
* ASTRO SLIDE 5G 日本語キーボードモデル

## Install

GeminiPDAJP-release.apk を Gemini PDAにインストールして、物理キーボード設定から「GeminiPDA JP Custom」を選択してください。

## Update History

* 2022/06/01 : Version 1.1.0
  アプリ起動画面に、使用方法などを表示する index.html を追加しました。
* 2022/06/27 : Version 1.1.7
  ASTRO SLIDE 5G 向けに apk をリビルドしました。Gemini PDA 互換のため API Level 25 のままです

## Licence

MIT License

## Author

* [incmplt](https://github.com/incmplt)
* [InfoCircus,Inc.](https://www.infocircus.jp/)
