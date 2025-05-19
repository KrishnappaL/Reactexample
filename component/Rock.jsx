import React, { useState } from "react";
function Rock(){
    //array
    const choices=["Rock","Paper","Scissors"];
    //object aray
    const emojis={ 
        Rock: "🪨",
        Paper: "💮",
        Scissors: "✂️"
    };
    const [playerChoice,setPlayerChoice]=useState("");
    const [computerChoice,setComputerChoice]=useState("");
    const [result,setResult]=useState("");
    const playGame = (player)=>{
        const computer=choices[Math.floor(Math.random()*choices.length)];
        setPlayerChoice(player);
        setComputerChoice(computer);
        setResult(getWinner(player,computer));
    }
    //== value equality , === value and datatype equality check
    const getWinner = (player,computer)=>{
        if(player==computer)
            return "It's a tie"
        if((player==="Rock" && computer==="Scissors") ||
             (player==="Paper" && computer==="Rock") ||
             (player=== "Scissors" && computer==="Paper")){
                    return "You win"
      }
      return "You loss"
    }
                        //don't call one function using onclick ,so use onother function to call

    return(
        <div>
            <h1>Rock-Paper-Scissors</h1>
            {
                choices.map((choice)=>(
                    <button className="choice-btn" onClick={()=>playGame(choice)}>{emojis[choice]}{choice}</button>
                ))
            }
            {
                playerChoice && (
                    <>
                        <h1>You chose: {emojis[playerChoice]} {playerChoice}</h1>
                        <h1> Computer chose: {emojis[computerChoice]} {computerChoice}</h1>
                        <h2 className="result-text"> {result}</h2>
                    </>
                )
            }
        </div>
    );
}
export default Rock;