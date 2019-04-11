//Get the header element
const head = document.querySelector("header");

//Get all the section elements
const sec = document.querySelectorAll("section");

//Get the section element with class="current"
const cur = document.getElementsByClassName("current");

//Get the section that comes after the current section
const light = document.getElementsByClassName("highlight");

//Get the h2 node from the section before the 'current' section
const node = cur.previousElementSibling.children[0];

//Get the div that contains the section that has an h2 with a class of 'highlight'
const high = documents.getElementsByClassName("div");

//Get all the sections that contain an H2 (using a single statement);
const single = high.children[0,1];

console.log(head);
console.log(sec);
console.log(cur);
console.log(light);
console.log(node);
console.log(high);
console.log(single);
