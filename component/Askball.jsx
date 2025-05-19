import React, { useState } from "react";
function AskBall(){
    const [Message,setMessage]=useState("click to ask");
    const [shaking,setShaking]=useState(false);
    const message=[
        "Yes",
        "No",
        "May be"
    ];
    const handleMessage=()=>{
        setShaking(true);
        //setTimeout works after one second of clicking
        setTimeout(()=>{
            const random=Math.floor(Math.random()*message.length);
            setMessage(message[random]);
            setShaking(false)
        },1000);
      //  console.log(random);
    }
    //  shaking =true ,because it set up handlemessage first statement

    return (
        <div>
        <div className={`ball ${shaking?"shake":" "}`} onClick={handleMessage}> 
            {Message}
        </div>
        <button className="ask" onClick={handleMessage}>Ask the 8-ball 🎱</button>
        </div>
    );
}
export default AskBall;