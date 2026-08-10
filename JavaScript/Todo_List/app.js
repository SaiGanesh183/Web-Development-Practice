let todo=[]
let req= prompt("Please enter your request: ")
console.log(req)
while(true) {
    if(req=="quit") {
        console.log("You have exited the program")
        break
    }
    if(req=="list") {
        console.log("**********")
        for(let i=0;i<todo.length;i++) {
            console.log(i + ": " + todo[i])
        }
}

else if(req=="add") { 
   let task= prompt("Enter your task: ")
    todo.push(task) 
    console.log(task + " has been added to the list")       
}

else if(req=="delete") {
      let task= prompt("Enter the index of the task to delete: ")  
      if(task>=0 && task<todo.length) {
        let deletedTask = todo.splice(task, 1)
        console.log(deletedTask + " has been deleted from the list")
      }
        else {
            console.log("Invalid index. Please enter a valid index.")   
        }

}

else {
    console.log("Invalid request. Please enter a valid request.")   
}








}