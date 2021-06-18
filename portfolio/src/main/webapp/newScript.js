// write a function that calls fetch() and adds the response to the webpage. 
async function getString() {
  const responseFromServer = await fetch('/hello');
  const textFromResponse = await responseFromServer.text();

  const helloContainer = document.getElementById('hello-container');
  helloContainer.innerText = textFromResponse;
}