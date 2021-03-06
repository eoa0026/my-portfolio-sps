// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */
function addRandomGreeting() {
    const greetings =
        ['Dont eat the crab dip, YA YA!', 'Streets Ahead', 'I regret nothing', 'Never listen to Pierce.', 'Its called chemistry, I have it with everybody!', 'Cool cool cool.', '"Ill allow it." - Señor Chang', 'A passing grade? Like a C? Why dont I just get pregnant at a bus station?', 'I give this year a "D", for delightful!'];

    // Pick a random greeting.
    const greeting = greetings[Math.floor(Math.random() * greetings.length)];

    // Add it to the page.
    const greetingContainer = document.getElementById('greeting-container');
    greetingContainer.innerText = greeting;
}

// write a function that calls fetch() and adds the response to the webpage. 
async function getString() {
    const responseFromServer = await fetch('/hello');
    const textFromResponse = await responseFromServer.json();

    // Pick a random Message.
    const randomMessage = textFromResponse[Math.floor(Math.random() * textFromResponse.length)];

    const helloContainer = document.getElementById('hello-container');
    helloContainer.innerText = randomMessage;
}
