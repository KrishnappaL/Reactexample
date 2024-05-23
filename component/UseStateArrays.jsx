import React from "react";
import { useState } from "react";

function UseStateArrays(){
    const [data,setData] = useState([])
    const items=["dhoni","vijay","rohit","kohli"];
    const addPlayers = () =>{
        setData(items);
    }
    const addOnePlayers = () =>{
        const bowler=["nataraj"];
       // setData(bowler);
       setData([...data,bowler])
    }
    return(
        <>
        UseStateArrays<br/>
        {data.length && data.map((items) =>{
            return <li>{items}</li>
        })}
        <button onClick={addPlayers}>Players </button>
        <button onClick={addOnePlayers}>Players </button>

        </>
    );
}
export default UseStateArrays