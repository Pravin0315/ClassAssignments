let userName = document.querySelector('input#userName')
let submit = document.querySelector('button[type="submit"]')
submit.addEventListener("click", event => {
    //executor

})

$(document).ready(function(){

    function findUser(userName) {
        return new Promise (function (resolve, reject) {
        $.get('http://jsonplaceholder.typicode.com/users?username=' + userName, function(user){
            if (users.length)
                resolve (users[0]);
            else 
                reject ('User with name ' + username + 'not found')
            })
        })
    }

    function getUserposts(user) {
        return new Promise (function(resolve, reject) {
        $.get('http://jsonplaceholder.typicode.com/posts?userid=)' + user.Id, function(user){
        resolve (posts)
            })
        })
    }

    function getUseralbums(user) {
        return new Promise (function(resolve, reject){
        $.get('http://jsonplaceholder.typicode.com/albums?userid=') + user.Id, function(albums){
        resolve(albums)
            }
        })
    }


}