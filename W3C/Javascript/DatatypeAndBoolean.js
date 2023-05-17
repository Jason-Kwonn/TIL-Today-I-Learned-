/* 
const can't be changed
let can be changed
*/
const a = 10;
const b = 2;

let myName = "jason";

console.log(a + b);
console.log(a * b);
console.log(a / b);
console.log("Hello " + myName);

myName = "JASON";

console.log("Hello " + myName);

/*
amIFat has a value null, 
something doesn't have any value
*/
const amIFat = null;
let something;

console.log(amIFat, something);
