const eventName = "Music Fest";
const eventDate = "2025-06-01";
let seats = 50;

console.log(`${eventName} is on ${eventDate}. Available seats: ${seats}`);
seats--; // when someone registers
console.log(`Seats left: ${seats}`);
