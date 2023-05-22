const calculator = {
  add: function (a, b) {
    return a + b;
  },
  sub: function (a, b) {
    return a - b;
  },
  mul: function (a, b) {
    return a * b;
  },
  div: function (a, b) {
    return a / b;
  },
  quo: function (a, b) {
    let q = parseInt(a / b);
    return q;
  },
  rem: function (a, b) {
    return a % b;
  },
};

const addCal = calculator.add(15, 10);
const subCal = calculator.sub(addCal, 10);
const mulCal = calculator.mul(subCal, addCal);
const divCal = calculator.div(mulCal, subCal);
const quoCal = calculator.quo(divCal, addCal);
const remCal = calculator.rem(quoCal, mulCal);

console.log(addCal);
console.log(subCal);
console.log(mulCal);
console.log(divCal);
console.log(quoCal);
console.log(remCal);
