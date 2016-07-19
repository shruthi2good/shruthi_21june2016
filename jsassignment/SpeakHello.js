// STEP 2: Wrap the entire contents of SpeakHello.js inside of an IIFE
// See Lecture 52, part 2


// STEP 3: Create an object, called 'helloSpeaker' to which you will attach
// the "speak" method and which you will expose to the global context
// See Lecture 52, part 1
/*(function(window)
	{

		
		var helloSpeaker={};
		var speakWord = "Hello";
		var name=helloSpeaker.name;
		
		//console.log("Heeeeeeeee  ujjj"+helloSpeaker.name);


		helloSpeaker.speak=function() {
			//console.log(" printing helloSpeaker:"+helloSpeaker);
  		console.log(speakWord + "  " +helloSpeaker.name);
}
	window.helloSpeaker=helloSpeaker;

})(window);
*/

// DO NOT attach the speakWord variable to the 'helloSpeaker' object.
//var speakWord = "Hello";

// STEP 4: Rewrite the 'speak' function such that it is attached to the
// helloSpeaker object instead of being a standalone function.
// See Lecture 52, part 2
/*function speak(name) {
  console.log(speakWord + " " + name);
}*/



// Immediately Invoked Function Expression
// IIFE
/*(function speak (name) {
  console.log("Hello " + name);
})(helloSpeaker.name);*/

// STEP 5: Expose the 'helloSpeaker' object to the global scope. Name it
// 'helloSpeaker' on the global scope as well.
// See Lecture 52, part 2
// (Note, Step 6 will be done in the SpeakGoodBye.js file.)
// xxxx.xxxx = helloSpeaker;


/*(function (window) {
  var yaakovGreeter = {};
  yaakovGreeter.name = "Yaakov";
  var greeting = "Hello ";
  yaakovGreeter.sayHello = function () {
    console.log(greeting + yaakovGreeter.name);
  }

  window.yaakovGreeter = yaakovGreeter;

})(window);*/

