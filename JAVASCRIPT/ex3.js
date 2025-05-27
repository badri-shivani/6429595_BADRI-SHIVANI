const events = [
    { name: "Yoga", date: "2025-07-01", seats: 10 },
    { name: "Music", date: "2023-05-01", seats: 0 },
  ];
  
  events.forEach(event => {
    const today = new Date().toISOString().split("T")[0];
    if (event.date > today && event.seats > 0) {
      console.log(`Event: ${event.name}`);
      try {
        if (event.seats <= 0) throw new Error("Full event");
        console.log("Registration successful");
      } catch (e) {
        console.log("Registration error: " + e.message);
      }
    }
  });
  