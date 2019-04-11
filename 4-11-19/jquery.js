//Load jQuery (using a CDN)


//Get the top-level header element
const header = $("ul");

//Get all the section elements
const element = $("section");

//Get the section element with class="current"
const current = $(".current");

//Get the section that comes after the current section
const sectionaftercurrent = current.next();

//Get the h2 node from the section before the 'current' section
current.prev().find("h2")[0];

//Get the div that contains the section that has an h2 with a class of 'highlight'
$(current).parent();

//Get all the sections that contain an H2 and store them in an Array
let allH2 = Array.from($("section").find("h2"));