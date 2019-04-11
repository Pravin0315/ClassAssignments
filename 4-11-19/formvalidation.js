$(document).ready(function() {

    $('#submit').ready(function() {
        const name = $('#name');
        const email = $('#email');
        const phone = $('#phone');
        const message = $('message');

        const required = [name, email, phone];

        for (let i = 0; i < required.length; i++) {
            if (required [i].val() === "") {
                $(message).text("Please Fill Out Required Fields").addClass('warning');
                required[i].prev().addClass('warning');
            } else {
              required[i].prev().removeClass('warning');
            }
          }
          
          if (!$("#form label").hasClass('warning')) {
            $("#form")[0].remove();
            $("#pre-form h2").text("Thanks for your feedback!")
          }
      
        });
      });

