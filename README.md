# GeminiPDA Japanese Keyboard Remap apk

## Description

このプログラムは、Gemini PDA 日本語キーボードのキーマッピングを変更するアプリです。
GeminiPDA, ASTRO SLIDE 5G で日本語キーが正しく入力できるようになります。

Fn+: で、- が入力できるようになっています(Symが無効です)。
Fn+U で"-"が入力できます。

kcmファイルは、以下の記事とソースコードからいただきカスタマイズしました。

http://ayati.cocolog-nifty.com/blog/2018/06/gemini-pdaroot-.html

## Requirement

開発環境は以下の通り。

* Android Studio Chipmunk | 2021.2.1 Patch 1
* API Level 25

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

GeminiPDAJP-release.apk を Gemini PDAにインストールして、物理キーボード設定からレイアウトを選択してください。

## Update History

* 2022/06/27 ASTRO SLIDE 5G 向けに apk をリビルドしました。

## Licence

MIT License

## Author

* [incmplt](https://github.com/incmplt)
* [InfoCircus,Inc.](https://www.infocircus.jp/)
