# MyMoviesList

My movie list is an android app to make your movie program to watch, all the movies are fetch from the API of https://www.themoviedb.org

## Prerequisites

Clone or Download the project

`git clone https://github.com/SombreroElGringo/MyMoviesList`

Important! In the **gradle.properties** change the API KEY with yours !

`THE_MOVIE_DB_API_KEY="YOUR_API_KEY"`

## Demo

**Most popular movies**

![Imgur](https://i.imgur.com/bjU5Xu7.png)

**Highest rated movies**

![Imgur](https://i.imgur.com/mqGRMmp.png)

**Favorite movies**

![Imgur](https://i.imgur.com/EPHmAyt.png)

**Movie détail**

![Imgur](https://i.imgur.com/i25f9zC.png)

**Menu**

![Imgur](https://i.imgur.com/9WcJmoS.png)

## Overview

The application does the following:

* Display the most popular movies
* Display the highest rated movies
* Display the list of your favorite movies
* Show the détail of a movie (movie name, rate, release date, description and a link to the trailer)
* Add & delete a movie in your favorites list

## Libraries

* [Glide](https://github.com/bumptech/glide) - For remote image loading
* [Retrofit](http://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java
* [MaterialFavoriteButton](https://github.com/IvBaranov/MaterialFavoriteButton) - Material spinning favorite/star/like button
