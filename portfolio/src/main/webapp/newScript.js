// write a function that calls fetch() and adds the response to the webpage. 
async function getString() {
    const responseFromServer = await fetch('/hello');
    const textFromResponse = await responseFromServer.json();

    // Pick a random Message.
    const randomMessage = textFromResponse[Math.floor(Math.random() * textFromResponse.length)];

    const helloContainer = document.getElementById('hello-container');
    helloContainer.innerText = randomMessage;
}