// $('#circle').hover(function(){
//     $('img').attr('src','https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjjq6r-mcjhAhWKY98KHfF2AHkQjRx6BAgBEAU&url=https%3A%2F%2Fwww.amazon.com%2FFremont-Die-Carolina-Panthers-Magnet%2Fdp%2FB008N09W3K&psig=AOvVaw1US_QgoeM-khESgyoVHcZl&ust=1555077692013550')
// });

$('#circle').click(function(){
    alert('Clicked!')
});

$('p').html("This is a different sentence!");

$('#circle').hover(function(){
    $('p').html('We changed the text!')
});

$('.square').click(function(){
    $(this).css("background-color","orange")
});
