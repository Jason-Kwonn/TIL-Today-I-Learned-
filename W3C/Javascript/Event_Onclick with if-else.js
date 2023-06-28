const h1 = document.querySelector("div.hello:first-child h1");

function handleTitleClick() {
  const currentColor = h1.style.color;
  let newColor; // Create an Empty let

  if (currentColor === "skyblue") {
    newColor = "tomato";
  } else {
    newColor = "skyblue";
  }
  h1.style.color = newColor; // Finally add newColor inside h1.style.color
}

// when click the h1, execute the handleTitleClick() by using addEventListener()
// instead of directly execute handleTitleClick()
// h1.addEventListener("click", handleTitleClick);
h1.addEventListener("click", handleTitleClick);
