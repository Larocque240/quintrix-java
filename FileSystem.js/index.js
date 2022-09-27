const fs = require("fs");
/*fs.writeFile("test.txt", "You successfuly made the test file", (err) => 
    {if(err) console.log("Error creating the file : "+err);

        console.log("File created successfully.");    
    })*/



 function readtheFile(fileName) {

    return new Promise((resolve, reject) => 
    {
        fs.readFile(fileName, "utf-8", function (err, data) 
        {
            if (err) 
            {
                return reject (err);
            }
                
            //console.log(fileName)
            console.log(data)
            
            resolve();

        })   
    });
}

async function run() {
  //  fs.open("C:\\Users\\raw31\\Desktop\\Quintrix\\Assignments\\LATEST\\test.txt");
  await readtheFile("test.txt");
}
run();
