const h1 = document.querySelector("div.hello:first-child h1");

function handleTitleClick() {
  h1.style.color = "skyblue";
  // console.log("h1 was clicked!");
  // If I want to execute, just write some!
}

function handleMouseEnter() {
  h1.innerText = "Mouse is here!";
}

function handleMouseLeave() {
  h1.innerText = "Mouse is gone!";
}

function handleWindowResize() {
  document.body.style.backgroundColor = "tomato";
}

function handleWindowCopy() {
  alert("copier!");
}

function handleWindowOffline() {
  alert("SOS no WIFI!");
}

function handleWindowOnline() {
  alert("ALL GOOOOD");
}

// when click the h1, execute the handleTitleClick() by using addEventListener()
// instead of directly execute handleTitleClick()
// h1.addEventListener("click", handleTitleClick);
h1.addEventListener("click", handleTitleClick);
h1.addEventListener("mouseenter", handleMouseEnter);
h1.addEventListener("mouseleave", handleMouseLeave);

window.addEventListener("resize", handleWindowResize);
window.addEventListener("copy", handleWindowCopy);
window.addEventListener("offline", handleWindowOffline);
window.addEventListener("online", handleWindowOnline);
