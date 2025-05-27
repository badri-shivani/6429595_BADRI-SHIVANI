const eventList = [
    { name: "Guitar Class", category: "music" },
    { name: "Baking", category: "cooking" },
  ];
  
  eventList.push({ name: "Drum Circle", category: "music" });
  
  const musicEvents = eventList.filter(e => e.category === "music");
  
  const cards = eventList.map(e => `Workshop on ${e.name}`);
  console.log(cards);
  