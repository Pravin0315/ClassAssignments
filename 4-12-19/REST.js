$(document).ready(function(){
    let list = $('#text');

    $("#allposts").on('click',function(){
        list.text("")
        $.get('http://jsonplaceholder.typicode.com/posts',function(posts){
            posts.forEach(function(post){
                const li = $('<li>');
                li.text('Post' + post.id + ': ' + post.body)
                list.append(li);                
            });
        })
    })

    $('#postid10').on('click', function(){ 
        list.text("");
        $.get('http://jsonplaceholder.typicode.com/posts', function(posts){
           posts.forEach(function(post){
               if(post.id == 10){ 
               const li = $('<li>');
               li.text('Post 10: ' + post.body)
               list.append(li)
           }})
        })
    })

    $('#commentspostid12').on('click', function(){
        list.text(""); 
        $.get('http://jsonplaceholder.typicode.com/comments', function(comments){
            comments.forEach(function(comment){
                if(comment.postId === 12){ 
                    const li = $('<li>');
                    li.text('Post 12 Comments: ' + comment.body)
                    list.append(li);
                }
            })
        })
    })
    $('#postsuserid2').on('click', function(){
        list.text("");
        $.get('http://jsonplaceholder.typicode.com/posts', function(posts){
            posts.forEach(function(post){
                if(post.userId === 2){
                    const li = $('<li>');
                    li.text('Post from User 2: ' + post.body);
                    list.append(li);
                }
            })
        })
    })
    $('#createnewpost').on('click', function(){
    list.text("");
    $.post('http://jsonplaceholder.typicode.com/posts',
    {
        title: 'what',
        body: 'que'
    },
    function(post){
        const li = $('<li>');
        li.text('New Post ID: ' + post.id)
        list.append(li);   
    })
})

    $('#replacepost').on('click', function(){
        list.text("");
            $.ajax({
        url: 'http://jsonplaceholder.typicode.com/posts/12',
        method: 'PUT',
        dataType: 'json',
        data: {id: 101},
        complete: function(data){
            console.log(data)
            const li = $('<li>');   
            li.text('Response JSON: ' + (data.responseJSON).toSource())
            list.append(li);   
        }
    })
})

    $('#updatetitle').on('click', function(){
        list.text("");
        $.ajax({url: 'http://jsonplaceholder.typicode.com/posts/12',
            method: 'PUT',
            dataType:'json',
            data: {title: 'new title'},
            complete: function(data){
                console.log(data);
                const li = $('<li>');
                li.text('Response JSON: ' + (data.responseJSON).toSource())
                list.append(li);
        }
    })
})

    $('#deletepost').on('click', function(){
        list.text("");
        $.ajax({
            method: 'DELETE',
            url: 'http://jsonplaceholder.typicode.com/posts/12',
            complete: function(data){
                console.log(data);
                const li = $('<li>Post 12 Deleted</li>')
                list.append(li);
        }
    })
})

    $('#displaylist').on('click', function(){
    list.text("")
    $.get('http://jsonplaceholder.typicode.com/posts', function(posts){
        posts.forEach(function(post){
            const li = $('<li>');
            li.text('Post' + post.id + ': ' + post.body)
            list.append(li);
            li.addClass((post.id).toString())
        })
    })
    $('ul').on('click',function(event){
        $('li').css('display', 'none');
        let chosenPost = event.target;
        $.get('http://jsonplaceholder.typicode.com/comments', function(comments){
        comments.forEach(function(comment){
            if(chosenPost.className == (comment.postId).toString()){
                console.log('it works');
                const li = $('<li>');
                li.text('Post' + post.id + ' comments: ' + comment.body);
                list.append(li);
            }
        })
    })
    })
})
})