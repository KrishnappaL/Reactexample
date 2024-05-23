import './App.css';
import { useState } from 'react';
function App() {  
  const [display,setDisplay]=useState(1234)
  function incrementDisplay(){
    setDisplay(display+1);
  }
 
  const decrementDisplay = () =>{
    setDisplay(display-1);
  }
return(   
<>
<h3>{display}</h3>
<button onClick={incrementDisplay}>Increase </button>
<button onClick={decrementDisplay}>Decrease </button>

 </>
  );
}

export default App;

