var player1 = 'name1';
var player2 ='name2';
var p1wins = '0';
var p2wins = '0';
var p1weapon = null;
var p2weapon = null;
var weapons = ["rock", "paper", "scissors"];
var inputs = document.getElementById('game-wrapper');

function rps(){
    player1 = document.getElementById("player1").value;
    player2 = document.getElementById("player2").value;
while (p1wins < 3 && p2wins < 3) {

    p1weapon = weapons[Math.floor(Math.random() * weapons.length)];
    console.log(player1+": "+p1weapon);
    p2weapon = weapons[Math.floor(Math.random() * weapons.length)];
    console.log(player2+": "+p2weapon);

        if (p1weapon===p2weapon) {
            console.log("Draw");
            console.log(player1 +" has won "+p1wins+" round(s).");
            console.log(player2+" has won "+p2wins+" round(s).");
        }
        else if (p1weapon=="rock" && p2weapon=="scissors" || p1weapon=="scissors" && p2weapon=="paper" || p1weapon=="paper" && p2weapon=="rock") {
            console.log("Player 1 wins this round.");
            p1wins++;
            console.log(player1 +" has won "+p1wins+" round(s).");
            console.log(player2+" has won "+p2wins+" round(s).");
        }
        else if(p2weapon=="rock" && p1weapon=="scissors" || p2weapon=="scissors" && p1weapon=="paper" || p2weapon=="paper" && p1weapon=="rock") {
            console.log("Player 2 wins this round.");
            p2wins++;
            console.log(player1 +" has won "+p1wins+" round(s).");
            console.log(player2 +" has won "+p2wins+" round(s).");
        }
        document.getElementById("p1wins").innerHTML = player1 + " has " + p1wins + " wins ";
        document.getElementById("p2wins").innerHTML = player2 + " has " + p2wins + " wins ";

            if (p1wins===3) {
            console.log(player1 +" wins the match.")
            document.getElementById("matchwinner").innerHTML = player1 + " is the match winner!";;
        }else if (p2wins===3) {
            console.log(player2 +" wins the match.");
            document.getElementById("matchwinner").innerHTML = player2 + " is the match winner!";

        }

        }

    }

    