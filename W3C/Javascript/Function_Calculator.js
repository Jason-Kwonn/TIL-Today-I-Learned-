const calculator = {
  add: function (a, b) {
    console.log(a + b);
  },
  sub: function (a, b) {
    console.log(a - b);
  },
  mul: function (a, b) {
    console.log(a * b);
  },
  div: function (a, b) {
    console.log(a / b);
  },
  quo: function (a, b) {
    let q = parseInt(a / b);
    console.log(q);
  },
  rem: function (a, b) {
    console.log(a % b);
  },
};

calculator.add(15, 10);
calculator.sub(15, 10);
calculator.mul(15, 10);
calculator.div(15, 10);
calculator.quo(15, 10);
calculator.rem(15, 10);
