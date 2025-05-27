function addEvent(events, event) {
    events.push(event);
  }
  
  function registerUser(event) {
    if (event.seats > 0) {
      event.seats--;
      console.log("Registered for " + event.name);
    }
  }
  
  function filterEventsByCategory(events, category) {
    return events.filter(e => e.category === category);
  }
  
  // Closure
  function registrationCounter() {
    let total = 0;
    return function () {
      total++;
      return total;
    };
  }
  
  const countMusic = registrationCounter();
  console.log(countMusic()); // 1
  console.log(countMusic()); // 2
  