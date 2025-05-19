import React, { useEffect, useState } from "react";
function TextCounter(){
    const [text ,setText]=useState("");
    const [length,setLength]=useState(0);
    useEffect(()=>{
        setLength(text.length);
    },[text]);
    return(
        <div>
            <h1 className="text">Text Counter</h1>
            <textarea value={text} placeholder="type something man ..." 
            onChange={(e) => setText(e.target.value)} className="text-area">

            </textarea>
            <p>Character count: {length}</p>
        </div>
    );
}
export default TextCounter;