# EarBook

"Simple app that will interface with the Spotify API to create a music sharing app for friends. It's like Spotify mixed with Facebook.

Has a MEAN stack backend with a standard MongoDB database, Express, Angular, and Node.js. The API does the interfacing with the app, so the app itself doesn't need to be making any connection to the database. It just uses the API to make get and post requests and captures the JSON data coming back, translates it, and then puts it into a pretty user interface with a profile page, newsfeed, search page, page to add new posts and include different music from Spotify, and login page."

Updates that I wanted to implement but was unable to accomplish due to timing constraints:
```
Search with autocomplete
Chronological posts which disappear once viewed (would likely need to be done in the database setup)
Image sharing as well
Band accounts rather than just individual accounts
StubHub compatibility to connect ticket buying to posts from bands
```
