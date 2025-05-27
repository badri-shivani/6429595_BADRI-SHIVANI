const event = { name: "Yoga", date: "2025-06-01" };
const { name, date } = event;
console.log(name, date);

function greet(user = "Guest") {
  console.log("Hello " + user);
}

const events = [{ name: "Yoga" }];
const clone = [...events];
