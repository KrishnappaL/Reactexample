import './App.css';
import Sample from "./component/Sample" 
import Mobiles from "./component/Mobiles"
function App() {
const name="Lakshmi";
  return (
    <div className="App">
    <h1> Welcome to React </h1>
<h1> {name}	</h1> 
<h1> Check Sample.js </h1>
<Sample></Sample>
//properties concept 
<Mobiles brandname="Samsung" brandprice="1200"/>
<Mobiles brandname="Vivo" brandprice="10000"/>
<Mobiles brandprice="15000"/>

    </div>
  );
}

export default App;

