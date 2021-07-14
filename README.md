Spring Boot – Build a REST API

1. About the API we’ll Build

So i would build an API for a social network platform. Let’s call it SocialAPI. 
This is like a mini Facebook! Although it is small, this is the same principle social networks follow.

 

My SocialAPI would contain the following classes:

list of users

list of locations

list of posts

 

Also, the following relationships would be supported:

a user has a location

each location could have 1 or more users

a user could create a post. Hence each user can have one or more posts
 

My SocialAPI would support the following operations:

add, delete and update user details

add, delete and update location details

add, delete and update post details

get a list of users or locations

get user or location by id

get list of posts for a particular user
