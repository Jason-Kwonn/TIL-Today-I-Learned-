const player = {
  name: "Jason",
  points: 100,
  fat: true,
};

console.log(player);
// player's object fat can be changed because it's an 'Object'
player.fat = false;
console.log(player);

// // But When I have to change 'const player', never be changed
// player = true;
// console.log(player);

// Add player's property lastName
player.lastName = "K";
console.log(player);

// This is the difference of Arrays and Object.

// Add player.points
player.points = player.points + 50;
console.log(player.points);
