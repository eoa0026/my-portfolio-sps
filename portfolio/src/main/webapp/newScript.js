// write a function that calls fetch() and adds the response to the webpage. 
async function getString() {
  const responseFromServer = await fetch('/hello');
  const textFromResponse = await responseFromServer.json();

  const helloContainer = document.getElementById('hello-container');
  helloContainer.innerText = textFromResponse;
  console.log();
}