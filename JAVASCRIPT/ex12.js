const data = { name: "John", email: "john@example.com" };

fetch("https://jsonplaceholder.typicode.com/posts", {
  method: "POST",
  headers: { "Content-Type": "application/json" },
  body: JSON.stringify(data),
})
  .then(res => res.json())
  .then(json => console.log("Success:", json))
  .catch(err => console.log("Error:", err));
