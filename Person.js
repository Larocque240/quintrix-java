// Online Javascript Editor for free
// Write, Edit and Run your Javascript code using JS Online Compiler

let Persons = [
    {
      "name": "Katie",
      "age": 29,
      "Favorite Color": "red",
      "EID": 231233
    },
    {
        "name": "John",
        "age": 14,
        "Favorite Color": "red",
        "EID": 783248
    },

    {
        "name": "Ricky",
        "age": 17,
        "Favorite Color": "blue",
        "EID": 123748
    },

    {
      "name": "Rina",
        "age": 24,
        "Favorite Color": "purple",
        "EID": 123740
    },
    ]
    
    console.log(Persons);
    console.log("________\n\n");
    console.log("check #1: push");
    const first = Persons[0];
    console.log("\n\n\n",first,"\n\n\n");
    //check #1: push
    let person = {
        "name": "Lisa",
        "age": 25,
        "Favorite Color": "pink",
        "EID": 158396
    }; Persons.push(person);
    console.log(Persons);
    console.log("________\n\n");

    //check #2: pop
    console.log("check #2: pop");
    Persons.pop();
    console.log(Persons);
    console.log("________\n\n");

    //check #3: slice
    console.log("check #3: slice")
    const remove2 = Persons.slice(1,3);
    console.log(remove2);
    console.log("________\n\n");
    
    //check #4: shift 
    console.log("check #4: shift");
    const shifted = Persons.shift();
    console.log("Removed: ",shifted);
    console.log("________\n");
    console.log("Updated Array: ",Persons);
    console.log("________\n\n");
    
    //check #5: unshift 
    console.log("check #5: unshift");
    const unshifted = Persons.unshift(first);
    console.log("________\n");
    console.log("Updated Array: ",Persons);
    console.log("________\n\n");

    //Resetting
    Persons.push(person);
    
   //check #6: filter
   let over18 = Persons.filter(Persons => Persons["age"] > 18);
   console.log("check #6: filter");
   console.log(over18);
   console.log("________\n\n");
   
   
   //Array
   console.log("Array Reset");
   console.log(Persons);
    
