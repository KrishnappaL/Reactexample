import React, { useState } from "react";
import dice1 from "../dice1.png";
import dice2 from "../dice2.png";
import dice3 from "../dice3.png";
import dice4 from "../dice4.png";
import dice5 from "../dice5.jpeg";
import dice6 from "../dice6.png";
function Dice()
{
  const [roll,setRoll]= useState(0);
  const diceImage=[dice1,dice2,dice3,dice4,dice5,dice6];
    const rollDice=()=>{
      const random= Math.floor(Math.random()*6);
      //console.log(random);
        setRoll(random);
    };
    return(
        <div>
            <div>
            <h1 style={{display:"flex",justifyContent:"center"}}>Dice Roller 🎲</h1>
            </div>
            <div > 
            <img src={diceImage[roll]}  height="20px" width="30px"  alt="" className="roller"/>
            </div>
            <div>
            <button onClick={rollDice} className="roll-btn">roll</button>
            </div>
        </div>
    );
}

export default Dice