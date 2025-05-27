const container = document.querySelector("#events");

const event = { name: "Yoga", seats: 10 };
const card = document.createElement("div");
card.textContent = `${event.name} - Seats: ${event.seats}`;
container.appendChild(card);
