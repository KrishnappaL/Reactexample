import questions from "./components/questions";
import { useState } from "react";//because we want to use questions.js
function App() {
  const [questionIndex,setQuestionIndex]=useState(0);//take 0th index
  const [score,setScore]=useState(0);
  const replay=() =>{
    setQuestionIndex(0);
    setScore(0);
    setResults(false);
  }
  const [results,setResults]=useState(false);
  const present_question=questions[questionIndex];//questionIndex=0
  const get_Choice=(index)=>{
if(present_question.answer===index){
 // alert("Success,you got right answer")
 setScore(score+1);
}
const next_question=questionIndex+1;
if(next_question.length<questions.length){
  setQuestionIndex(questionIndex+1);
}
//else{
  //setResults(true);
//}
  };
  return (
    <div className="quiz_box">
      {results?(<> <h3>{score}</h3> <br/>
      <button onClick={replay}>play again</button></>):(<div className='quiz_question'>
        {present_question.question}
      <div className='quiz_box_options'> </div>

      <ul className='quiz_ul'>
        {present_question.options.map((option,i) =>{return <li className="quiz_li" onClick={()=>
        get_Choice(i)}>{option}</li>
               })}      
       </ul>
      </div>)}
      
    </div>
  );
}

export default App;
