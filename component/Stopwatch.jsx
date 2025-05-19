import React, { useEffect, useState } from "react";
function StopWatch(){
    const [seconds,setSeconds]=useState(0);
    const [isRunning,setIsRunning]=useState(false);
    const handleStart=()=> setIsRunning(true);
    const handleStop=() => setIsRunning(false);
    const handleReset=()=>{
        setSeconds(0);
        setIsRunning(false);
    }
    //when isRunning value is changed then only useEffect will run ,if isRunning=false that is stop state,you again click stop then useEffect function not execute,because only when value change from one form to onother then effect occur
    useEffect(()=>{
        let interval;
        //if isRunning true then only if excutes
        if(isRunning){
            interval= setInterval(()=>{
                setSeconds(prevSeconds=>prevSeconds+1);
        },1000)
    }
        return ()=> clearInterval(interval);
    },[isRunning]);
    return(
        <div> 
            <h1>Start-Stop Watch</h1>
            <p>{seconds}s </p>
            <button onClick={handleStart}>start</button>
            <button onClick={handleStop}>stop</button>
            <button onClick={handleReset}>reset</button>
        </div>
    );
}
export default StopWatch;