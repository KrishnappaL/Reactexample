import React, { useState } from "react";

function Crackcookie(){
    const [fortune,setFortune]=useState("");
    const fortunes=[
        "Something good is coming your way 🙅",
        "Be bold today 🗹 ",
        "You will meet someone intersting 🤟",
        "Your hard work will pay off soon 🔜",
        "Take a break, You deserve it 🌠",
        "Luck is your side today 🍀" ,
        "You will laugh a lot today 😂"
    ];
    const crackCookie=()=>{
       const random=Math.floor(Math.random()*fortunes.length);
       setFortune(fortunes[random]);
    }
    return(
        <div>
            <h1 style={{color:"red"}}>Fortune Cookie 🍪</h1>
            <p style={{width:"30px",height:"30px"}}>🥠 </p>
\            <button onClick={crackCookie} className="cookiebtn">crack cookie</button>
            <p className="fortune">{fortune}</p>
        </div>
    );
}
export default Crackcookie;