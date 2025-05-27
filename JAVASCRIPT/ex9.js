// Mock fetch
function fetchEvents() {
    return new Promise((resolve) => {
      setTimeout(() => resolve([{ name: "Yoga" }]), 1000);
    });
  }
  
  fetchEvents()
    .then(data => console.log("Fetched:", data))
    .catch(err => console.log(err));
  
  async function loadEvents() {
    console.log("Loading...");
    const data = await fetchEvents();
    console.log("Loaded:", data);
  }
  loadEvents();
  