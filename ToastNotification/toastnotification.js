let button = document.getElementById("btn");
let div = document.getElementById("notification");

button.addEventListener("click", function () {
  let element = document.createElement("p");
  element.classList.add("toast");
  let notification = document.createTextNode("This is to notify you that");
  element.appendChild(notification);

  div.appendChild(element);

  setTimeout(() => {
    element.remove(); /// the element which i have created here is going to get removed after
  }, 3000);
});
