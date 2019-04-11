//Update the 'Coffee' item to say 'Fair Trade Coffee'
const div = document.getElementById('list').children[1];
div.innerHTML = "Fair Trade Coffee";

//Remove 'Twinkies' from the list
const div2 = document.getElementById('list').children[3].remove();

//Add an item 'Cheese Whiz'
const newLI = document.createElement('li');
newLI.innerHTML = "Cheese Whiz";
const newListItem = document.querySelector('#list');
newListItem.appendChild(newLI);

//Clear the list and programmatically add items from the array ['protein powder', 'muscle milk', 'power bars']
newListItem.children[0].remove();
newListItem.children[0].remove();
newListItem.children[0].remove();
newListItem.children[0].remove();

var array = ['protein powder', 'muscle milk', 'power bars'];

var item1 = document.createElement('li')
    list.appendChild(item1);
    item1.innerHTML = array[0];
var item2 = document.createElement('li')
    list.appendChild(item2);
    item2.innerHTML = array[1];
var item3 = document.createElement('li')
    list.appendChild(item3);
    item3.innerHTML = array[2];

item2.class = "important";

console.log(item2.class);

//Add the class 'important' to the muscle milk item.