function Event(name, seats) {
    this.name = name;
    this.seats = seats;
  }
  Event.prototype.checkAvailability = function () {
    return this.seats > 0;
  };
  
  const e1 = new Event("Yoga", 5);
  console.log(Object.entries(e1));
  console.log("Available?", e1.checkAvailability());
  